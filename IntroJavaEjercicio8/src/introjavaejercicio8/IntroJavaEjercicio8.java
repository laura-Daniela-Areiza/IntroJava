/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio8;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = read.nextLine();
        int wordLength = word.length();
        if (wordLength >= 8 && wordLength <=8){
            System.out.println("CORRECTO");
        }else{
           System.out.println("INCORRECTO"); 
        }
    }
    
}
