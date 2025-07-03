// Desarrolle el programa que permita calcular la hipotenusa de un triángulo. Usando la clase Math.

package JAVA.Secuenciales;

import java.util.Scanner;

public class _013 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese lado a : ");
        int a = scanner.nextInt();

        System.out.print("Ingrese lado b : ");
        int b = scanner.nextInt();

        //H2 = a2 + b2

        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("");
        System.out.println(String.format("La hipotenusa es : ", h));


        scanner.close();

    }
    
}