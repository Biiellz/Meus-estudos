import java.util.Scanner;

public class maiorValor {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os números separados por espaços: ");
        String[] valoresStr = ler.nextLine().split(" ");

        int maior = Integer.MIN_VALUE;

        for (String numStr : valoresStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        ler.close();
    }
}
