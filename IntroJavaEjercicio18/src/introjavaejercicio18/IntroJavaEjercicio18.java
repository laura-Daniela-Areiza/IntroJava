/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio18;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][] = new int[4][4];
        
        System.out.println("=== Matriz original === ");
        matrizOriginal(matriz);
                
        System.out.println("=== Matriz traspuesta === ");
        matrizTraspuesta(matriz);
    }
    
    public static void matrizOriginal(int matriz[][]){
              
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int num = (int)(Math.random()*10);
                matriz[i][j] = num;  
            }  
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  "); 
            } 
            System.out.println();
        } 
    }
    
    public static void matrizTraspuesta(int matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + "  "); 
            } 
            System.out.println();
        } 
    }
        
    
}
