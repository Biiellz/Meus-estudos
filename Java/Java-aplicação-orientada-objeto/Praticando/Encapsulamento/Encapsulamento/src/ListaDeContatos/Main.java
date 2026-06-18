package ListaDeContatos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Contatos> listaDeContatos = new ArrayList<>();

        listaDeContatos.add(new Contatos("Julia", "(61) 999117692"));
        listaDeContatos.add(new Contatos("Alisson", "(61) 981789276"));
        listaDeContatos.add(new Contatos("Edson", "(61) 951765861"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contatos contato : listaDeContatos){
            System.out.printf("%s. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }
    }
}
