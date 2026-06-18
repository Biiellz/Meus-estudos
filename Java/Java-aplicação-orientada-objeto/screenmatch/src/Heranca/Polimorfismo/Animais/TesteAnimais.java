package Praticando.Heranca.Polimorfismo.Animais;

public class TesteAnimais {
    static void main(String[] args) {

    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    cachorro.abanarRabo();

    Gato gato = new Gato();
    gato.emitirSom();
    gato.arranharMoveis();
    }
}
