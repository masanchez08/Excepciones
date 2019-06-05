/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Ej2 {
    public void Arreglo(){
        int array []= {1,2,3,4,5};
        try{
            System.out.println(array[-1]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dato invalido, se requiere un valor que no exceda los limites del arreglo inicializado");
             
            
        }
        
    
}
    
}
