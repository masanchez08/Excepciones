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
public class Ej3 {
    public void ArregloNegativo(){
        
      try{
            int[ ] Array = new  int[-6];
        System.out.println(Array);
    }catch(NegativeArraySizeException e){
          System.out.println("El tamaño del arreglo se definió negativo");
    }
    }
}
