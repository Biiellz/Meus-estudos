package Alunos;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", "Regular");
        Bolsistas aluno2 = new Bolsistas("Julia");
        Regulares aluno3 = new Regulares("Ana");

        aluno1.indentificar();
        aluno2.indentificar();
        aluno3.indentificar();

    }
}