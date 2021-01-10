/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.perimetrodecanchaprofesrional.pkgfloat;

/**
 *
 * @author SAAVEDRA
 */
public class HWPerimetrodecanchaprofesrionalFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float perimeter;
        float side1;
        float side2;
        float side3;
        float side4;
        
        side1 = 68.99f;
        side2 = 110.11f;
        side3 = 68.99f;
        side4 = 110.11f;
        
        // operation
        perimeter = side1 + side2 + side3 + side4;
        
        System.out.println("The perimeter of a football american is " + side1 + "+" + side2 + "+" + side3 + "+" + side4 + " is equal to --> " + perimeter);
       
    }
    
}
