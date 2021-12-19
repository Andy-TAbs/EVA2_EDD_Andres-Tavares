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
public class MyStack extends ListaStack {
  
    //Los elementos se agragan al final de la lista
    //Metodo Add de la lista --> Sin cambios
    //Solo podemos acceder a los elementos al inicio de la lista
    public int peek(int pos) throws Exception{//Regresa el valor del elemento al inicio de la lista
       int iTama = length();
       if(iTama == 0)
           throw new Exception("No ha valores almacenados en la lista");
           return get(pos - 1);
    }
    
    public int pop(int pos) throws Exception{//Regresa y elimina el elemento al inicio de la lista
        //Guardar el valor
        int iVal = get(pos -1);
        //Eliminamos el valor
        DeleteAt(pos -1);
        //Enviamos el valor
        return iVal;
    }
    
}

