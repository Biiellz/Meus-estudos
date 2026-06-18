package Escola;

public class Main {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", 20);
        Docente docente1 = new Docente("Julia ", 19, "Inglês");
        Docente docente2 = new Docente("Luis ", 18, "Educação Física");
        Aluno aluno1 = new Aluno("Kawa", 17, 7);
        Aluno aluno2 = new Aluno("Luis ", 16, 9);

        pessoa.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();
        aluno1.exibirDados();
        aluno2.exibirDados();
    }
}
