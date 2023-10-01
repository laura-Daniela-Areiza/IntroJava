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
public class EjercicioFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");        
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        EsMultiplo(num1, num2);
        
    }
    
    public static void EsMultiplo(int num1, int num2){
        
        if (num2 != 0 && num1%num2 == 0) {
            System.out.println("El número " + num1 + " SI es múltiplo del número " + num2);
        }else{
            System.out.println("El número" + num1 + " NO sí es múltiplo del número " + num2);
        }
    }
}
