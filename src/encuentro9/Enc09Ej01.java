/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package encuentro9;

/**
 *
 * @author diego
 */
public class Enc09Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        for (int i = 99; i > -1; i--) {
            vector[i] = i;
            System.out.print(" [ " + vector[i] + " ] ");
        }
    }
    
}
