/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.espe.edu.ecController;

/**
 *
 * @author SAAVEDRA
 */
public class Searcher {
public int     findInteger(int [] elements, int x){
        int n = elements.length;
        int i;
        for ( i =0; i<n; i++){
            if (elements [i]==x){
                return i;
            }
        }
return -1;
}
}