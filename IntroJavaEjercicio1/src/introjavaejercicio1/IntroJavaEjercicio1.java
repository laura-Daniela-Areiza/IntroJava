/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio1;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número entero");
        int num2 = read.nextInt();
        System.out.println("La suma de los números ingresados es de: " + (num1 + num2));
    }
    
}
