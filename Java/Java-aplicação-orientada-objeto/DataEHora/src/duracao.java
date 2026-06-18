import java.time.Duration;
import java.time.LocalTime;

public class duracao {
    static void main(String[] args) {
        LocalTime tempoInicio = LocalTime.of(11,30,0);
        LocalTime tempoTermino = LocalTime.of(12,45,10);

        Duration duracao = Duration.between(tempoInicio, tempoTermino);

        System.out.println("A duração do trabalho foi de: " + duracao.toHours() + " Horas e " + duracao.toMinutesPart() + " Minutos " + duracao.toSecondsPart() + "Segundos.");
    }
}
