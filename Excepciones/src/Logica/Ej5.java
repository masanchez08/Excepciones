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
public class Ej5 {
    public void imprimir(){
        String str=null;
        
    try{ System.out.println(str.length());
    }catch(NullPointerException e){
           System.out.println("Se esta intentando acceder a un miembro de un objeto para el que todavía no se ha reservado memoria.");
    }
}
}
