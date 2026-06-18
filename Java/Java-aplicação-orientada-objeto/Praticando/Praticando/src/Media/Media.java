package Media;

public class Media {
    String aluno;
    double nota1;
    double nota2;

    public Media(String aluno, double nota1, double nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirDados(){

        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media > 7){
            System.out.println("Aprovado");
        } else if (media > 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
