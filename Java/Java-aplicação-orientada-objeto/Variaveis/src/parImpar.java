import java.util.Scanner;

public class parImpar {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if (num % 2 == 0){
            System.out.println("Este número é par");
        }else {
            System.out.println("Este número é ímpar");
        }
    }
}
