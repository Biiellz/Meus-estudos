package Colaborador;

public class Colaborador {
    String nome;
    String cargo;
    int nivelDeAcesso;

    public Colaborador(String nome, String cargo, int nivelDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void alterarNivelDeAcesso(){
        nivelDeAcesso += 1;
        cargo = "Engenheira de Sortware";
    }

    public void Status(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelDeAcesso);
    }
}

