package Escola;

public class Docente extends Pessoa{
    private String materia;

    public Docente(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    @Override
    void exibirDados() {
        System.out.printf("Docente: %s - Idade: %d - Matéria: %s\n ",getNome(), getIdade(), materia);
    }
}
