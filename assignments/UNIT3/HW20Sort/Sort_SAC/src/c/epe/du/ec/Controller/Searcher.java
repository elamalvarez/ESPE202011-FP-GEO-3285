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

    public String findInteger(String[] integers, String dataToFind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

