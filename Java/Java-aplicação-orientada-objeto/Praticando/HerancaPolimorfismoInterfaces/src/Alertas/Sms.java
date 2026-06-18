package Alertas;

public class Sms extends Notificacao{
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("Enviando e-mail para: %s\nCorpo: %s\n", getDestinatario(), getMensagem());
    }
}
