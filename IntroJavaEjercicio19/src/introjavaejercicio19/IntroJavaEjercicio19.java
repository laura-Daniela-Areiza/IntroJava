/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio19;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        
        System.out.println("=== Matriz original === ");
        int a[][] = matrizOriginal();
        System.out.println(" ");
                
        System.out.println("=== Matriz traspuesta === ");
        int at[][] = matrizTraspuesta(a);
        System.out.println(" ");
        
        System.out.println("=== Matriz traspuesta antisimétrica === ");
        int ant[][] = matrizAntisimetrica(a, at);
        System.out.println(" ");
        

    }
    
    public static int[][] matrizOriginal(){
        
        int matriz[][] =  new int[4][4];
               
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    int num = (int)(Math.random()*10);
                    matriz[i][j] = num; 
                }    
            }  
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  "); 
            } 
            System.out.println();
        } 
        
        return matriz;
    }
    
    public static int[][] matrizTraspuesta(int a[][]){
                
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + "  "); 
            } 
            System.out.println();
        } 
        
        return a;
    }

    public static int[][] matrizAntisimetrica(int a[][],int at[][]){
        
        int result[][] = new int[4][4];
        
        for (int i = 0; i < at.length; i++) {
            for (int j = 0; j < at.length; j++) {
                at[i][j] = at[i][j] * -1;            
            } 
        }
        
        for (int i = 0; i < at.length; i++) {
            for (int j = 0; j < at.length; j++) {
                result[j][i] = at[j][i]; 
                System.out.print(at[j][i]+ "  ");
            } 
            System.out.println();
        }
        
        return result;
    }
    

}
