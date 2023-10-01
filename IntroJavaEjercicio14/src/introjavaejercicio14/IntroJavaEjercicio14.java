/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio14;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        double cantEuro = 0;
        
        System.out.println("Bievenido a nuestro conversor de divisas. \n");
        System.out.println("¿Cuantos valores desea convertir?");
        int num = read.nextInt();

        double dinero[] = new double[num];
        
        System.out.println("Ingrese todos los valores de Euros que desea convertir");
        for (int i = 0; i < dinero.length; i++) {
            cantEuro = read.nextDouble();  
            dinero[i] = cantEuro;
        }
        
        System.out.println("¿A qué moneda desea convertir los Euros? \n Por favor responda: \n D: Dolares \n Y: Yenes\n L: Libras");
        String rta = read.next();
        
        switch(rta){
            case "D":
                convertirDolares(dinero);
                break;
            case "Y":
                convertirYenes(dinero);
                break;
            case "L":
                convertirLibras(dinero);
                break;   
        }
    }
    
    public static void convertirDolares(double dinero[]){
        
        double valorDolar = 1.28611;
        
        for (int i = 0; i < dinero.length; i++) {
            dinero[i] = dinero[i] * valorDolar;
            System.out.println(dinero[i] + " equivalen a " + dinero[i] + " dolares.");
        }
    }
    
    public static void convertirYenes(double dinero[]){
        
        double valorYenes = 129.852;
        
        for (int i = 0; i < dinero.length; i++) {
            dinero[i] = dinero[i] * valorYenes;
            System.out.println(dinero[i] + " equivalen a " + dinero[i] + " yenes.");
        }
    }
    
    public static void convertirLibras(double dinero[]){
        
        double valorLibras = 0.86;
        
        for (int i = 0; i < dinero.length; i++) {
            dinero[i] = dinero[i] * valorLibras;
            System.out.println(dinero[i] + " equivalen a " + dinero[i] + " libras.");
        }
    }
    
}
