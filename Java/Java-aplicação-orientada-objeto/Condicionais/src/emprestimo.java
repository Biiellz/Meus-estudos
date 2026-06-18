import java.util.Scanner;

public class emprestimo {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo desejado? ");
        double valor = ler.nextDouble();

        if (valor >= 1000 && valor <= 5000){
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        }else {
            System.out.println("O valor " +  valor + " não está dentro do intervalo permitido para empréstimo. ");
        }

    }
}
