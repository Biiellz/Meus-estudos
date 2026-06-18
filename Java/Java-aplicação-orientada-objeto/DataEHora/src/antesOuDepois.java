import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class antesOuDepois{
    static void main(String[] args) {

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataEvento = LocalDate.of(2026,3,22);

        String dataAtualFormatada = dataAtual.format(formatoData);
        String dataEventoFormatada = dataEvento.format(formatoData);

        if (dataEvento.isBefore(dataAtual)){
            System.out.println("Data do evento: " + dataEventoFormatada);
            System.out.println("Data atual: " + dataAtualFormatada);
            System.out.println("O evento já ocorreu! ");
        } else if (dataEvento.isEqual(dataAtual)) {
            System.out.println("Data do evento: " + dataEventoFormatada);
            System.out.println("Data atual: " + dataAtualFormatada);
            System.out.println("O evento é hoje! ");
        }else {
            System.out.println("Data do evento: " + dataEventoFormatada);
            System.out.println("Data atual: " + dataAtualFormatada);
            System.out.println("O evento ainda não ocorreu!");
        }
    }
}
