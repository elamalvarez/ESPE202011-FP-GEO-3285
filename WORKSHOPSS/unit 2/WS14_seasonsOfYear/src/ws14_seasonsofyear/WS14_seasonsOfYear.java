/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws14_seasonsofyear;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class WS14_seasonsOfYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] eggsBycoop;
        String [] Chickens = { "Maria", "Mauricia", "pepona"};
        float [] WeightsBycoop = { 1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter to name of coops --> ");
        n = input.nextInt();
        
        eggsBycoop = new int [n];
       // Chickens = new String[20];
        WeightsBycoop = new float [n];
        
      //  eggsBycoop[0] = 7;
        // eggsBycoop[1] = 9;
      //  eggsBycoop[2] = 3;
      //  eggsBycoop[3] = 9;
      //  eggsBycoop[4] = 8;
        
      for (int i = 0; i < n; i++){
          System.out.print("Enter the number of eggs of the coop" + (i+1));
          eggsBycoop[i] = input.nextInt();
      }
      
      for (int eggs : eggsBycoop){
          System.out.println("egss of coop are " + eggs);
      }
       for (int i = 0; i < n; i++){
          System.out.println(" eggs of the coop" + (i+1) + "--> " + eggsBycoop[i]);
        
    }
    for (String chicken : Chickens) {
            System.out.println("chicken name -> " + chicken);
        }
        
        for (int i = 0; i < weightsBycoop.length ; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + WeightsBycoop[i]);
        }
}
    }
