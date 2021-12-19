/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack_tarea;

/**
 *
 * @author mague
 */
class NodoStack {
     private int dato;
    private NodoStack siguiente;
//Constructores 
    public NodoStack(){
        this.siguiente = null;
    }
    public NodoStack(int dato){
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

      public NodoStack getSiguiente() {
        return siguiente;
    }
      
    public void setSiguiente(NodoStack siguiente) {
        this.siguiente = siguiente;
    }

    
    
  
}
