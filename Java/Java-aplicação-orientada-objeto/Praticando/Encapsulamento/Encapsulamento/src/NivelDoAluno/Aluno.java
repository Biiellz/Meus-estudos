package NivelDoAluno;

public class Aluno {
    private String nome;
    private int pontosAtuais;
    private int nivel;

    public Aluno(String nome, int pontosAtuais) {
        this.nome = nome;
        this.pontosAtuais = pontosAtuais;
    }

    void adicionarPontos(double pontos){
           pontosAtuais += pontos;
           atualizarNivel();
    }

    private void atualizarNivel() {
        this.nivel = (pontosAtuais / 100) + 1;
    }

    void exibirStatus(){
        System.out.printf("Nome: %s\n Pontos: %d\n Nível: %d\n", nome, pontosAtuais, nivel);
    }
}
