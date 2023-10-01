/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio3;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        String uppercaseStr = frase.toUpperCase();
        String lowercaseStr = frase.toLowerCase();
        System.out.println(uppercaseStr);
        System.out.println(lowercaseStr);
    }
    
}
