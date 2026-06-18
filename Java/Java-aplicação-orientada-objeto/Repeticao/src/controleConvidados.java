import java.util.ArrayList;
import java.util.Scanner;

public class controleConvidados {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean sair = false;

        ArrayList<String> convidados = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nome = ler.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")){
                System.out.println("Programa finalizado com sucesso!");
                break;
            }

            if (nome.equalsIgnoreCase("ver")){
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for(String convidado : convidados){
                if (convidado.toLowerCase().equals(nome.toLowerCase())){
                    jaExiste = true;
                    continue;
                }
            }

            if (jaExiste){
                System.out.println("O nome " + nome + " já está na lista");
            }else {
                convidados.add(nome);
                System.out.println("O " + nome + " foi adicionado a lista!");
            }
        }
    }
}
