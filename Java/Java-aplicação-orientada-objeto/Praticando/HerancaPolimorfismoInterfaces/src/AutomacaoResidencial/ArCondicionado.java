package AutomacaoResidencial;

public class ArCondicionado implements Controlavel{

    private boolean ligado = false;

    @Override
    public void ligar() {
        if (ligado){
            System.out.println("Ar condicionado já está ligado.");
        }else {
            ligado = true;
            System.out.println("Ar condicionado ligado");
        }
    }

    @Override
    public void desligar() {
        if (!ligado){
            System.out.println("Ar condicionado já está desligado.");
        }else {
            ligado = false;
            System.out.println("Ar condicionado desligado");
        }
    }
}
