/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.epe.du.ec.Controller;

/**
 *
 * @author SAAVEDRA
 */
public class Sorting {
    public int [] sortyBubbleSort (int[] countries){
        int n= countries.length;
        
        int temp;
        
        for (int i=0; i< n-1; i++){
            for ( int j=0; j < n - i - 1; j++){
             if (countries [j] > countries [j+1]){
                 
                 temp = countries[j];
                 countries[j]= countries [j +1];
                 countries [j+1]= temp;
                 
             }   
             System.out.print("Sorting--->");
            }
            System.out.println("");
        }      
             return countries;   
    }

    public String sortByBubbleSort(String country) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int[] sortByBubbleSort(String[] countries) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
