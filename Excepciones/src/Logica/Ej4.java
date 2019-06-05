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
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Estudiantes
 */
public class Ej4 {
    public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
    }catch (IOException ex) {

            System.out.println(ex);

     }catch(IllegalArgumentException e){
         System.out.println("El archivo no existe");
     }

}              
}
