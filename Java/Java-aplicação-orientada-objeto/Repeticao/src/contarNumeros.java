import java.util.Scanner;

public class contarNumeros {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean continuar = true;
        int positivos = 0;
        int negativos = 0;

        while (true){
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String entrada = ler.nextLine();

            if (entrada.equals("fim")){
                break;
            }

            int numeros = Integer.parseInt(entrada);

            if (numeros > 0){
                positivos++;
            }else {
                negativos++;
            }
        }
        System.out.println("Tem " + positivos + " positivos.");
        System.out.println("Tem " + negativos + " negativos.");
        ler.close();
    }
}
