// Calcule el promedio de los 3 números mayores de 5 números ingresados. Usando la clase Math. 
package JAVA.Secuenciales;

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class _014 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int lista[] = new int[5];

        System.out.print("NUMERO 1 : ");
        lista[0] = scanner.nextInt();

        System.out.print("NUMERO 2 : ");
        lista[1] = scanner.nextInt();

        System.out.print("NUMERO 3 : ");
        lista[2] = scanner.nextInt();

        System.out.print("NUMERO 4 : ");
        lista[3] = scanner.nextInt();

        System.out.print("NUMERO 5 : ");
        lista[4] = scanner.nextInt();

        Arrays.sort(lista);

        double PromS = (lista[4] + lista[3] + lista[2]);
        double PromSS = PromS/3;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("");
        System.out.println("El PROMEDIO ES  : "+PromS);
        System.out.println(String.format("El PROMEDIO ES : %s ", df.format(PromSS)));

        scanner.close();
    }
}