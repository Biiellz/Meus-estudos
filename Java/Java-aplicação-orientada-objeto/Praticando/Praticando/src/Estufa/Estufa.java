package Estufa;

public class Estufa {
    float temperatura;
    String local;

    public Estufa(float temperatura, String local) {
        this.temperatura = temperatura;
        this.local = local;
    }

    public void relatorio(){

            System.out.println("Sensor no local " + local);
            System.out.printf("Temperatura %.1f *C\n", temperatura );

        if (temperatura > 37.2){
            System.out.printf("Alerta! a temperatura está alta demais");
        }
    }
}
