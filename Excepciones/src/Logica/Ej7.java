
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
public class Ej7 {
    Class c7 =null;
 public void clases(){   
 try{
    c7=Class.forName("Exceptionclass7");
   

 }catch(ClassNotFoundException e){
    System.out.println(" No se es capaz de encontrar la definición de una clase de la que depende el programa para su funcionamiento");
 } 
}
}