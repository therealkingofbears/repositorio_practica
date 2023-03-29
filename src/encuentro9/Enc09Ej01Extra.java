/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*25+1);
            System.out.print(" [ " + vector[i] + " ] ");
            sum = sum + vector[i];
        }
        
        System.out.println(" ");
        System.out.println("La suma de los elementos del vector es igual a " + sum);
    }
    
}
