package par_impar;

public class Par_impar {
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if(i%2 ==0){
                System.out.println("El numero "+i+" Es par");
            }
            else System.out.println("El numero " +i+" es impar");
            i++;
        }
    }
}
