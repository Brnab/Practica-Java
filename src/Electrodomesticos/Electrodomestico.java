package Electrodomesticos;

public class Electrodomestico {
     double Precio_base;
     String color;
     char letra;
     double peso;
    final String Color ="blanco";
    final char l = 'F';
    final double PB = 100;
    final double ps = 5;


    public Electrodomestico(){
        this.color = Color;
        this.Precio_base = PB;
        this.letra = l;
        this.peso = ps;
        cc();
        cce();
    }
    public Electrodomestico(double precio, String color, char letra,double peso){
        this.Precio_base = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
        cc();
        cce();

    }

    public Electrodomestico(double precio, double peso){

        this.Precio_base = precio;
        this.peso = peso;
        this.color = Color;
        this.letra=l;
        cc();
        cce();


    }


    public double getPrecio_base() {
        return Precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getletra() {
        return letra;
    }

    public double getPeso() {
        return peso;
    }

    void cce(){
     char letra = getletra();
     if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
         this.letra = letra;

     }
     else this.letra = l;
    }
    void cc(){
        String Col = getColor();
        Col = Col.toLowerCase();
        if (Col == "blanco" || Col == "negro" || Col == "rojo" || Col == "azul"|| Col=="gris"){
            this.color=Col;
        }
        else this.color = Color;
    }

    double Precio_Peso (){
        double PrecioB= getPrecio_base();
        double Peso = getPeso();
        double Precio_Fin = 0;
        if(0<=Peso && Peso<=19){
            Precio_Fin = PrecioB+10;
        }
        else if (20<= Peso && Peso<=49){
            Precio_Fin = PrecioB+50;
        }
        else if (50<= Peso && Peso<=79){
            Precio_Fin = PrecioB+80;
        }
        else if (80<= Peso){
            Precio_Fin = PrecioB+100;
        }

        return Precio_Fin;


    }

    double Precio_CE () {

        double PrecioB = getPrecio_base();
        char letra = getletra();
        double Precio_Fin = 0;
        if (letra == 'A') {
            Precio_Fin = PrecioB + 100;
        } else if (letra == 'B') {
            Precio_Fin = PrecioB + 80;
        } else if (letra == 'C') {
            Precio_Fin = PrecioB + 60;
        } else if (letra == 'D') {
            Precio_Fin = PrecioB + 50;
        } else if (letra == 'E') {
            Precio_Fin = PrecioB + 30;
        } else if (letra == 'F') {
            Precio_Fin = PrecioB + 10;
        }


        return Precio_Fin;
    }

    double Precio_Fin(){
        double PrecioP=Precio_Peso();
        double PrecioB=Precio_CE();
        double PrecioFin=PrecioB+PrecioP -getPrecio_base();
        return PrecioFin;
    }


    public static void main(String[] args) {
        Electrodomestico electrodomestico;
        electrodomestico = new Electrodomestico(120,"negro",'F',15);
        System.out.println(electrodomestico.getColor());
        System.out.println(electrodomestico.getletra());
        System.out.println(electrodomestico.Precio_Fin());
    }

}
