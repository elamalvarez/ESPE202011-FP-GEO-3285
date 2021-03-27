/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.campodefutbol.pkgint;

import java.util.Scanner;
import static javax.management.Query.gt;

/**
 *
 * @author SAAVEDRA
 */
public class HWCampodefutbolInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a,b,c; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(“Primer número:”);
        a=teclado.nextInt();
        System.out.println(“Segundo número:”);
        b=teclado.nextInt();
        System.out.println(“Tercer número:”);
        c=teclado.nextInt();
       
        System.out.println(“Los números ordenados de mayor a menor son:”);  
        if(a&gt;=b &amp;&amp; b&gt;=c)
        {
           System.out.println(” ” +a+ ” ” +b+ ” ” +c+ “”);  
        }
        else if (a&gt;=c &amp;&amp; c&gt;=b)
        {
             
            System.out.println(” ” +a+ ” ” +c+ ” ” +b+ “”); 
        }
        else if (b&gt;=a &amp;&amp; a&gt;=c)
        {
             
            System.out.println(” ” +b+ ” ” +a+ ” ” +c+ “”); 
        }
        else if (b&gt;=c &amp;&amp; c&gt;=a)
        {
             
            System.out.println(” ” +b+ ” ” +c+ ” ” +a+ “”); 
        }
        else if (c&gt;=a &amp;&amp; a&gt;=b)
        {
             
            System.out.println(” ” +c+ ” ” +a+ ” ” +b+ “”); 
        }
        else
        {
              System.out.println(” ” +c+ ” ” +b+ ” ” +a+ “”);
        }
    }   
}
    
    

