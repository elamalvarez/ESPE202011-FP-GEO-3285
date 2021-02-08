/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11;

/**
 *
 * @author SAAVEDRA
 */
public class WS11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int divd =  5 ;
        int divr =  10 ;
        cociente flotante =  0 ;
        int x =  0 ;
        int y =  0 ;

        // llamada a la función divideTwoNumbers ()
        cociente = dividirDosNúmeros (divd, divr);

        Sistema . fuera . println ( "El cociente de 5 y 10 es -> "  + cociente); // 0.5 o?

        y = f ( 3 );
        Sistema . fuera . println ( " 3 ^ 2 -> "  + y);

        y = f ( - 3 );
        Sistema . fuera . println ( " -3 ^ 2 -> "  + y); // 9

        x =  - 1 ;
        y = f (x);
        Sistema . fuera . println ( " el cuadrado de -> "  + x +  " <- es igual a -> "  + y);

        int número =  5 ;
        int hecho =  0 ;
        hecho = factorial (número);
        Sistema . fuera . println ( " factorial de "  + número +  " es igual a -> "  + hecho);

    }

    // definición de función
    // devuelve el nombre del tipo de datos parámetro1 parámetro2
    public  static  float  divideTwoNumbers ( int  dividend , int  divisor ) {
        // cuerpo de la función
        cociente flotante =  0.0F ;

        //              5 10 -> 0,5
        // flotar int int
        cociente = ( float ) dividendo / ( float ) divisor;

        cociente de retorno ;
    }

    public  static  int  f ( int  x ) {
        int y =  0 ;

        y = x * x;

        return y;
    }

    public  static  int  g ( int  x ) {
        int y =  0 ;

        y = x * x +  2  * x +  1 ;

        return y;
    }

    public  static  int  factorial ( int  n ) {
        si (n <  0 ) {
            int retorno = 0;
            int name = retorno  - 1;
        }
más {
            si (n ==  0 ) {
                return  1 ;
            } más {
                return (n * factorial (n -  1 ));
            }
        }
    }

    private static void si(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
    

