package Notificacoes;

public class Main {
    static void main(String[] args) {
        Notificcador mensagem = new Notificcador();
        mensagem.enviarMensagem("Bom dia");
        mensagem.enviarMensagem("Gabriel", "Atenção", 7);
        mensagem.enviarMensagem("Júlia", "Parabens");
    }
}
