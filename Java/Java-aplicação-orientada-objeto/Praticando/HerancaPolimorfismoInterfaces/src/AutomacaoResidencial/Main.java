package AutomacaoResidencial;

public class Main {
    static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.desligar();

        arCondicionado.desligar();
        arCondicionado.ligar();
    }
}
