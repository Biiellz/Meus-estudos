import java.util.Scanner;

public class eCommerce {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String categoria;

    System.out.println("Qual o valor do produto?");
    double preco = ler.nextDouble();

    if (preco <= 50){
        categoria = "Econômico";
    } else if (preco > 50 && preco <= 200) {
        categoria = "Intermediário";
    } else {
        categoria = "Premium";
    }

        System.out.println("Categoria do produto: " + categoria);
    }
}
