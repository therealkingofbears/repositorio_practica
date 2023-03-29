/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej05Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N,M;
        int suma = 0;
        
        System.out.println("Ingrese el número de filas de la matriz");
        N = leer.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz");
        M = leer.nextInt();
        
        int[][] matriz = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random()*25+1);
                suma = suma + matriz[i][j];
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        
        System.out.println("--------");
        System.out.println("La suma de los elementos de la matriz es " + suma);
    }
    
}
