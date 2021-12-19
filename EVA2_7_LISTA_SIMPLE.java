/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mague
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UNA LISTA
        Lista miLista = new Lista();
       
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
         miLista.printList(); 
         System.out.println("Cantidad de nodos: "  + miLista.length());
       
         System.out.println("Despues de Insertar ");
         miLista.insertAt(4, 9999);
         miLista.printList();
         System.out.println("Despues de borrar ");
         miLista.DeleteAt(0);
         miLista.printList();
         
         
         for (int i = miLista.length()  -1; i >= 0; i--){
             try{
                 System.out.print(miLista.get(i) + " - ");
             }catch (Exception ex) {
                 ex.printStackTrace();
             }
         }
         
         
         /**  miLista.clear();
             * System.out.println("Despues del borrado");
             * miLista.printList();
             * miLista.add(new Nodo(1000));
             * miLista.add(new Nodo(2000));
             * System.out.println("");
             * miLista.printList(); */
       /* try {
            System.out.println("Posicion: " + miLista.get(10));
            
           
        } catch (Exception ex) {//Aquí se resuelve el error
            ex.printStackTrace();//Imprime el error
            Logger.getLogger(EVA2_7_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        } */
      //Seguir con el programa
      
       /* int[] miArreglo = new int[1000000];
        for (int i = 0; i <miArreglo.length; i++) {
            miArreglo[i] = (int)(Math.random() *1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo(i)); */
        }
    }
    

