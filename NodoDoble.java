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
class NodoDoble {
     private int dato;
    private NodoDoble siguiente;
    private NodoDoble previo;
    
    
//Constructores 
    public NodoDoble(){
        this.siguiente = null;
        this.previo = null;
    }
    public NodoDoble(int dato){
        this.dato=dato;
        this.siguiente = null;
        this.previo = null;
    }
    
    public NodoDoble getPrevio() {
        return previo;
    }

    //get y set
    public void setPrevio(NodoDoble previo) {    
        this.previo = previo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

      public NodoDoble getSiguiente() {
        return siguiente;
    }
      
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    
    
  
}
