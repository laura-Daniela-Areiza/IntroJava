/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio9;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = read.nextLine();
        String wordInitial = word.substring(0,1);
        if (wordInitial.equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
        }else{
           System.out.println("INCORRECTO"); 
        }
    }
    
}
