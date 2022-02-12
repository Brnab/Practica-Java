import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Persona {
    final char Gender = 'M';
    private String Nombre;
    private int Edad;
    private String DNI;
    private char Sexo;
    private double Peso;
    private double Altura;


    protected String getNombre() {
        return Nombre;
    }

    protected void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    protected int getEdad() {
        return Edad;
    }

    protected void setEdad(int edad) {
        this.Edad = edad;
    }


    protected char getSexo() {
        return Sexo;
    }

    protected void setSexo(char sexo) {
        this.Sexo = sexo;
    }

    protected double getPeso() {
        return Peso;
    }

    protected void setPeso(double peso) {
        this.Peso = peso;
    }

    protected double getAltura() {
        return Altura;
    }

    protected void setAltura(double altura) {
        this.Altura = altura;
    }

    Persona(){
        this.Nombre="";
        this.Edad=0;
        this.Sexo = Gender;
        this.Altura = 0;
        this.Peso = 0;
        this.DNI = DNI();
        String Info= info();

    }
    Persona(String Name, int edad,char Sexo,double Altura, double Peso){
        setNombre(Name);
        setEdad(edad);
        setSexo(Sexo);
        setAltura(Altura);
        setPeso(Peso);
        this.DNI = DNI();
        String Info= info();
    }
    Persona(String Name, int edad,char Sexo){
        setNombre(Name);
        setEdad(edad);
        setSexo(Sexo);
        this.Altura = 0;
        this.Peso = 0;
        this.DNI = DNI();
        String Info= info();
    }

    String DNI(){ // se genera un valor aleatorio de 8 digitos
        Random r = new Random();
        int cantidad = r.nextInt(90000000) + 10000000;
        int letra = cantidad%23;

        String[] letras= new String[]{
                "T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"
        };
        String LD = letras[letra];

        String ND = LD+String.valueOf(cantidad);


        return ND;

    }

    final int I = -1;
    final int NI = 0;
    final int SP = 1;

    int CIMC (){
        double altura = getAltura();
        altura = altura/100;
        double peso = getPeso();
        double IMC = Peso/Math.pow(altura,2);

        if(IMC <20 ){
            System.out.println("La persona" +getNombre()+" Se encuentra en un peso ideal");
            return I;
        }

        else if (20<=IMC && IMC <=25) {
            System.out.println("La persona "+getNombre() + " Se encuentra en un peso no ideal");
            return NI;
        }
        else {
            System.out.println("La persona" + getNombre() + " se encuentra en sobrepeso");
            return SP;
        }
    }

    void me(){
        int edad =getEdad();
        if(edad>18){
            System.out.println("La persona " +getNombre() +" Es mayor de edad" );
        }
        else{
            System.out.println("La persona "+getNombre()+" No es mayor de edad");
        }
    }

    boolean VS (){
        char Sexo = getSexo();
        if(Sexo == 'M'){
            return true;
        }
        else if(Sexo == 'F'){
            return true;
        }
        else return false;
    }

    String info(){
        String Informacion = new String();
        boolean vs = VS();
        if (vs) {
            Informacion = " La persona " + getNombre() + " tiene " + getEdad() + " años de edad, es de sexo " + getSexo() + " mide : " + getAltura() + " y pesa : " + getPeso();
           // System.out.println(Informacion);
            return Informacion;

        }
        else {
            Informacion = " La persona " + getNombre() + " tiene " + getEdad() + " años de edad, mide : " + getAltura() + " y pesa : " + getPeso();
          //  System.out.println(Informacion);
            return Informacion;
        }


    }


    public static void main(String[] args) {
        Persona p1,p2,p3;
        Scanner Captura = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String Name = Captura.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int Age = Captura.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        char Sex = Captura.next().charAt(0);
        System.out.println("Ingrese la altura de la persona");
        double altura = Captura.nextDouble();
        System.out.println("Ingrese el peso de la persona");
        double peso = Captura.nextDouble();
        p1 = new Persona(Name,Age,Sex,altura,peso);
        System.out.println("Ingrese el nombre de la persona");
        Name = Captura.next();
        System.out.println("Ingrese la edad de la persona");
        Age = Captura.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        Sex = Captura.next().charAt(0);
        p2 = new Persona(Name,Age,Sex);

        p3= new Persona();
        p3.setNombre("Alejandra");
        p3.setEdad(25);
        p3.setSexo('F');
        p3.setAltura(1.65);
        p3.setPeso(68);
        p1.CIMC();
        p1.me();
        System.out.println(p1.info());;
        p2.CIMC();
        p2.me();
        System.out.println(p2.info());;
        p3.CIMC();
        p3.me();
        System.out.println(p3.info());;




    }
}
