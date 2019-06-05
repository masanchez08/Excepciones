
package Logica;

/**
 *
 * @author USUARIO
 */
public class Ej1 {
    public void division (){
        
        int a=6;
        int b=0;
        try{
        int division= a/b;
        } catch(ArithmeticException e ){
            System.out.println("El denominador no puede ser cero.");
            
        }
    }
    
    
}
