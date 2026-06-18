package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Tarefas tarefa1 = new Tarefas("Estudar java", true);
        Tarefas tarefa2 = new Tarefas("Estudar Api", false);


        List<Tarefas> lista = new ArrayList<>();
        lista.add(tarefa1);
        lista.add(tarefa2);

        for (Tarefas i : lista){
            i.mostrarDados();
        }
    }
}
