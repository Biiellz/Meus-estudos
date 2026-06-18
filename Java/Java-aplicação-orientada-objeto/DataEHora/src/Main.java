import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime tempo = LocalTime.now();

        String tarefa = "Enviar relatório semanal";

        System.out.println("Tarefa \"" + tarefa + "\" ");
        System.out.println("Data de criação: " + data);
        System.out.println("Horário da criação: " + tempo);
    }
}
