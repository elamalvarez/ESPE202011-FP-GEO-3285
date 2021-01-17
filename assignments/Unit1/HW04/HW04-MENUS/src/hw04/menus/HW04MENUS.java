/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04.menus;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class HW04MENUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> area rectangle ");
            System.out.println("2. -> area square");
            System.out.println("3. -> absolute value ");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
               
                 int side1;
                 int side2;
                 int arear;
                    System.out.println("enter side 1 -> ");
                    side1 = input.nextInt();
                    System.out.println("enter side 2 -> ");
                    side2 = input.nextInt();
                    arear = side1 + side2;
                    System.out.println(" the area is -->  " + arear );
                 break;
                 
                 case 2:
                 int sidex;
                 int sidey;
                 int areac;
                    System.out.println("enter side x -> ");
                    sidex = input.nextInt();
                    System.out.println("enter side y -> ");
                    sidey = input.nextInt();
                    areac = sidex * sidey;
                    System.out.println(" the areac is --> " + areac) ;
                 break;
                 
                 case 3:
                     int va1;
                     int va2;
                     int va;
                     
                     System.out.println("enter va1 -> " );
                     va1 = input.nextInt();
                     System.out.println("enter va2 -> " );
                     va2 = input.nextInt();
                     va= va1 % va2;
                     System.out.println("absolute value is --> " + va);
                 case 4:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            
            }

        } while (option != 5);

        }
    }
    

            

        

        
             
                
        
    
    

