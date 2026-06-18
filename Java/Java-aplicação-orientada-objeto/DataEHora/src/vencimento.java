import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class vencimento {
    static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int maisMes = 1;
        LocalDate dataNova = dataInicio.plusMonths(maisMes);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataNova.format(formatoData);

        String dataInicioFormatada = dataInicio.format(formatoData);

        System.out.println("Data antiga de vencimento: " + dataInicioFormatada);
        System.out.println("Nova data de vencimento: " + dataFormatada);
    }
}
