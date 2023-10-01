/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
public class EjercicioDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        int sum = 0;
        int contador = 5;
                         
        do {
            contador--;
            System.out.println("Ingrese un número");
            num = read.nextInt();
            
            if (num == 0){
                System.out.println("Se capturó el número cero"); 
            }

            if (contador == 0){
                System.out.println("Se acabó el número de intentos");
            }
            
            if (num > 0){
                sum = sum + num;
            } 
           
        } while (num != 0 && contador > 0);

            System.out.println("La suma de los números ingresados es: " + sum);  
                
    }
    
}
