import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Expediente {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter formaData = DateTimeFormatter.ofPattern("HH:mm");

        //Variaveis
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(ler.next(), formaData);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = ler.nextInt();

        System.out.print("Digite qual foi o horário de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(ler.next(), formaData);


        //calculos
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, saida);

        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        //teste
        System.out.println("\nEntrada: " + entrada.format(formaData));
        System.out.println("saída: " + saida.format(formaData));
        System.out.println("saída prevista: " + saidaPrevista.format(formaData));

        if (horasExtras == 0 && minutosExtras == 0){
            System.out.println("Saldo de horas 00:00");
        }else {
            String sinal;
            if (horasExtras > 0 || minutosExtras > 0){
                sinal = "+";
            } else{
                sinal = "-";
            }
            System.out.println("Saldo de horas em " + sinal + Math.abs(horasExtras) + "h : " + Math.abs(minutosExtras) + "min");
        }
    }
}
