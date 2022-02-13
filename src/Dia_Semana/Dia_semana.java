package Dia_Semana;

import java.util.Scanner;

public class Dia_semana {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese el dia a consultar");
        String Dia = Captura.next();
        Dia= Dia.toLowerCase();

        switch (Dia){
            case "lunes" :
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("el dia : "+Dia+ " es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("el dia :"+Dia+" es un dia no laborable");
                break;
        }
    }
}
