/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ej9 {
    
 
    
    public void Ingresarnum(){
        
        
        
      Scanner n = new Scanner(System.in);
      int a;
      do{
           try{
                 System.out.print("Introduce un número entero mayor a cero: ");
                 a = n.nextInt();
                 System.out.println("Número introducido: " + a);
          }catch(InputMismatchException e){
                       n.nextLine();
                       a = 0;
                       System.out.println("Debe introducir un número entero " + e.toString());
          }
      }while(a<=0 );
        
        
        
        
    }
            
    
    }


