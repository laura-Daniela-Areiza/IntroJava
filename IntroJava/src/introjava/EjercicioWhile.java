/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
/**
 *
 * @author dani_
 */
public class EjercicioWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Por favor, ingrese una nota");
        int nota = read.nextInt(); 
               
       if (nota >=0 && nota <=10){
           
            System.out.println("Nota correcta");
        }
         
        while ( nota<0 || nota>10 ){
        System.out.println("La nota ingresada es incorrecta. Por favor, ingrese una nota");
        nota = read.nextInt();    
            if (nota >=0 && nota <=10){
                System.out.println("La nota ingresada es correcta");
            }   
        }
    }
     
}