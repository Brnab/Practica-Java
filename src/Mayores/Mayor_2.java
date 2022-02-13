package Mayores;

import java.util.Scanner;

public class Mayor_2 {
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        System.out.println(" ingresa el numero a comparar.");
        int x = captura.nextInt();
        System.out.println(" ingresa el numero a comparar.");
        int y = captura.nextInt();
        if( x<y){
            System.out.println(+x+ " es menor que " + y);
        }
        else if(x==y){
            System.out.println(" los valores son iguales.");
        }
        else System.out.println( +x +" es mayor que " +y);
    }
}
