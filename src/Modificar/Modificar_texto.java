package Modificar;

import java.util.Scanner;

public class Modificar_texto {
    public static void main(String[] args) {
        String Frase = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Ingrese una frase");
        Scanner Captura = new Scanner(System.in);
        String NewFrase = Captura.nextLine();
        Frase = Frase.replace("a","e");
        NewFrase = Frase +" "+ NewFrase;
        System.out.println(NewFrase);
    }
}
