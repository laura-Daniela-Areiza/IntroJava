/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio4;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        int cDegree = read.nextInt();
        int fDegree = 32+(9*cDegree/5);
        System.out.println("La temperatura ingresada equivale a " + fDegree + " grados Fahrenheit");
    }
    
}
