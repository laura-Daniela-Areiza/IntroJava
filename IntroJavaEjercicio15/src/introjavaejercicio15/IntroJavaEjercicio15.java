/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejercicio15;

/**
 *
 * @author dani_
 */
public class IntroJavaEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[] = new int[100];
        int x = 0;
        int num = 1;
        
        for (int i = 0; i < vector.length; i++) {
            
            if (i == 0) {
               vector[i] = num; 
            }else{
                vector[i] = i + 1;
            }
            
            System.out.println(vector[i]);  
        }
    }
    
}
