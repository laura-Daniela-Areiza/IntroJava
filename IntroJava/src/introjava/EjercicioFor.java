/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor.
 */
public class EjercicioFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num =0;
        int x = 4;
        
        do { 
            System.out.print("Ingrese un número: ");
            num = read.nextInt();
            x = x-1;
            
            if (num > 0 && num < 21){
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {  
                    System.out.print("*");
                }
                System.out.println("");
                
            } else {
                System.out.println("Numero incorrecto");
            }
            
        } while (x > 0);            
    }
}