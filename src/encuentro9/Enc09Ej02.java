/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int val = 0;
        llenarVector(vector);
        
        System.out.println("Ingrese el número a buscar en el vector");
        int num = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                val = i;
            } 
            
        }
        
        if (val != 0) {
            System.out.println("El número " + num + " se encuentra en la posición " + val);
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector");
        }
        
    }
    
    public static int[] llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*15);
        }
        
        return vector;
    }
    
}
