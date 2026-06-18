import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número e descubra se é par ou ímpar: ");
        int num = ler.nextInt();

        if (num % 2 == 0){
            System.out.println("Esse número é par");
        }else {
            System.out.println("Esse número é ímpar");
        }
    }
}