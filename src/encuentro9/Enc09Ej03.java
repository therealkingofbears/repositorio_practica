/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int p,q,r,s,t;
        p = 0; // 1 digito
        q = 0; // 2 dígitos
        r = 0; // 3 dígitos
        s = 0; // 4 dígitos
        t = 0; // 5 dígitos
        
        int[] vector = new int[n];
        llenarVector(vector);
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 10 == 0) {
                p = p + 1;
            } else if (vector[i] % 10 < 10 && vector [i] % 10 > 0) {
                q = q + 1;
            } else if (vector[i] % 10 > 10 && vector[i] % 10 < 100) {
                r = r + 1;
            } else if (vector[i] % 10 > 100 && vector[i] % 10 < 1000) {
                s = s + 1;
            } else if (vector[i] % 10 > 1000 && vector[i] % 10 < 10000) {
                t = t + 1;
            }
        }    
        
        System.out.println("Cantidad de números de un dígito: " + p);
        System.out.println("Cantidad de números de dos dígitos: " + q);
        System.out.println("Cantidad de números de tres dígitos: " + r);
        System.out.println("Cantidad de números de cuatro dígitos: " + s);
        System.out.println("Cantidad de números de cinco dígitos: " + t);
        
    }
    
      public static int[] llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*15);
        }
        
        return vector;
    }
}
