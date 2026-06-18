import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioEmToquio {
    static void main(String[] args) {
        ZonedDateTime horarioToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formaDaData = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioToquioFormatado = horarioToquio.format(formaDaData);

        System.out.println("Horario em toquio: " + horarioToquioFormatado);
    }
}
