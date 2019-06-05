package Main;

import Logica.Ej1;
import Logica.Ej10;
import Logica.Ej2;
import Logica.Ej3;
import Logica.Ej4;
import Logica.Ej5;
import Logica.Ej6;
import Logica.Ej7;
import Logica.Ej8;
import Logica.Ej9;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                Ej1 a = new Ej1();
                a.division();
                break;
            case 2: 
                Ej2 b= new Ej2();
                b.Arreglo();
                break;
            case 3:
                Ej3 c = new Ej3();
                c.ArregloNegativo();
                break;
            case 4:
                Ej4 d = new Ej4();
                d.abrirarchivo("archivo");
                break;
            case 5:
                Ej5 e = new Ej5();
                e.imprimir();
                break;
            case 6:
                Ej6 f = new Ej6();
                f.String();
                break;
            case 7:
                Ej7 g = new Ej7();
                g.clases();
                break;
            case 8:
                Ej8 h = new Ej8();
                h.Llamar();
                break;
            case 9:
                Ej9 i = new Ej9();
                i.Ingresarnum();
                
                break;
            case 10:
                Ej10 j = new Ej10();
                j.Ejecutar();
                break;
        }

        

    }

}
