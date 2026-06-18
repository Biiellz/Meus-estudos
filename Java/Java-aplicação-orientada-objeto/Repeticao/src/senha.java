import java.util.Scanner;

public class senha {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senha = "1234";

        System.out.println("Digite a senha: ");
        String tent = ler.nextLine();

        if (!tent.equals(senha)){
            for (int i = 2; i >= 0; i--) {
                if (i == 0){
                    System.out.println("Conta bloqueada temporariamente");
                } else {
                    System.out.println("Senha incorreta! Você tem " + i + " tentativas.");
                    tent = ler.nextLine();
                }
            }
        }else {
            System.out.println("Senha correta! Acesso consedido.");
        }
    }
}
