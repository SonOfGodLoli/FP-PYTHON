package JAVA.Secuenciales;

import java.text.DecimalFormat;
import java.util.Scanner;
public class _06 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro : ");
        int radio = scanner.nextInt();

        System.out.print("Ingrese la altura del cilindro : ");
        int altura = scanner.nextInt();

        double area = (2*(Math.PI) * radio)* (radio + altura);
        double volumen = Math.PI * (Math.pow(radio, 2))* (altura);


        DecimalFormat  df = new DecimalFormat("#0.00"); 
        System.out.println("");
        System.out.println("EL area del cilindro es : "+df.format(area)+" cm.");
        System.out.println("El volumen del cilindro es : "+ df.format(volumen) + " cm.");

        scanner.close();


    }
    
}
