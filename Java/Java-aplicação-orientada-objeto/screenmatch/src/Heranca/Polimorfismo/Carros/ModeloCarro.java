package Praticando.Heranca.Polimorfismo.Carros;
// Classe de Teste
public class ModeloCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Prisma LTZ");
        carro1.definirPrecos(50000, 65000, 90000);
        carro1.exibirInfo();
    }
}
