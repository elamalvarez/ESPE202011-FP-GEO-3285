/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws1arraysinspection;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class WS1arraysInspection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner input = new Scanner(System.in);
 Scanner sn = new Scanner(System.in);
        boolean leave = false;
        int option;
       
        
        while (!leave) {
            System.out.println("1. The emlements of 5 ");
            System.out.println("2. promediun arrangement");
            System.out.println("3.  element of the array{12,23,34,98,87,65,0}");
            System.out.println("4. exit");
               
            try {
 
                System.out.println("Chose option");
                option = sn.nextInt();
                   
                switch (option) {
                    // No se necesita case
                    case 1:
                        System.out.println("Enter the element1-> ");
                        int whole1= sn.nextInt();
                        System.out.println("Enter the element 2-> ");
                        int whole2= sn.nextInt();
                        System.out.println("Enter the element 3-> ");
                        int whole3= sn.nextInt();
                        System.out.println("Enter the element 4-> ");
                        int whole4= sn.nextInt();
                        System.out.println("Enter the element 5-> ");
                        int whole5= sn.nextInt();
                        
                        int sum= addNumber(whole1,whole2,whole3,whole4,whole5);
                                                
                        System.out.println("The addition of the array is-> "+sum);
                        break;
         case 2:
                        System.out.println("Enter the float 1-> ");
                        String n1= sn.next();
                        float float1=  Float.parseFloat(n1);
                        
                        System.out.println("Enter the float-> ");
                        String n2= sn.next();
                        float float2=  Float.parseFloat(n2);
                        System.out.println("Enter the float-> ");
                        String n3= sn.next();
                        float float3=  Float.parseFloat(n3);
                        
                        float promed= averageNumber(float1,float2,float3);
                        System.out.println("The promedium of 5 elements is -> "+promed);
        
                        break;
                    case 3: //no dice nad, si esta o nao esta 
                        System.out.println("Enter elements look-> ");
                        int enterob= sn.nextInt();
                        findArray(enterob);
                                             
                        
                        
                        break;
                    
                    case 4:
                        System.out.println("exit");
                        leave = true;
                        break;
                    
                    default:
                        System.out.println("Only numbers between 1 and 3");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sn.next();
            }
          System.out.println(" ");
        
        }
 
    }
    static int addNumber(int entero1,int entero2,int entero3,int entero4,int entero5)
    {
        int [] array= {entero1,entero2,entero3,entero4,entero5};
                        int sum=0;
                        for(int i=0;i<array.length;i++)
                        {
                            sum= sum+array[i];
                        }
                        return sum;
    }
    static float averageNumber(float float1,float float2,float float3)
    {
        float [] arrf= {float1,float2,float3};
                        float promed;
                        float sum1=0;
                        for(int i=0;i<arrf.length;i++)
                        {
                            sum1= sum1+arrf[i];
                            
                        }
                        promed=sum1/3;
                        return promed;
    }
    static void findArray(int enterob)
    {
        int [] arrb= {12,23,34,98,87,65,0};
                        
                        for(int i=0;i<arrb.length;i++)
                        {
                            if(arrb[i]==enterob)
                            {
                                System.out.println("the element total is> "+arrb[i]);
                                
                            }
                           
                            
                            
                        }
                        
    }
   }
    
    

