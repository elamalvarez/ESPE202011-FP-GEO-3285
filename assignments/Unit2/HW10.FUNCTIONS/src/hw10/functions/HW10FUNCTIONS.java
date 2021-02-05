/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author SAAVEDRA
 */
public class HW10FUNCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================================");
        System.out.println(" Elam Álvarez");
        System.out.println("=================================================");       
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;
        float quotient;
        int date1 = 0;
        int date2= 0;
        int top=0;
        int product=0;
        int table=0;
      
        //call to divideTwonumbers()Functions
        System.out.println("Enter to date of dividend-->");
        dividend=input.nextInt ();
        System.out.println("Enter to date of divisor-->");
        divisor=input.nextInt ();
        quotient= divideTwonumbers(dividend, divisor);
        
        System.out.println("Quotient of" + dividend + "and" + divisor +"is ->" + quotient);
        
        
     System.out.println("==========================");
        System.out.println("Write the date of date1");
        date1=input.nextInt ();
        date2 = f(date1);
        System.out.println("date2 value: " + date1 + "^2--> " + date2);
        
         
        System.out.println("Write the date of date1");
        date1=input.nextInt ();
        date2 = f(date1);
        System.out.println("date2 value: " + date1 + "^2--> " + date2);
          
        
        System.out.println("Write the date of date1");
        date1=input.nextInt ();
        date2 = f(date1);
        System.out.println("The square of" + date1 + " is equal to  " + date2);
        
         System.out.println("=================================================");          
    System.out.println("Write the number of NUM1 -->");
    date1=input.nextInt (); 
    date2 = g(date1);
    System.out.println("NUM2 value: NUM2 = " + date1 + " * " + date1 + " + 2 * " + date1 + " + 1--> date22 = " + date2);

System.out.println("=================================================");
    System.out.println("Write the number of top-->");
    top=input.nextInt ();
    System.out.println("Write the number of table-->");
    table=input.nextInt ();   
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println(+ table + " * " + j + " = " + product);
    }
System.out.println("=================================================");
System.out.println("[ BYE MY FRIEND]"); 
System.out.println("=================================================");
    }
    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int date1) {
        
        int date2 = 0;
        date2 = date1 * date1;

        return date2;
    }

    public static int g(int date1) {
     
        int date2 = 0;
        date2 = date1 * date1 + 2 * date1 + 1;

        return date2;
    }
     public static int tablemulriplication() {   
    System.out.println("=================================================");
        
        
        
     }
}



   
