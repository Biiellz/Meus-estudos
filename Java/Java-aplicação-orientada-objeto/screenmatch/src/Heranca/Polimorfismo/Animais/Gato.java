package Praticando.Heranca.Polimorfismo.Animais;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("miau, miau!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis");
    }
}
