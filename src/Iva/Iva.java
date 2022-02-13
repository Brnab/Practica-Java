package Iva;

import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
        final double iva = 0.21;
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double Precio = Captura.nextDouble();
        double incremento = Precio*iva;
        Precio = Precio + incremento;
        System.out.println("El precio final con iva es : " + Precio);
    }
}
