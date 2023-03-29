/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package encuentro9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej02Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número para rellenar la posición " + i + " del vector 1");
            vector1[i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(" [ " + vector1[i] + " ] ");
        }
        
        System.out.println(" ");
        System.out.println("--------------");
        
        for (int j = 0; j < n; j++) {
            System.out.println("Ingrese el número para rellenar la posición " + j + " del vector 1");
            vector2[j] = leer.nextInt();
        }
        
        for (int j = 0; j < n; j++) {
            System.out.print(" [ " + vector2[j] + " ] ");
        }
        
        System.out.println(" ");
        
        if (Arrays.equals(vector1,vector2)) {
            System.out.println("Los dos vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
    
}
