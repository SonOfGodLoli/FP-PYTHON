// En países de habla inglesa, es común dar la estatura de una persona como la suma de una cantidad de pies, más una cantidad de pulgadas, por ejemplo 3’ 2”. Desarrolle el programa que determine la estatura en metros dada su estatura en el formato inglés. 1 pie = 3048 m / 1 pulgada = 0.0254 m

package JAVA.Secuenciales;

import java.text.DecimalFormat;
import java.util.Scanner;
public class _04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la parte en pies :");
        int Pies = scanner.nextInt();

        System.out.print("Ingrese la parte en pulgadas : ");
        int Pulgadas = scanner.nextInt();

        double metros = (  Pies * 0.3048 ) + ( Pulgadas * 0.0254 );

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(""); //Vacio para dejar un salto de linea por si acaso profe //
        System.out.println("La medida en metros es de : " + df.format(metros));


        scanner.close();
    }
}
