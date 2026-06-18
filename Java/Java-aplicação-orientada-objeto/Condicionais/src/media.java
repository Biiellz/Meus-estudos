import java.util.Scanner;

public class media {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua media:");
        double media = ler.nextDouble();

        if (media >= 7){
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5) {
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }
    }
}
