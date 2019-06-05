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
public class Ej8 {
  Ej8_1 e8=new Ej8_1();   

public void Llamar(){
    try{  
    e8.kk();
    }
    catch(UnsatisfiedLinkError e){
        System.out.println("No se puede acceder al método nativo.");
    }
    }
}
