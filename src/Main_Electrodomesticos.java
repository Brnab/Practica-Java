import java.util.ArrayList;
import java.util.List;

public class Main_Electrodomesticos {

    public static void main(String[] args) {
        double Precio_TV =0;
        double Precio_lav=0;
        double Precio_ele=0;

        List<Electrodomestico> El = new ArrayList<>();
        El.add(new Electrodomestico());
        El.add(new lavadora());
        El.add(new Televisor());
        El.add(new Televisor(120,"negro",'F',15,45,true));
        for (Electrodomestico Ele : El){
            if (Ele instanceof Televisor) Precio_TV+=Ele.Precio_Fin();
            else if(Ele instanceof lavadora) Precio_lav+=Ele.Precio_Fin();
            Precio_ele+=Ele.Precio_Fin();


        }
        System.out.println("El precio total de los electrodomesticos es "+ Precio_ele);
        System.out.println("El precio total de lavadoras es "+ Precio_lav);
        System.out.println("El precio total de los televisores es  "+ Precio_TV);
    }
}
