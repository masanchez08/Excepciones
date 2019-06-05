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
public class Ej10 {
 
 public void Ejecutar(){
     try{
     Ej10_1 j1=new Ej10_1(); 
     Ej10_2 j2=(Ej10_2)j1;
 }catch(ClassCastException e){
         System.out.println("El intento de convertir un objeto a otra clase, no es válido.");
 }
}
}
