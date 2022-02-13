package Mayor_0;

import java.util.Scanner;

public class Mayor_0 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner Captura = new Scanner(System.in);
        int Numero = Captura.nextInt();

        do {
            System.out.println("ingrese un numero");
            Numero = Captura.nextInt();
            if (Numero >= 0) System.out.println(" el numero " + Numero + " es mayor o igual que 0");
        }

        while (Numero < 0 );
    }

}
