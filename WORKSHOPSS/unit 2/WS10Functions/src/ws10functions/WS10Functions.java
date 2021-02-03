/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @author SAAVEDRA
 */
public class WS10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int divd=5;
        int divr=10;
        float qoutient=0;
        int x=0;
        int y=0;
        
        
        // CALL TO DIVIDE TWO NUMBERS () FUNCTION
        
        qoutient=divideTwonumbers(5,10);
        System.out.println("Qoutient of 5 and 10 is -->" + qoutient); // result 0.5 or?
        
        y = f(3);
        System.out.println("3^2 -> " + y);

        y = f(-3);
        System.out.println("-3^2 -> " + y); //9
        
        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);
        
        
        
                
    }
    // FUNCTION DEFINITION
  // RETURN DATE TYPE   NAME    PARAMATER 1    PARAMATER 2
    public static float divideTwonumbers (int dividend, int divisor){
        // BODY OF FUNCTION 
        float qoutient=0.0F;
        
         //             5        10   -> 0.5
        // float     int        int
        qoutient=(float) dividend / (float) divisor;
        
        return qoutient;
    }
public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}
  