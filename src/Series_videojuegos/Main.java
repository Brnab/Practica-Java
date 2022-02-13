package Series_videojuegos;

public class Main {
    public static void main(String[] args) {

        int cantidad_series =0;
        int cantidad_videoj = 0;
        series[] Series = {new series("Dark",4,"netflix", "fantastico"), new series("Altered carbon", "netflix"),
                new series("Vikingos", "Netflix"), new series("Sex education", "Netflix"),
                new series("Friends", "warner") };


        Video_juegos[] Videojuego = {new Video_juegos("Half life", 30,"shooter","valve"),
                new Video_juegos("COD Modern warfare", 36, "shooter", "activision"),
        new Video_juegos("Halo reach", 45, "shooter","Bungie"),
        new Video_juegos("COD Modern warfare 2", 32, "shooter", "activision"),
        new Video_juegos("Halo 2", 50, "shooter","Bungie")};


        Videojuego[2].entregar();
        Videojuego[3].entregar();
        Series[0].entregar();
        Series[4].entregar();

        for (int i = 0; i < Videojuego.length; i++) {
            if(Videojuego[i].isEntregado()) {
                cantidad_videoj++;
                Videojuego[i].devolver();
            }
            if(Series[i].isEntregado()) {
                cantidad_series++;
                Series[i].devolver();
            }
        }
        int [] posicion = {0,0};
        int aux;
        for (int i = 0; i < Videojuego.length; i++) {
            for (Video_juegos videojuego : Videojuego) {
                aux = videojuego.compareTo(Videojuego[i]);
                if (aux > posicion[0]) {
                    posicion[0] = aux;
                    posicion[1] = i;
                }
            }
        }

        System.out.println("La cantidad de series prestadas es de:" + cantidad_series);
        System.out.println("La cantidad de videojuegos prestados es de:" + cantidad_videoj);
        System.out.println(Videojuego[posicion[1]]);




    }
}
