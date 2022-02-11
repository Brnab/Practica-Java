import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mostrar_fecha {
    public static void main(String[] args) {
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        System.out.println(hora.format(LocalDateTime.now()));
    }
}
