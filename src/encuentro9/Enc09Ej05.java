/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] trasp = new int[3][3];
        int v = 0;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*9+1);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" [ "  + matriz[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < trasp.length; i++) {
            for (int j = 0; j < trasp[i].length; j++) {
                trasp[i][j] = (int) (Math.random()*9+1);
            }
        }
        
        System.out.println("----------------------------");
        
        for (int i = 0; i < trasp.length; i++) {
            for (int j = 0; j < trasp[i].length; j++) {
                System.out.print(" [ "  + trasp[i][j] + " ] ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -trasp[j][i]) {
                v = v + 1;
                }
            }
        }
        
        if (v == 9) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
}
