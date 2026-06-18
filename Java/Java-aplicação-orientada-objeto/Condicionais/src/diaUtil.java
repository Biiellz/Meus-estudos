import java.util.Scanner;

public class diaUtil {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dia da semana: (em letras minúsculas)");
        String dia = ler.nextLine();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia + " é um dia útil!");
        }else {
            System.out.println(dia + " não é um dia útil");
        }
        ler.close();
    }
}
