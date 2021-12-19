/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author mague
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + factorial(5));
    }
    
    public static int factorial(int iVal){//Factorial usando recursivodad
        if(iVal == 0){//Detenemos la recursividad
            return 1;
        }else{    
        return iVal * factorial(iVal - 1);//Ejecutamos la recursividad
        }
       
        }
    
    public static int factorialfor(int iVal){//Factorial usando un ciclo for
        int iTemp = 1;
        for (int i = iVal; i > 0; i--) {
            iTemp = iTemp * i;
        }
        return iTemp;
    }
}
