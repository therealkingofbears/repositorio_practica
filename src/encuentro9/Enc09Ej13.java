/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de compañeros de equipo");
        q = leer.nextInt();
        
        String[] Equipo = new String[q];
        
        for (int i = 0; i < q; i++) {
            System.out.println("Ingrese el nombre del miembro del equipo");
            String nombre = leer.next();
            Equipo[i] = nombre;
        }
        
        System.out.println(Equipo[q]);
    }
    
}
