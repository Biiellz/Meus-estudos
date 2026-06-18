import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class prazo {
    static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazo = 15;
        LocalDate dataFim = dataInicio.plusDays(prazo);

        DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada  = dataFim.format(formatoDaData);

        System.out.println("Data de entrega: " + dataFormatada);

    }
}
