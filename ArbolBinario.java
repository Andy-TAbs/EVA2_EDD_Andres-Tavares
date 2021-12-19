/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_b;

/**
 *
 * @author mague
 */
public class ArbolBinario {
    private NodoB root;

    public ArbolBinario() {
        this.root = null; //Arbol Vacío
    }
    
    //A PARTIR DE AQUÍ TODO ES RECURSIVO
    //AGREGAR UN NODO:
    public void add(int valor){
        NodoB nuevo = new NodoB(valor);
        //Verificar si hay nodos en la lista
        if(root == null){//Arbol Vacio
            root = nuevo;
        }else{//Hay nodos
            //Método recursivo para agregar nodos
            addRecu(root,nuevo);
        }
    }
    
    //Método recursivo (Nodo actual, nodo nuevo)
    private void addRecu(NodoB actual, NodoB nuevo){
       //Verificar el lado al que va el nodo
       if(nuevo.getDato() < actual.getDato()){//IZQ: Valor nuevo menor que nodo actual
           if(actual.getIzquierda() == null){//Tenemos espacio, aqui insertamos el nodo nuevo
               actual.setIzquierda(nuevo);
           }else{//Llamar de nuevo al método recursivo, pero moviendome a la izq.
               addRecu(actual.getIzquierda(), nuevo);
           }
       }else if(nuevo.getDato() > actual.getDato()){//Derecha
           if(actual.getDerecha() == null){//Tenemos espacio, aqui insertamos el nodo nuevo
               actual.setDerecha(nuevo);
           }else{//Llamar de nuevo al método recursivo, pero moviendome a la izq.
               addRecu(actual.getDerecha(), nuevo);
           }
       }else{// Valor igual al actual
           System.out.println("El valor ya existe en el arbol"); 
       }
    }
    
    //Imprimir nodos del arbol
    public void printPreOrder(){
        preOrder(root);//llama al metodo recursivo pre order
    }
    
    private void preOrder(NodoB actual){
        if(actual != null){
            System.out.print("[" + actual.getDato() + "]");//visit node
            preOrder(actual.getIzquierda()); //travers left side
            preOrder(actual.getDerecha()); //travers right site
        }
    }
    
     public void printPostOrder(){
        postOrder(root);//llama al metodo recursivo pre order
    }
    
    private void postOrder(NodoB actual){
        if(actual != null){
            postOrder(actual.getIzquierda()); //travers left side
            postOrder(actual.getDerecha()); //travers right site
            System.out.print("[" + actual.getDato() + "]");//visit node
        }
    }
      public void printInOrder(){
        inOrder(root);//llama al metodo recursivo pre order
    }
    
    private void inOrder(NodoB actual){
        if(actual != null){
            inOrder(actual.getIzquierda()); //travers left side
            System.out.print("[" + actual.getDato() + "]");//visit node
            inOrder(actual.getDerecha()); //travers right site

        }
    }
    
}
