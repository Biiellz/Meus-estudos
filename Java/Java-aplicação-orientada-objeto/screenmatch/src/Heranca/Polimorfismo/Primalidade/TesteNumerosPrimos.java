package Praticando.Heranca.Polimorfismo.Primalidade;

public class TesteNumerosPrimos extends Primalidade{
    public static void main(String[] args) {
        VerificaPrimo verificador = new VerificaPrimo();
        verificador.verificarSeEhPrimo(17);

        GeraPrimo gerador = new GeraPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        Primalidade numerosPrimos = new Primalidade();
        numerosPrimos.listarPrimos(30);
    }
}

