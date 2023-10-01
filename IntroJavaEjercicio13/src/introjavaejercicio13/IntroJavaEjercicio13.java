/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio13;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el número de elemtos del cuadrado");
        int num = read.nextInt();
        
        String[][] cuadrado = new String [num][num];
        
        System.out.println("== Cuadrado Completo ==");
        llenarCuadradoCompleto(cuadrado, num);
        
        System.out.println("== Bordes del cuadrado ==");
        llenarBordesCuadradoC(cuadrado, num);
        
    }

    public static void llenarCuadradoCompleto(String[][] cuadrado, int num){
        
        //Llenar cuadrado
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) { 
            cuadrado[i][j] = "*";  
            }
        }
        
        //Imprimir cuadrado
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
            System.out.print(cuadrado[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void llenarBordesCuadradoC(String[][] cuadrado, int num){
        
        //Llenar cuadrado
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) { 
            cuadrado[i][j] = "*";  
            }
        }
        
        //Imprimir cuadrado
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                if (i == 0 || i == cuadrado.length - 1 || j == 0 || j == cuadrado.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
