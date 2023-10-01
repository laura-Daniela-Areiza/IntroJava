/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio5;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double num = read.nextDouble();
        double numDouble = num*2;
        double numTriple = num*3;
        double numSqrt = Math.sqrt(num);
        System.out.println("El doble del número ingresado es: " + numDouble);  
        System.out.println("El triple del número ingresado es: " + numTriple);
        System.out.println("La raiz cuadrada del número ingresado es: " + numSqrt);
    }
    
}
