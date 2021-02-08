/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

/**
 *
 * @author SAAVEDRA
 */
public class HW11RECURSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 123;
         
        System.out.println(sumaDigitos(number));
         
    }
     
    public static int sumaDigitos(int number){
         
        if(number < 10){ //caso base
            return number; //devuelvo el numero
        }else{
            return (number % 10) + sumaDigitos(number/10); //Cojo el digito y llamo a la funcion
        }
         
         
    }
 
}
    

    


