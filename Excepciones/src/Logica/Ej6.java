/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author USUARIO
 */
public class Ej6 {

    public void String() {
      
        try {
            String Str;
            System.out.println(Str);
        } catch (RuntimeException e) {
            System.out.println("La variable no se ha inicializado");
        }

    }
}
