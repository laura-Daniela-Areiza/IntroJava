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
public class EjercicioFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();

        System.out.println(reemplazarVocales(frase));
        
    }
    
    public static String reemplazarVocales(String frase){
       
        String resultado = " ";
        
        for (int i = 0; i < frase.length(); i++) {
            char x = frase.charAt(i);
             
            switch(x){
                case 'a':
                    resultado = resultado.concat("@");
                    break;
                case 'e':
                    resultado = resultado.concat("#");
                    break;
                case 'i':
                    resultado = resultado.concat("$");
                    break;
                case 'o':
                    resultado = resultado.concat("%");
                    break;
                case 'u':
                    resultado = resultado.concat("*");
                    break;
                default:
                    resultado = resultado.concat(String.valueOf(x));
                    break;
            }
        }
        return resultado;
   
    }
    
}
