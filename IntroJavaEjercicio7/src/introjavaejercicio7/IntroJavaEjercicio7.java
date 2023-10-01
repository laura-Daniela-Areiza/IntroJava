/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio7;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = read.nextLine();
        if (word.equalsIgnoreCase("Eureka")){
        System.out.println("La palabra ingresa es correcta");
        }else {
            System.out.println("La palabra ingresa es incorrecta"); 
        }
    } 
}
