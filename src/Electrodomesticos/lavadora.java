package Electrodomesticos;

import Electrodomesticos.Electrodomestico;

public class lavadora extends Electrodomestico {

    private int Carga;
    final int C = 5;

    public int getCarga() {
        return Carga;
    }

    public lavadora() {
        this.Carga = C;
        this.color = Color;
        this.letra = l;
        this.peso = ps;
        this.Precio_base = PB;

    }

    public lavadora(double Precio, double peso) {
        this.Carga = C;
        this.color = Color;
        this.letra = l;
        this.peso = peso;
        this.Precio_base = Precio;

    }

    public lavadora(double precio, String color, char letra, double peso, int carga) {
        super(precio, color, letra, peso);
        this.Carga = carga;
    }

    double PrecioFin() {
        double PrecioFin = super.Precio_Fin();
        int c = getCarga();

        if (c > 30) {
            PrecioFin = PrecioFin + 50;
        }
        return PrecioFin;

    }
}
