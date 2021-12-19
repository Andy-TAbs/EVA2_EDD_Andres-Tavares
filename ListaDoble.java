/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_doble;

/**
 *
 * @author mague
 */
public class ListaDoble {
    private NodoDoble inicio;
    private NodoDoble Fin;
    private int tama;

    public ListaDoble(){
        inicio = null;
         Fin = null;
        tama = 0;
    }
      public void add(int Valor){
           NodoDoble Nuevo = new NodoDoble(Valor);
       //Hay nodos en la lista?
       //No hay nodos
       if(inicio == null){//Lista vacia
           inicio =  Nuevo; //Conectamos el primer Nodo a la lista
           Fin = Nuevo;
           tama =0;
       }else{//Lista con nodos
            Fin.setSiguiente(Nuevo);
            Nuevo.setPrevio(Fin);
           Fin = Nuevo; 
       }
      }
        public void printList(){
           NodoDoble temp = inicio;//aqui empezamos
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
        int iCont =0;
         NodoDoble temp = inicio;//aqui empezamos
           //WHILE
           while(temp != null){//Mientras temp != null nos vamos a mover
               iCont++;
               temp = temp.getSiguiente();//mover temp al siguiente nodo
           }
           return iCont;
      //return tama;
    }
 public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
        return false;
    }
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
       
        NodoDoble temp = inicio;
        for (int i = 0; i < Pos; i++) {
            temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return temp.getDato();
    }
    
     public void insertAtBeginning(NodoDoble Nuevo){
        inicio.setSiguiente(inicio); //Primero conectamos el nuevo nodo a la losta
        inicio.setPrevio(Nuevo);
        inicio=Nuevo;//Cnectar la lista al nuevo nodo
    }
    
    public void insertAt(int Pos, int Valor){
        NodoDoble Nuevo = new NodoDoble(Valor);
        //Validar
        //Situaciones:
        //Insertar al inicio
        if(Pos==0){
          inicio = inicio.getSiguiente();
            
        }else{//Cualquier otro caso
            //Movernos al Nodo Previo a la posicion
            NodoDoble temp = inicio;
        for (int i = 0; i < Pos; i++) {
            temp=temp.getSiguiente();//mover a temp al siguiente nodo
        }
        //Reconectar
        //Primero conectamos el nuevo nodo
        Nuevo.setSiguiente(temp);
        Nuevo.setPrevio(temp.getPrevio());
        //Conectamos la lista al Nuevo Nodo
        temp.getPrevio().setSiguiente(Nuevo);
        temp.setPrevio(Nuevo);
        
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
            NodoDoble temp = inicio;
        for (int i = 0; i < Pos; i++) {
           temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        //Falta Reconectar
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
           if(Pos ==(iTamaLista-1))//Verifico si es el ultimo nodo de la lista
       Fin= temp;
           
               }
        
    }
        tama--;
      }
    
}
