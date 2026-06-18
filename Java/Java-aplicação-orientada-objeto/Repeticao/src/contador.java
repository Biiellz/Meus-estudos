import java.util.Scanner;

public class contador {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Contar até quanto");
        int ateQuanto = ler.nextInt();

        for (int i = 1; i < ateQuanto; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
        ler.close();
    }
}
