import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        String valor = Captura.next();
        double radio = Double.parseDouble(valor);
        double area = PI*Math.pow(radio,2) ;
        System.out.println(" El area del circulo es : " +area);
    }
}
