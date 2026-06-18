import java.util.Scanner;

public class sangue {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = ler.nextInt();

        System.out.println("Digite o peso do doador: (kg)");
        double peso = ler.nextDouble();

        if (idade >= 18 && idade <= 65) {
            if (peso > 50) {
                System.out.println("Doador compátivel");
            } else {
                System.out.println("Doador não é compatível");
                System.out.println("Motivo: deve ter mais de 50kg");
            }
        } else{
            System.out.println("Doador não é compatível");
            System.out.println("Motivo: deve ter entre 18 e 65 anos ");
        }
    ler.close();
    }
}
