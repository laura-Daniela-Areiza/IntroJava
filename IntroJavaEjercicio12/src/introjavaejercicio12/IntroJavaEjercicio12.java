/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio12;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int intentos = 5;
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        
        for (int i = 0; i < intentos; i++) {
           
            System.out.println("Ingrese una cadena de maximo 5 caracteres ");
            String cadena = read.nextLine();

            if (cadena.length()> 5) {
                System.out.println("Ingrese una secuencia correcta teniendo en cuenta la cantidad maxima de caracteres");
            }

            if (esCadenaValida(cadena)) {
                System.out.println("Lectura correcta: " + cadena);
                lecturasCorrectas++;
            } else {
                System.out.println("Lectura incorrecta: " + cadena);
                lecturasIncorrectas++;
            }
        }    
        
        System.out.println("==============");
        System.out.println("Informe final:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }

private static boolean esCadenaValida(String cadena) {

        if (cadena.startsWith("X") && cadena.endsWith("O")) {
            cadena.substring(0, cadena.length());
            return true;
        }else{
           return false; 
        }
    }
}
