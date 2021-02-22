/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class QUIZZ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] CNE;
        String [] Candidates = { "ARAUZ", "LASSO", "YAKU","GUTIERRES", "CELI"};
        float [] Percentage = { 32.7F, 19.7F, 19.3F, 1.7F, 1.1F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter to name of Candidates --> ");
        n = input.nextInt();
        
        CNE = new int [n];
       
        Percentage = new float [n];
        
        
      for (int i = 0; i < n; i++){
          System.out.print("Enter the number of candidates" + (i+1));
          CNE[i] = input.nextInt();
      }
      
      for (int candidates : CNE){
          System.out.println("candidatos of " + candidates);
      }
       for (int i = 0; i < n; i++){
          System.out.println(" CANDIDATES" + (i+1) + "--> " + CNE[i]);
        
    }
    for (String Cadidates : Candidates) {
            System.out.println("Candidate name -> " + Arrays.toString(Candidates));
        }
        
        for (int i = 0; i < Percentage.length ; i++) {
            System.out.println("Percentage " + (i + 1) + " -> " + Percentage[i]);
        }
}
    }

    
    

