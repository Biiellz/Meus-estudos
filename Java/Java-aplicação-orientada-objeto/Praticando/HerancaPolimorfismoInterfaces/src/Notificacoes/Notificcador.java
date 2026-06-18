package Notificacoes;

public class Notificcador {
    void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada a todos: %s\n", mensagem);
    }

    void enviarMensagem(String nome, String mensagem){
        System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
    }

    void enviarMensagem(String nome, String mensagem, int vezes){
        for (int i = 0; i < vezes; i++) {
            System.out.printf("Mensagem para %s: %s\n",nome, mensagem);
        }
    }
}
