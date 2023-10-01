/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio16;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();

        int vector[] = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            int num = (int)(Math.random() * 10);
            vector[i] = num;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " "); 
        }
        
        buscarNumero(vector);
        
    }
    
    public static void buscarNumero(int vector[]){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("\n ¿Quá número desea buscar?");
        int num1 = read.nextInt();
        int x = 0;
        
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == num1) {
                x = x + 1;
            }   
        }  
        System.out.println("El número ingresado " + num1 + " sí está en el vector");
        System.out.println("El número se encuentra repetido " + x + " veces");
        
        System.out.print("El número se encuentra ubicado en la posicion: ");
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == num1) { 
                System.out.print(i + " ");
            }
        } 
    }
}
