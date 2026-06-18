package NivelBateria;

public class Bateria {
    private int porcentagem;

    public Bateria(int porcentagem) {
            this.porcentagem = porcentagem;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void statusBateria(){
        if (getPorcentagem() < 0 || getPorcentagem() > 100) {
            System.out.println("Coloque um nível de bateria inválido");
        } else if (getPorcentagem() >= 0 && getPorcentagem() <= 20){
            System.out.println("Status: Bateria fraca");
        } else if (getPorcentagem() < 80) {
            System.out.println("Status: Bateria ok");
        }else {
            System.out.println("Status: Bateria cheia");
        }
    }
}
