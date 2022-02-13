public class series {
    private String Nombre;
    private int num_temporadas;
    boolean entregado;
    private String genero;
    private String creador;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
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
        this.Nombre = "";
        this.num_temporadas = 3;
        this.entregado = false;
        this.creador="";
        this.genero= "";
    }

    public series(String titulo, String creador){
        this.Nombre = titulo;
        this.num_temporadas = 3;
        this.entregado = false;
        this.creador=creador;
        this.genero= "";
    }

    public series(String titulo, int numtemp, String  creador, String genero){
        this.Nombre = titulo;
        this.num_temporadas = numtemp;
        this.entregado = false;
        this.creador=creador;
        this.genero= genero;
    }
    public String toString() {
        return "Serie [=" + Nombre + ", el autor es=" + creador + ", su genero es =" + genero + ", tiene ="
                + num_temporadas+" temporadas" + ", se encuentra entregada ? =" +entregado +"]";
    }
}
