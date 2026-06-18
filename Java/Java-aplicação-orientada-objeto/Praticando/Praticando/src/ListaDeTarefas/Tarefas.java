package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    List<String> listaDeTarefas = new ArrayList<>();
    String tarefa;
    boolean concluida;
    String status;

    public Tarefas(String tarefa, boolean concluida) {
        this.tarefa = tarefa;
        this.concluida = concluida;

    }

    public void mostrarDados(){

        if (this.concluida){
            status = "Concluída";
        }else {
            status = "Pendente";
        }

        System.out.println("Tarefa: " + this.tarefa + " - Status: " + this.status);
        }
    }
