/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número entero");
        int num2 = read.nextInt();
        
        if (num1 > 25 || num2 >25) {
            System.out.println("Uno de los números ingresados es mayor a 25");
        }else {
              System.out.println("Ninguno de los numeros ingresado son mayores que 25");
        }
    }    
}
