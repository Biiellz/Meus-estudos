package Reserva;

public class Reserva {
    void reservar(){
        System.out.println("Reserva realizada");
    }

    void reservar(String data){
        System.out.printf("Reserva feita para o dia %s\n", data);
    }

    void reservar(String data, int pessoas){
        System.out.printf("Reserva feita para o dia %s para %s\n pessoas", data, pessoas);
    }
}
