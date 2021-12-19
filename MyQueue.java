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
public class MyQueue extends ListaQueue{
    //Los elementos se agragan al final de la lista
    //Metodo Add de la lista --> Sin cambios
    //Solo podemos acceder a los elementos al inicio de la lista
    public int peek() throws Exception{//Regresa el valor del elemento al inicio de la lista
        return get(0);
    }
    
    public int poll() throws Exception{//Regresa y elimina el elemento al inicio de la lista
        //Guardar el valor
        int iVal = get(0);
        //Eliminamos el valor
        DeleteAt(0);
        //Enviamos el valor
        return iVal;
    }
    
}
