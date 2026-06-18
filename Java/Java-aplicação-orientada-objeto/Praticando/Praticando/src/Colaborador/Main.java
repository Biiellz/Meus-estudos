package Colaborador;

public class Main {
    static void main(String[] args) {

    Colaborador colaborador1 = new Colaborador("Julia", "Desenvolvedora Junior",1);

        System.out.println("-----Antes da atualização-----");
        colaborador1.Status();

        colaborador1.alterarNivelDeAcesso();
        System.out.println("-----Após atualização-----");
        colaborador1.Status();
    }
}
