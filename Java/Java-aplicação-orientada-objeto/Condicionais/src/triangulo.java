import java.util.Scanner;

public class triangulo {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado1 = ler.nextDouble();
        System.out.println("Digite o segundo lado do triângulo: ");
        double lado2 = ler.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo: ");
        double lado3 = ler.nextDouble();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1){
            System.out.println("Os lados podem formar um triângulo!");
        }else {
            System.out.println("Os lados não podem formar um triângulo!");
        }
    }
}
