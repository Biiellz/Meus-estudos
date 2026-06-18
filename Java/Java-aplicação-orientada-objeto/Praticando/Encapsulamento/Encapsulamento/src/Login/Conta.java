package Login;

import java.util.Scanner;

public class Conta {
    private String login;
    private String senha;

    public Conta(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    Scanner ler = new Scanner(System.in);

    public void validadarSenha(){
        int tentativas = 2;
        while (tentativas > -1){
            System.out.println("login: ");
            String tentativaLogin = ler.nextLine();

            System.out.println("Senha: ");
            String tentativaSenha = ler.nextLine();


            if (tentativaLogin.equals(login) && tentativaSenha.equals(senha)){
                System.out.println("Login bem sucedido!");
                break;
            }else if (tentativas == 0){
                System.out.println("Acesso bloqueado! Maximo de tentativas");
            }else {
                System.out.println("Login ou senha incorretos. Tentativas restantes: " + tentativas);
            }
            tentativas--;
        }
        ler.close();
    }
}
