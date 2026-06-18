package Estufa;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Estufa e1 = new Estufa(39.2f, "Setor A");
        e1.relatorio();
    }
}
