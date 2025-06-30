//Desarrolle el programa que lea un número entero y determine la suma de sus cifras. Asumir que el número es positivo y de 4 cifras.

package JAVA.Secuenciales;

import java.util.Scanner;

public class _09 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 4 cifras positivo : ");
        int N1 = scanner.nextInt();

        int Suma_de_D = (N1 / 1000) + (((N1 / 100) % 10)*10) + (((N1 / 10) % 10)*100) + ((N1 % 10)*1000);

        System.out.println("");
        System.out.println("La suma de los digitos es de " + Suma_de_D+".");

        scanner.close();
    }
}