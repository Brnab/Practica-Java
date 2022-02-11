import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        int opc = 0;
        do {


            System.out.println("*********** GESTION CINEMATOGRAFICA*******\n" +
                    "1. NUEVO ACTOR \n" +
                    "2. BUSCAR ACTOR\n" +
                    "3. ELIMINAR ACTOR\n" +
                    "4. MODIFICAR ACTOR \n" +
                    "5. VER TODOS LOS ACTORES\n" +
                    "6. VER PELICULAS DE LOS ACTORES\n" +
                    "7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8. SALIR\n" +
                    "INGRESE EL NUMERO DE LA OPCIÓN A USAR : ");
            opc = Captura.nextInt();
            if(opc >8 || opc<0){
                System.out.println("OPCIÓN INCORRECTA");
            }
        }
        while  (opc != 8 );
    }
}
