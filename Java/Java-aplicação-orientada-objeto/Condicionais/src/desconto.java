import java.util.Scanner;

public class desconto {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = ler.nextDouble();

        if (valor >= 100){
            double desconto = valor * 0.1;
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: " + (valor - desconto));
        }else{
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("Valor total: " + valor);
        }
        ler.close();
    }
}
