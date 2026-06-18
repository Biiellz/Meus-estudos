import java.util.Scanner;

public class senha {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senha = "123456";

        System.out.println("Digite a senha:");
        String chave = ler.nextLine();

        ler.close();

        if (chave.equals(senha)){
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
