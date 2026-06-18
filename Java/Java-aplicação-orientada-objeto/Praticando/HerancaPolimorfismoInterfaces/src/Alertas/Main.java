package Alertas;

public class Main {
    static void main(String[] args) {
        Email email = new Email("biel123", "Cada vez melhorando mais em", "Estudos");
        Sms sms = new Sms("(61) 991372494", "Parabens pela sua inscrição");
        Push push = new Push("Usuario", "Você tem uma nova mensagem não lida." ,"Nova mensagem");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}
