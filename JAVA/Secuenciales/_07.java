//Desarrolle  el  programa  que  determine  el  área  y  el  perímetro  de  un  rectángulo  sabiendo  que  el área = b x h, perímetro = 2x (b+h).

package JAVA.Secuenciales;

import java.util.Scanner;

public class _07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base : ");
        int b = scanner.nextInt();

        System.out.print("Ingrese la altura : ");
        int h = scanner.nextInt();

        int area = b * h;
        int perimetro = 2 *( b * h );


        System.out.println(""); //Vacio para dejar un salto de linea por si acaso profe //
        System.out.println("El area es igual a " + area + " .");
        System.out.println("El perimetro es igual a " + perimetro + " .");

        scanner.close();
        
    }
}