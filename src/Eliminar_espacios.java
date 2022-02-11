import java.util.Scanner;

public class Eliminar_espacios {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner Captura = new Scanner(System.in);
        String NewFrase = Captura.nextLine();
        NewFrase = NewFrase.replace(" ","");
        System.out.println(NewFrase);
    }
}
