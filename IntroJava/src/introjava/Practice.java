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
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = read.nextLine();
        System.out.println("How old are you?");
        int age = read.nextInt();
        System.out.print("Hi " + name +", ");
        System.out.print("we know that you are " + age + " years old");
        
        System.out.println("");
    }
    
}
