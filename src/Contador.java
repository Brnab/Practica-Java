import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int num = Captura.nextInt();
        for(int i = num; i<1000; i=i+2){
            System.out.println(i);
        }
    }
}
