// Desarrolle  el  programa  que,  dada  la  capacidad  de  un  disco  duro  en  gigabytes,  lo  convierta  a megabytes, kilobytes y bytes. 1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.
package JAVA.Secuenciales;

import java.util.Scanner;
public class _05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gigabytes : ");
        int gigabytes = scanner.nextInt();

        double megabytes = gigabytes * 1024;
        double kilobytes = megabytes * 1024;
        double bytes = kilobytes * 1024 ;

        System.out.println("");
        System.out.println(String.format("Transformado a megabytes %s", megabytes));
        System.out.println(String.format("Transformado a kilobytes %s", kilobytes));
        System.out.println(String.format("Transformado a bytes %s", bytes)) ;

        scanner.close();

    }
}
