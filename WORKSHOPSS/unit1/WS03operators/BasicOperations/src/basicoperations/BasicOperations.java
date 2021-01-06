/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author SAAVEDRA
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variable declaration
        int sum;
        int addend1;
        int addend2;
       int minuend;
       int subtrahend;
       int diference;
       int multiplier;
       int multiplying;
       int product; 
       int dividing;
       int divider;
       int quotient;
       int dividingg;
       int dividierr;
       int module;
       
               
       minuend = -23;
       subtrahend = -6;
       
       multiplier = 5;
       multiplying = 3;
       
       dividing = 10;
       divider = 5;
       
       dividingg = 8;
       dividierr = 4;
       
               
        // initilization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + "+" + addend2 + "is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
        sum++;
        System.out.println("sum is equal to-->" + sum);
        
        System.out.println("adding one to sum" + (sum++));
        
        System.out.println("adding one to sum" + ((++sum)));
        
        System.out.println("the subtraction of" + minuend + " - " + subtrahend + "is equal to" + (minuend - subtrahend));
        
        System.out.println(" the multiplication of" + multiplying + " * " + multiplier + " is equal to" + (multiplying * multiplier));
        
        System.out.println("the division of" + dividing + " / " + divider + "is equal to" + (dividing / divider));
        
       System.out.println("the module of" + dividingg + " % " + dividierr + "is equal to" + (dividingg % dividierr));
        
      
               
        
        
        
       
        
    }
    
}
