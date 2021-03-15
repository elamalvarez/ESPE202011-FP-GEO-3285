/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulecalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author SAAVEDRA
 */
public class ModuleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter two number --->");
    
    operand1 = input.nextFloat();
    operand2 = input.nextFloat();
    
     System.out.println("---Addition---");
    result= BasicOperation.addTwonumbers(operand1,operand2);
    System.out.println(operand1 + "+" + operand2 + "=" + result);
    
     System.out.println("---Subtraction---");
    result= BasicOperation.subtracTwonumbers(operand1,operand2);
    System.out.println(operand1 + "-" + operand2 + "=" + result);
    
    System.out.println("---Division---");
    result= BasicOperation.divideTwonumbers(operand1,operand2);
    System.out.println(operand1 + "/" + operand2 + "=" + result);
    
    System.out.println("---multiplication---");
    result= BasicOperation.multiplyTwonumbers(operand1,operand2);
    System.out.println(operand1 + "*" + operand2 + "=" + result);
    
    }
    
}
