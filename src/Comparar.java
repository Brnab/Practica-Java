import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese la frase 1");
        String Frase1 = Captura.nextLine();
        System.out.println("Ingrese la frase 2");
        String Frase2 = Captura.nextLine();
        Boolean compar = Frase1.equals(Frase2);
        int compar2 = Frase1.compareTo(Frase2);
        if (Frase1.length() > Frase2.length()) {
            System.out.println("Las Frases no son iguales");
            System.out.println("La frase 1 tiene mas caracteres que la 2");
        }
        else if (Frase1.length() < Frase2.length()) {
            System.out.println("Las Frases no son iguales");
            System.out.println("La frase 2 tiene mas caracteres que la 1");

        }
        else {
            if (compar) {
                System.out.println("Las frases son iguales");


            } else {
                System.out.println("Las frases no son iguales");

                if (compar2 > 0) {
                    System.out.println("La frase 1 tiene por lo menos un caracter diferente que la  2 no ");
                } else System.out.println("La frase 2 tiene por lo menos una caracter que la  1 no ");
            }
        }


    }
}
