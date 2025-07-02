// Desarrolle  el  programa  que,  dada  la  capacidad  de  un  disco  duro  en  gigabytes,  lo  convierta  a megabytes, kilobytes y bytes. 1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.

package JAVA.Secuenciales;

import java.util.Scanner;

public class _05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gigabytes : ");
        int Gigabytes = scanner.nextInt();

        double megabytes = Gigabytes * 1024 ;
        double kilobytes = megabytes * 1024 ;
        double bytes = kilobytes * 1024 ;

        System.out.println("");
        System.out.println("Megabytes : " + megabytes);
        System.out.println("Kilobytes : " + kilobytes);
        System.out.println(String.format("Kilobytes : ", kilobytes));
        System.out.println("Bytes : " + bytes);

        scanner.close();
    }
}
