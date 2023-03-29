/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package encuentro9;


/**
 *
 * @author diego
 */
public class Enc09Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] trasp = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*9+1);
                System.out.print(" [ "  + matriz[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        
        System.out.println("----------------------------");
        
        for (int i = 0; i < trasp.length; i++) {
            for (int j = 0; j < trasp[i].length; j++) {
                trasp[i][j] = matriz[j][i];
                System.out.print(" [ "  + trasp[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
    
    
}
