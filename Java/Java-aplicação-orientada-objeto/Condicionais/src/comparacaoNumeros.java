import java.util.Scanner;

public class comparacaoNumeros {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = ler.nextInt();

        ler.close();

        if (num1 == num2){
            System.out.println("Os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior!");
        }else{
            System.out.println("O segundo número é maior!");
        }
    }
}
