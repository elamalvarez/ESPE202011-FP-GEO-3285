/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class WS13TASK {

    /**
     * @param args the command line arguments
     */
   
     static double areaCirculo(int r){
     double PI=3.1416;
      return  PI * Math.pow(r,2);
      }
     static int areatriangulo(int a, int b){
     return (a*b)/2;
     }
     static int areatrapecio (int B , int b , int h){
  
     return ((B+b)/2)*h;
     }

 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int opcion=0;
  do{
   System.out.println();
   System.out.println();
  System.out.println(" ======== MENU DE OPCIONES ========= ");
  System.out.println(" ___________________________________ ");
  System.out.println(" ======== 1. Circle       ========= ");
  System.out.println(" ======== 2. Triangle     ========= ");
  System.out.println(" ======== 3. Trapeze      ========= ");
  System.out.println(" ___________________________________ ");
  System.out.println(" Ingrese una opcion ");
  opcion = teclado.nextInt();
  switch (opcion){
  
        case 1:
          System.out.println("Ingrese el radio ");
         int radio = teclado.nextInt();
           System.out.println(" The area of circle is :"+ areaCirculo(radio));
          break;
        case 2:
         System.out.println(" Ingrese la base ");
         int base = teclado.nextInt();
         System.out.println(" Ingrese la altura ");
         int altura = teclado.nextInt();
         
         System.out.println(" The area of triangle is :"+areatriangulo(base,altura));
             break;
             
        case 3:
         System.out.println("INGRESE LA BASE MAYOR");
         int base_ma=teclado.nextInt();
         System.out.println("INGRESE LA BASE MENOR");
         int base_me=teclado.nextInt();
         System.out.println("INGRESE LA ALTURA");
         int altura_t=teclado.nextInt();
         System.out.println(" The area of trapeze is  :"+areatrapecio(base_ma,base_me,altura_t));
           break;

  }
 
  }while(opcion!=4);
 }
    
}
