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
class NodoB {
     private int dato;
    private NodoB Izquierda;
    private NodoB Derecha;
    
    
//Constructores 
    public NodoB(){
        this.Izquierda = null;
        this.Derecha = null;
    }
    public NodoB(int dato){
        this.dato=dato;
        this.Izquierda = null;
        this.Derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoB getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(NodoB Izquierda) {
        this.Izquierda = Izquierda;
    }

    public NodoB getDerecha() {
        return Derecha;
    }

    public void setDerecha(NodoB Derecha) {
        this.Derecha = Derecha;
    }
    
  

    
    
  
}
