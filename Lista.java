/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

/**
 *
 * @author mague
 */
public class Lista { //LISTA SIMPLEMENTE ENLAZADA (LINKED LIST)
   private Nodo inicio;//Acceso a mi lista, punto de partida
    private Nodo Fin;
    private int tama; //Cotador de nodos
    public Lista(){
        inicio = null;//Lista vacía
        Fin = null;
    }
    
    //Agregar Nodos
    public void add(int Valor){
        Nodo Nuevo = new Nodo(Valor);
       //Hay nodos en la lista?
       //No hay nodos
       if(inicio == null){//Lista vacia
           inicio =  Nuevo; //Conectamos el primer Nodo a la lista
           Fin = Nuevo;
           tama =0;
       }else{//Lista con nodos
           //Hay que movernos al final de la lista
           //usando TEMP, Nodo por Nodo hasta llergar al final
          /** Nodo temp = inicio;//aqui empezamos
           //WHILE
           while(temp.getSiguiente() != null){//Mientras temp != null nos vamos a mover
               temp = temp.getSiguiente();//mover temp al siguiente nodo
           }
           temp.setSiguiente(Nuevo);//conectamos al final de la lista al nuevo nodo */
           //agegar nodo al final de la Lista:
           Fin.setSiguiente(Nuevo);
           Fin = Nuevo; //Nos movemos al final de la lista
       }
       tama++;
       //Si hay nodos
    }
    //Imprimir la lista
    public void printList(){
           Nodo temp = inicio;//aqui empezamos
           //WHILE
           while(temp != null){//Mientras temp != null nos vamos a mover
               System.out.println(temp.getDato() + " - ");
               temp = temp.getSiguiente();//mover temp al siguiente nodo
           }
}
    public void clear(){ //Borramos todos los nodos de la lista
        inicio = null;
        Fin =null;
        tama=0;
    }
    
    //CONTAR LOS NODOS:
    public int length(){
      /*  int iCont =0;
         Nodo temp = inicio;//aqui empezamos
           //WHILE
           while(temp != null){//Mientras temp != null nos vamos a mover
               iCont++;
               temp = temp.getSiguiente();//mover temp al siguiente nodo
           }
           return iCont;*/
      return tama;
    }
    
    //La lista esta vacia: True, con nodos: False
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
        return false;
    }
    
    //RECUPERAR UN VALOR DE LA LISTA: 
    public int get(int Pos) throws Exception{
        //Verificacion
        //lISTA ESTA VACIA
        if(isEmpty()){
            throw new Exception("No hay valores almacenados en la lista");
        }else{ //POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS
           //pos tiene que estar entre 0 y N-1
           if((Pos < 0 ) || (Pos>= length()))//Si pos es menor a cero o pos es mayor o igual a N
        throw new Exception("El valor " + Pos + " no es una pocision valida en la lista");
        }
        
       
        
        Nodo temp = inicio;
        for (int i = 0; i < Pos; i++) {
            temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return temp.getDato();
    }
    
    public void insertAtBeginning(Nodo Nuevo){
        inicio.setSiguiente(inicio); //Primero conectamos el nuevo nodo a la losta
        inicio=Nuevo;//Cnectar la lista al nuevo nodo
    }
    
    public void insertAt(int Pos, int Valor){
        Nodo Nuevo = new Nodo(Valor);
        //Validar
        //Situaciones:
        //Insertar al inicio
        if(Pos==0){
            insertAtBeginning(Nuevo);
            
        }else{//Cualquier otro caso
            //Movernos al Nodo Previo a la posicion
            Nodo temp = inicio;
        for (int i = 0; i < (Pos-1); i++) {
           temp =  temp.getSiguiente();//mover a temp al siguiente nodo
        }
        //Reconectar
        temp.setSiguiente(Nuevo);
        
        }
        tama++;
    }
    
      public void DeleteAt(int Pos){
          int iTamaLista = length();//Obtengo el tamaño de la lista
        //Validar
        if (iTamaLista == 1){
            clear();
        }else{
        //Situaciones:
        //Insertar al inicio
        if(Pos==0){ //Borrar un Nodo al Inicio
            inicio = inicio.getSiguiente();
            
        }else{//Cualquier otro caso
            //Movernos al Nodo Previo a la posicion
            Nodo temp = inicio;
        for (int i = 0; i < (Pos-1); i++) {
           temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        //Falta Reconectar
                temp.setSiguiente(temp.getSiguiente());
           if(Pos ==(iTamaLista-1))//Verifico si es el ultimo nodo de la lista
       Fin= temp;
           
               }
        
    }
        tama--;
      }
}
