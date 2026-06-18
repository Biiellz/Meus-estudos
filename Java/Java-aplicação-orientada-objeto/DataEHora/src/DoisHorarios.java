import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DoisHorarios {
    static void main(String[] args) {
        ZonedDateTime tempoatual = ZonedDateTime.now();
        DateTimeFormatter formatoTempo = DateTimeFormatter.ofPattern("hh:mm:ss");

        ZonedDateTime tempoAtualSydney = tempoatual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Tempo atual: " + tempoatual.format(formatoTempo));
        System.out.println("Tempo atual em Sydney " + tempoAtualSydney.format(formatoTempo));
    }
}