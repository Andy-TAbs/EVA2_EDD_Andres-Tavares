/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_collections_;

import java.util.LinkedList;

/**
 *
 * @author mague
 */
public class EVA2_12_COLLECTIONS_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lISTA ENLAZADA --> lINKEDlIST
        LinkedList<Integer> linkedList = new LinkedList();
        /* <> Tipos de datos genericos
        
        */
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }
    
}
