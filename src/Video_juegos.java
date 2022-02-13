public class Video_juegos {
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
        return "Videojuego [=" + Titulo + ", la compañia creadora es =" + compañia + ", su genero es =" + genero + ", tiene ua duración aproximada de ="
                + horas_estimadas+", se encuentra entregada ? =" +entregado +"]";
    }
}
