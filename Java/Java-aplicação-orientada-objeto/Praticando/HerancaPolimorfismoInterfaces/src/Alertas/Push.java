package Alertas;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando e-mail para: %s_app\nTítulo: %s\nCorpo: %s\n", getDestinatario(), getTitulo(), getMensagem());
    }
}
