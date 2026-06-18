import java.util.Scanner;

public class cambio {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja converter quantos reais em dolar? ");
        double reais = ler.nextDouble();
        double taxaCambio = 5.25;
        double dolar = reais/taxaCambio;

        System.out.println("Você tem " + dolar + "dolares");
    }
}
