package Electrodomesticos;

import Electrodomesticos.Electrodomestico;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean TDT;
    final int Res=20;
    final boolean t=false;

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public Televisor(){
        this.resolucion = Res;
        this.TDT = t;
        this.Precio_base=PB;
        this.color=Color;
        this.peso=ps;
        this.letra=l;
    }
    public Televisor(double precio, double peso){
        this.Precio_base = precio;
        this.peso = peso;
        this.color=Color;
        this.letra=l;
        this.resolucion = Res;
        this.TDT = t;

    }

    public Televisor(double precio, String color, char letra, double peso, int resolucion, boolean TDT) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    double PrecioFin(){
        double PrecioFin=super.Precio_Fin();
        boolean tdt=isTDT();
        int res= getResolucion();
        double PB = getPrecio_base();
        if(res >40){
            PrecioFin=PB+(PB*0.3);
        }
        if(tdt) {
            PrecioFin=PrecioFin+50;
        }

    return PrecioFin;
    }

}
