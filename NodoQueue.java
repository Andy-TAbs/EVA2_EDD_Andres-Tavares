/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author mague
 */
class NodoQueue {
     private int dato;
    private NodoQueue siguiente;
//Constructores 
    public NodoQueue(){
        this.siguiente = null;
    }
    public NodoQueue(int dato){
        this.dato=dato;
        this.siguiente = null;
    }
    
    //get y set
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

      public NodoQueue getSiguiente() {
        return siguiente;
    }
      
    public void setSiguiente(NodoQueue siguiente) {
        this.siguiente = siguiente;
    }

    
    
  
}
