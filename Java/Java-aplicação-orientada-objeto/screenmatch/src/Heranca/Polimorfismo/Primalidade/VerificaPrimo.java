package Praticando.Heranca.Polimorfismo.Primalidade;

public class VerificaPrimo extends Primalidade {
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
