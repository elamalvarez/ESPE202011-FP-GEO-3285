/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14_seasonsofyear;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class HW14_seasonsOfYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] SeasonsOfYear;
        String [] Seasons = { "Winter", "Summer", "Fall", "Spring"};
        float [] MonthsThatLasts= { 3F, 3F, 3F, 3F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter to name of Seasons--> ");
        n = input.nextInt();
        
        SeasonsOfYear = new int [n];
       // Seasons = new String[10];
        MonthsThatLasts = new float [n];
        
        for (int i = 0; i < n; i++){
          System.out.print("Enter the months of seasons " + (i+1));
          SeasonsOfYear[i] = input.nextInt();
      }
      
      for (int seasons : SeasonsOfYear){
          System.out.println("seasons of year" + seasons);
      }
       for (int i = 0; i < n; i++){
          System.out.println(" Months of seasons" + (i+1) + "--> " + MonthsThatLasts[i]);
        
    }
    for (String Seasons : Seasons){
            System.out.println("seasons name -> " + Seasons);
        }
        
        for (int i = 0; i < MonthsThatLasts.length ; i++) {
            System.out.println("Month of year " + (i + 1) + " -> " + MonthsThatLasts[i]);
    }
    
}
}
