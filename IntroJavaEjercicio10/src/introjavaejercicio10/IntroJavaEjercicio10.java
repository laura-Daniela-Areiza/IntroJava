/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio10;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                         
        Scanner read = new Scanner(System.in);
        
        int sum = 0; 
        int x = 0;
        
        System.out.println("Ingrese el valor límite");
        int limitNum = read.nextInt();
        
        do {
            System.out.println("Ingrese números");
            int num = read.nextInt();            
            
            if (num > limitNum) {
                System.out.println("El número ingresado es mayor al número limite");
            } else {
                sum = x + num;  
                x = sum;
                System.out.println("La suma hasta ahora es: " + x);
            }

        } while (sum < limitNum);
        
        System.out.println("Los número ingresados igualan al numero límite " + limitNum);
 
    }  
}
