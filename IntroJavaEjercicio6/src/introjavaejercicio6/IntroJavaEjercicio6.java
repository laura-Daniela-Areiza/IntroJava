/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio6;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = read.nextInt();
        if (num%2 == 0){
            System.out.println("El número ingresado es par");
        }else {
            System.out.println("El número ingresado es impar");
        }
    } 
}
