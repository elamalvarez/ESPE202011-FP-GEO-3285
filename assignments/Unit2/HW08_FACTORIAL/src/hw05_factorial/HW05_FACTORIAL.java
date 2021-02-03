/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05_factorial;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class HW05_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long factorial=1;
        int num;
        int stop=15;
        Scanner numero = new Scanner(System.in);
        System.out.print("Please enter to number: ");
        num = numero.nextInt();
        System.out.println("0 to exit --> ");
        Scanner input = new Scanner (System.in);
        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
        
    }
}
    
    

