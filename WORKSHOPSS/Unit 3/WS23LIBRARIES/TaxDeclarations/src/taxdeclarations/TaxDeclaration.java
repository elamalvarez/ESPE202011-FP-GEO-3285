/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclarations;

import c.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentage = 12;
        
       
       Scanner input = new Scanner (System.in);
       
       System.out.println(" ELAM ALVAREZ TAXES");
       System.out.println(" IVA -->");
       System.out.println(" ENTER THE PRICE OF YOURS PRODUCTS");
       price = input.nextFloat();
       
      ivaValue = BasicTax.computeIva(price, ivaPercentage);
        totalPrice = price + ivaValue;
        
        System.out.println("total price -> " + totalPrice);
        
        
    }
    

       
       
       
    }
    

