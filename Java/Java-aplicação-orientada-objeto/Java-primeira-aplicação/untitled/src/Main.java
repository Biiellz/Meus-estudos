import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Ache o número entre 0 e 100");

        for (int i = 5; i >= 0; i--) {
            System.out.println("Qual o número escondido? ");
            Scanner ler = new Scanner(System.in);
            int tentativa = ler.nextInt();

            if (tentativa != numeroAleatorio){
                System.out.println("Você tem mais " + i + " tentativas");
                if (numeroAleatorio < tentativa){
                    System.out.println("O numero é menor que " + tentativa);
                }
                if(numeroAleatorio > tentativa){
                    System.out.println("O numero é maior que " + tentativa);
                }
                if (i == 0){
                    System.out.println("Suas tentativas acabaram! Mais sorte na próxima!");
                }
            }else {
                System.out.println("Parabens!, você acertou o número escondido era " + numeroAleatorio);
            }
        }
    }
}