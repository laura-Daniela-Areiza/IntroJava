/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" === Matriz 1 ===");
        int matriz1[][] = llenarMatrizUno();
        System.out.println("");
        
        System.out.println(" === Matriz 2 ===");
        int matriz2[][] = llenarMatrizDos();
        System.out.println("");
        
        buscarMatrizDos(matriz1, matriz2);
    }
    
    public static int[][]llenarMatrizUno(){
        
        int matriz1[][] = new int[10][10];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                // the matrix was full-filled with 0 just to verify if the matrices were equal. It worked!
//                int num = 0;
                int num = (int)(Math.random()*9) + 1;
                matriz1[i][j] = num; 
            }  
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + "  "); 
            } 
            System.out.println();
        }

        return matriz1;
    }
    
     public static int[][]llenarMatrizDos(){
        
        int matriz2[][] = new int[3][3];
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                int num = (int)(Math.random()*9) + 1;
                matriz2[i][j] = num; 
            }  
        }
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + "  "); 
            } 
            System.out.println();
        }

        return matriz2;
    }
    
     public static void buscarMatrizDos(int matriz1[][], int matriz2[][]){
         
         int matrizAux[][] = new int[3][3];
         boolean isEqual = true;
         
         for (int i = 0; i < matriz1.length - matriz2.length; i++) {
             for (int j = 0; j < matriz1.length - matriz2.length; j++) {
                 
                 if (matriz1[i][j] == matriz2[0][0]) {
                     
                     //Create an aux matriz to compare it with the matriz 2
                     //(matrix aux is a fraction of the matrix 1) 
                     
                     System.out.println(); 
                     for (int k = 0; k < matriz2.length; k++) {
                         for (int w = 0; w < matriz2.length; w++) {
                             matrizAux[k][w] = matriz1[i + k][j + w];
                             System.out.print(matriz1[i + k][j + w] + "  "); 
                         }
                         System.out.println();   
                     }
                     
                     //We are going to compare matrix aux with matrix 2 to check if they are equals
                     for (int k = 0; k < matriz2.length; k++) {
                         for (int w = 0; w < matriz2.length; w++) {
                             if (matrizAux[k][w] != matriz2[k][w] ) { 
                                 isEqual = false;
                             }
                         } 
                     }
                     
                     if (isEqual == true) {
                         System.out.println("Las matrices son iguales");
                         System.out.println("La matriz va desde la fila " + i + " hasta la fila " + (i + 3));
                         System.out.println("La matriz va desde la columna " + j + " hasta la columna " + (j + 3));
                         System.out.println(""); 
                     }else{
                         System.out.println("Las matrices no son iguales."); 
                     }
                 }
             }  
         }
     }
}
