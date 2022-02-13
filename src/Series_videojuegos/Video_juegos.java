package Series_videojuegos;

public class Video_juegos implements Entregable {
    private String Titulo;
    private int horas_estimadas;
    boolean entregado;
    private String genero;
    private String compañia;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public Video_juegos(){
        this.Titulo="";
        this.horas_estimadas = 10;
        this.entregado= false;
        this.genero = "";
        this.compañia = "";

    }

    public Video_juegos(String titulo, int horas_estimadas){
        this.Titulo= titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado= false;
        this.genero = "";
        this.compañia = "";

    }

    public Video_juegos(String titulo, int horas_estimadas, String genero, String compañia){
        this.Titulo=titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado= false;
        this.genero = genero;
        this.compañia = compañia;

    }

    public String toString() {
        return "Videojuego [" + Titulo + ", la compañia creadora es  " + compañia + ", su genero es " + genero + ", tiene una duración aproximada de "
                + horas_estimadas+" Horas, se encuentra entregada ?  " +entregado +" ]";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado =  false ;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Video_juegos b = (Video_juegos) a;
        return b.getHoras_estimadas() - this.horas_estimadas;
    }
}
