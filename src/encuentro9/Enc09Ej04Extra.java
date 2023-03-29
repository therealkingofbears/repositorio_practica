/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Enc09Ej04Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int prom = 0;
        double primera = 0,segunda = 0,primerInt = 0,segundoInt = 0;
        
        double[][] matriz = new double[10][6];
        int contAp = 0;
        int contDes = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1; j++) {
                matriz[i][j] = i;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 6; j++) {
                switch (j) {
                    case 1:
                        System.out.println("Ingrese la primera nota");
                        matriz[i][j] = leer.nextInt();
                        primera = matriz[i][j]*0.1;
                      break;
                    case 2:
                        System.out.println("Ingrese la segunda nota");
                        matriz[i][j] = leer.nextInt();
                        segunda = matriz[i][j]*0.15;
                      break;
                    case 3:
                        System.out.println("Ingrese la nota del primer integrador");
                        matriz[i][j] = leer.nextInt();
                        primerInt = matriz[i][j]*0.25;
                      break;
                    case 4:
                        System.out.println("Ingrese la nota del segundo integrador");
                        matriz[i][j] = leer.nextInt();
                        segundoInt = matriz[i][j]*0.5;
                      break;
                    case 5:
                        matriz[i][j] = primera + segunda + primerInt + segundoInt;
                        if (matriz[i][j] >= 7.0) {
                            contAp = contAp + 1;
                        } else {
                            contDes = contDes + 1;
                        }
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        
        System.out.println("La cantidad de aprobados es " + contAp);
        System.out.println("La cantidad de desaprobados es " + contDes);
        
    }
    
}
