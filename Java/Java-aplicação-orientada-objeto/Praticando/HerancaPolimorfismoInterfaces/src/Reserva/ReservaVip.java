package Reserva;

public class ReservaVip extends Reserva{
    @Override
    void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo!");
    }
}
