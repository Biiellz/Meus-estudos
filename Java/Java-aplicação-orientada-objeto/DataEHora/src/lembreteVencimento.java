import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class lembreteVencimento {
    static void main(String[] args) {
        int diasAntescendentes = 5;
        LocalDate dataVencimento = LocalDate.of(2026,04,30);
        LocalDate dataLembreteVencimento = dataVencimento.minusDays(diasAntescendentes);

        DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataLembeteVencimentoFormatada = dataLembreteVencimento.format(formaData);

        System.out.println("Data do Lembrete: " + dataLembeteVencimentoFormatada);
    }
}
