/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author SAAVEDRA
 */
public class BasicOperation {
    // addition, subtractio, division, multiplication
    
    public static float addTwonumbers (float addend1, float addend2){
        float sum = 0;
         sum = addend1 + addend2;
         return sum;
         
        
    }
    public static float subtracTwonumbers (float minuend, float subtraend){
        float subctract = 0;
         subctract = minuend - subtraend;
         return subctract;
         
    }
    public static float divideTwonumbers (float divisor, float dividend){
        float division = 0;
         division = divisor / dividend;
         return division;
}
    public static float multiplyTwonumbers (float multiplying, float multiplier){
        float product = 0;
         product = multiplying * multiplier;
         return product;
}
}
