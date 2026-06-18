import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = ler.nextInt();

        for (int i = 0; i < degraus; i++) {
            System.out.println("Subindo o degrau " + (i + 1));
        }
        System.out.println("Você chegou ao topo!");
    }
}