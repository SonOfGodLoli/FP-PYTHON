// Dado un número natural de cuatro cifras, desarrolle el programa que permite obtener el número al revés. Ejemplo 1234  → 4321

package JAVA.Secuenciales;

import java.util.Scanner;

public class _010 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero : ");
        String n = scanner.nextLine();

        StringBuilder Nuevo = new StringBuilder(n).reverse();

        System.out.println("");
        System.out.println("El nuevo numero es : " + Nuevo);
        

        scanner.close();
    }
}


        // System.out.print("Ingresa el numero : ");
        
        // int numero = scanner.nextInt();

        // int nuevoN = (numero%10)*1000 + ((numero%100)/10)*100 + ((numero/100)%10)*10 + numero/1000;

        // System.out.println(String.format("numero nuevo : %s", nuevoN));