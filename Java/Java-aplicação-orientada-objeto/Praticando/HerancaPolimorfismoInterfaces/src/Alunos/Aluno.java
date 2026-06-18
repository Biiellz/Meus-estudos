package Alunos;

public class Aluno {
    private String nome;
    private String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    void indentificar(){
        System.out.println("Aluno: " + nome + " - tipo: " + tipo);
    }
}
