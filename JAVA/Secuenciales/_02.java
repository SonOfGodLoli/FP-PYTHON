// Desarrolle  el  programa  que  permite  convertir  una  cantidad  dada  en  metros  a  su  equivalente  en centímetros, pulgadas, pies y yardas. Considere los siguientes factores de conversión:   1 metro = 100 cm, 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm

package JAVA.Secuenciales;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de metros : ");
        int metros = scanner.nextInt();

        double centimetros = metros * 100;
        double yardas = metros *1.093613;
        double pies = metros * 3.28084;
        double pulgadas = metros * 39.37008;

        System.out.println("Transformado a cm es igual a : " + centimetros + " cm");
        System.out.println("Transformado a yd es igual a : " + yardas + " yd");
        System.out.println("Transformado a Pe es igual a : " + pies + " Pies");
        System.out.println("Transformado a Pg es igual a : " + pulgadas + " pg");

        scanner.close();
    }
}
