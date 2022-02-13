package Series_videojuegos;

public class series implements Entregable {
    private String Titulo;
    private int num_temporadas;
    boolean entregado;
    private String genero;
    private String creador;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String nombre) {
        this.Titulo = nombre;
    }

    public int getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public series(){
        this.Titulo = "";
        this.num_temporadas = 3;
        this.entregado = false;
        this.creador="";
        this.genero= "";
    }

    public series(String titulo, String creador){
        this.Titulo = titulo;
        this.num_temporadas = 3;
        this.entregado = false;
        this.creador=creador;
        this.genero= "";
    }

    public series(String titulo, int numtemp, String  creador, String genero){
        this.Titulo = titulo;
        this.num_temporadas = numtemp;
        this.entregado = false;
        this.creador=creador;
        this.genero= genero;
    }
    public String toString() {
        return "Serie [ " + Titulo + ", el autor es " + creador + ", su genero es " + genero + ", tiene  "
                + num_temporadas+" temporadas , se encuentra entregada ?  " +entregado +" ]";
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        series b = (series)a;
        return b.getNum_temporadas() - this.num_temporadas;

    }
}
