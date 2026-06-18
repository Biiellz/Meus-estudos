package Alertas;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando e-mail para: %s @gmail.com \nAssunto: %s\nCorpo: %s\n", getDestinatario(), getAssunto(), getMensagem());
    }
}
