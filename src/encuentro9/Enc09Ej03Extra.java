/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej03Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        rellenar(vector, n);
        imprimirVector(vector, n);
    }
    
    public static void rellenar(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*25+1);
        }
    }
    
    public static void imprimirVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
        
        System.out.println(" ");
        System.out.println("--------------");
    }
    
}
