package logitud;

import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = Captura.nextLine();
        Frase =  Frase.toLowerCase();
        int conta=0;
        int conte=0;
        int conti=0;
        int conto=0;
        int contu=0;
        for(int i = 0; i<Frase.length(); i++){
            if(Frase.charAt(i)=='a'){
                conta++;

            }
            else if(Frase.charAt(i)=='e'){
                conte++;
            }
            else if(Frase.charAt(i)=='i'){
                conti++;
            }
            else if(Frase.charAt(i)=='o'){
                conto++;
            }
            else if(Frase.charAt(i)=='u'){
                contu++;
            }
        }
        System.out.println("La longitud de la frase es : " + Frase.length());
        System.out.println("El numero de a en la frase es : " + conta);
        System.out.println("El numero de e en la frase es : " + conte);
        System.out.println("El numero de i en la frase es : " + conti);
        System.out.println("El numero de o en la frase es : " + conto);
        System.out.println("El numero de u en la frase es : " + contu);
    }
}
