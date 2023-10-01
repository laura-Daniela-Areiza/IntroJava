/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio17;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el número de elementos del vector");
        int numE = read.nextInt();
        
        int vector[] = new int[numE];
        
        //llenar vector
        for (int i = 0; i < vector.length; i++) {
            int num = (int)(Math.random()*100000);
            vector[i] = num;   
        }
        
//        //mostrar vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        
        System.out.println("Hubo " + esUnDigito(vector)+ " números de un digito en este vector");
        System.out.println("Hubo " + esDosDigitos(vector)+ " números de dos digitos en este vector");
        System.out.println("Hubo " + esTresDigitos(vector)+ " números de tres digitos en este vector");
        System.out.println("Hubo " + esCuatroDigitos(vector)+ " números de cuatro digitos en este vector");
        System.out.println("Hubo " + esCincoDigitos(vector)+ " números cinco digitos en este vector");
        
    }
    
    public static int esUnDigito(int vector[]){
       
        int num1 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            
            if (num >0 && num <10 ) {
                num1= num1 + 1;
            }   
        }
        
        return num1;
    }
    
    public static int esDosDigitos(int vector[]){
       
        int num2 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            
            if (num >9 && num <100 ) {
                num2 = num2 + 1;
            }
        }
        
        return num2;
        
    }
    
    public static int esTresDigitos(int vector[]){
       
        int num3 = 0;
  
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            
            if (num >99 && num <1000 ) {
                num3 = num3 + 1;
            }
        }
        
        return num3;
        
    }
    
    public static int esCuatroDigitos(int vector[]){
       
        int num4 = 0;
  
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            
            if (num >999 && num <10000 ) {
                num4 = num4 + 1;
            }
        }
        
        return num4;
        
    }
    
    public static int esCincoDigitos(int vector[]){
       
        int num5 = 0;
  
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            
            if (num >9999 && num <100000) {
                num5 = num5 + 1;
            }
        }
        
        return num5;
        
    }
}
