import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = ler.nextInt();
        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
        System.out.println(mensagem);
    }
}
