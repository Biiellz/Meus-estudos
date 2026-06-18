import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dataHora {
    static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime tempo = LocalTime.now();

        DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoDoTempo = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = data.format(formatoDaData);
        String tempoFormatado = tempo.format(formatoDoTempo);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Tempo formatado: " + tempoFormatado);
    }
}
