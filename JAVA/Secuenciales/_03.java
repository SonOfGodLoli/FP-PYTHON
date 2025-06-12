/* #Una persona ha recorrido tres tramos de una carretera. La longitud del primer tramo está dada en kilómetros,  el  segundo  tramo  en  pies  y  el  tercer  tramo  en  millas.  Desarrolle  el  programa  que determine la longitud total recorrida en metros y en yardas. Considere los siguientes factores de conversión: 
# 1 metro = 3.2808 pies, 1 milla = 1609 metros, 1 metro = 100 cm, 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm , 1 yarda = 0.9144 metros */

package Secuenciales;

import java.util.Scanner;

public class _03 {

    public static void clearconsole() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("kilometros : ");
        int kilometros = scanner.nextInt();

        System.out.println("Pies : ");
        int pies = scanner.nextInt();

        System.out.println("Millas : ");
        int millas = scanner.nextInt();

        double metros = kilometros * 1000.0 + pies * (1.0/3.2808) + millas * 1609.0;
        double yardas = kilometros * 1093.61 + pies * 0.333333 + millas * 1760.0;

        System.out.println("Metros = " + metros);
        System.out.println("Yardas = " + yardas);

        scanner.close();
    }
}