// Dado  dos  números  enteros  de  3  cifras,  desarrolle  el  programa  que  muestre  la  cifra  primera  y tercera cifras intercambiadas entre ambos números. Ejemplo 123 y 456 → 624 y 351
package JAVA.Secuenciales;

import java.util.Scanner;
public class _011 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el 1er numero : ");
        String N1 = scanner.nextLine();

        System.out.print("Ingrese el 2do numero : ");
        String N2 = scanner.nextLine();

        char[] lista1 = N1.toCharArray();
        char[] lista2 = N2.toCharArray();

       String NN1 = ""+lista2[2]+lista1[1]+lista2[0];
       String NN2 = ""+lista1[2]+lista2[1]+lista1[0]; 

       System.out.println("");
       System.out.println("Los nuevos numeros son : " + NN1 +" y " + NN2 +" .");


        scanner.close();
    }
}