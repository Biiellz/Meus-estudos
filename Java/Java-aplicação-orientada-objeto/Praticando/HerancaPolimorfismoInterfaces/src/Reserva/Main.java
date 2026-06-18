package Reserva;

public class Main {
    static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.reservar();
        reserva.reservar("23/04");
        reserva.reservar("23/04", 3);

        ReservaVip reservaVip = new ReservaVip();
        reservaVip.reservar();
    }
}
