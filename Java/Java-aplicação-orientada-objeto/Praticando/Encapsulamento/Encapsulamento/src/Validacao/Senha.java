package Validacao;

import java.util.Scanner;

public class Senha {
    private String usuario;
    private String senha;

    public Senha(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    Scanner ler = new Scanner(System.in);

    public String getSenha() {
        return senha;
    }

    public void setSenha(String novaSenha){
        System.out.println("Digite sua senha antiga pra alterar a senha");
        String tentativaSenha = ler.nextLine();

        if(tentativaSenha.equals(this.getSenha())){
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }else {
            System.out.println("Senha atual incorreta. A senha nao foi alterada.");
        }
    }
}
