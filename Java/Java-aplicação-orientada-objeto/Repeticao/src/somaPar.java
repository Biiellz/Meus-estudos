public class somaPar {
    static void main(String[] args) {

        int somaPar = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                somaPar += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + somaPar);
    }
}
