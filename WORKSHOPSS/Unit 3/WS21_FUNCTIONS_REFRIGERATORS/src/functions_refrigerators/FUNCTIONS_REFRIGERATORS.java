/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions_refrigerators;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class FUNCTIONS_REFRIGERATORS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("----- ELAM ÁLVAREZ---");
        int suma =0;
        int [] array = new int [5];
        Scanner ent = new Scanner (System.in);
        for (int i=0; i < 5; i++){
            
            System.out.println("Enter to Kwh of refrigerator " + i + " number: ");
            array[i] = ent.nextInt();
            suma += array[i];
        }
       
        }
        
    
}

