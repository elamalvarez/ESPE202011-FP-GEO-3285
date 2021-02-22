/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q01_02222021arrays;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class Q01_02222021Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total0fPlayers = 0;
        String [] players;
        float goalAverages;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Please enter the amount of players you wnat to record --> ");
        total0fPlayers = scanner.nextInt();
        
        players = new String [total0fPlayers];
        goalAverages = new float [total0fPlayers];
        
        for(int i = 0; i < total0fPlayers; i++) { 
            System.out.print("Please enter the name of player #" + i + "-->");
            players[i] = scanner.nextLine();
            System.out.print("please enter " + players [i] + "goal average --> ");
            goalAverages[i] = scanner.nextFloat();
            
        }
        
        System.out.print("Player --->   \t " + goalAverages );
        for(int i = 0; i < total0fPlayers; i++) { 
        System.out.println(players [i] + "--> \t " goalAverages[i]);
        
        
    }
    
}
}

