// Desarrolle  el  programa  que,  dada  la  capacidad  de  un  disco  duro  en  gigabytes,  lo  convierta  a megabytes, kilobytes y bytes. 1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.

package JAVA.Secuenciales;

import java.util.Scanner;
public class _05 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en gigabytes : ");
        int Giga = scanner.nextInt();

        int megab = Giga * 1024; 
        int Kilob = megab * 1024; 
        int bytes = Kilob * 1024; 

        System.out.println("Cantidad Transformada a megas : " + megab +".");
        System.out.println("Cantidad Transformada a kilobites : " + Kilob +".");
        System.out.println("Cantidad Transformada a bytes : " + bytes +".");

        scanner.close();
    }
    

}
