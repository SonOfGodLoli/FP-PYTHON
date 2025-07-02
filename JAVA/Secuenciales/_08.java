// Desarrolle el programa que determine de un cilindro el área base = π r2, área lateral = 2 π r h, área total = 2 x área base x área lateral. Siendo r el radio y h la altura. 

package JAVA.Secuenciales;

import java.util.Scanner;
import java.text.DecimalFormat;

public class _08 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio : ");
        int radio = scanner.nextInt();

        System.out.print("Ingrese la altura : ");
        int altura = scanner.nextInt();

        double area_base = Math.PI * Math.pow(radio,2);
        double area_lateral = 2*(Math.PI) * radio * altura;
        double area_total = 2 * area_base * area_lateral;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("EL Area Base es : " + df.format(area_base) + " cm." );
        System.out.println("EL Area Base es : " + df.format(area_lateral) + " cm." );
        System.out.println("EL Area Base es : " + (area_total) + " cm." );


        scanner.close();


    }


}