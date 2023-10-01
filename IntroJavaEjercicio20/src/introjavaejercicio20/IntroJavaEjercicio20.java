/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio20;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int cuadradoMagico[][] = llenarMatriz();
         
         sumaLadosCuadradoMagico(cuadradoMagico);
         
       
    }
    
    public static int[][]llenarMatriz(){
        
        int matriz[][] =  new int[3][3];
               
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                  //uncomment the following line to verify if it is a magic cube, it fills the matrix with a constant.
//                int num = 1;
                int num = (int)(Math.random()*9) + 1;
                matriz[i][j] = num; 
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
    
    public static boolean sumaLadosCuadradoMagico(int cuadradoMagico[][]){
        
        boolean esMagico = false;        
        int num = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sumF1 = 0;
        int sumF2 = 0;
        int sumF3 = 0;
        int sumC1 = 0;
        int sumC2 = 0;
        int sumC3 = 0;
              
        for (int i = 0; i < cuadradoMagico.length; i++) {
            // sumar diagonales
            for (int j = 0; j < cuadradoMagico.length; j++) {
                
                if (i == j) {
                    num = cuadradoMagico[i][j];
                    sum1 = sum1 + num;
                }
                
                if (i == j) {
                    num = cuadradoMagico[2 - i][j];
                    sum2 = sum2 + num;
                }
            }  
            // sumar filas
                sumF1 = sumF1 + cuadradoMagico[0][i];
                sumF2 = sumF2 + cuadradoMagico[1][i];
                sumF3 = sumF3 + cuadradoMagico[2][i];

            // sumar columnas
                sumC1 = sumC1 + cuadradoMagico[i][0];
                sumC2 = sumC2 + cuadradoMagico[i][1];
                sumC3 = sumC3 + cuadradoMagico[i][2];
        }
        System.out.println("Suma de la diagona l es: " + sum1);
        System.out.println("Suma de la diagona 2 es: " + sum2);
        System.out.println("Suma de la fila 1 es: " + sumF1);
        System.out.println("Suma de la fila 2 es: " + sumF2);
        System.out.println("Suma de la fila 3 es: " + sumF3);
        System.out.println("Suma de la columna 1 es: " + sumC1);
        System.out.println("Suma de la columna 2 es: " + sumC2);
        System.out.println("Suma de la columna 3 es: " + sumC3); 
        
        if (sum2 == sum1 && sumF1 == sum1 && sumF2 == sum1 && sumF3 == sum1 && sumC1 == sum1 && sumC2 == sum1 && sumC3 == sum1) {
            esMagico = true;
            System.out.println("Es magico");
            return esMagico;
        } else {
            System.out.println("No es magico");
            return esMagico;
        }
    }
    
}
