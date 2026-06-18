package AutomacaoResidencial;

public class Luz implements Controlavel{

    private boolean ligado = false;

    @Override
    public void ligar() {
        if (ligado){
            System.out.println("Luz já está ligada.");
        }else {
            ligado = true;
            System.out.println("Luz ligada");
        }
    }

    @Override
    public void desligar() {
        if (!ligado){
            System.out.println("Luz já está desligada.");
        }else {
            ligado = false;
            System.out.println("Luz desligada");
        }
    }
}
