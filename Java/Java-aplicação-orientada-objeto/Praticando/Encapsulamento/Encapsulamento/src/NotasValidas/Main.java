package NotasValidas;

public class Main {
    static void main(String[] args) {
        Materia matematica = new Materia("matematica");

        matematica.adicionarNota(5);
        matematica.adicionarNota(3);
        matematica.adicionarNota(9);
        matematica.adicionarNota(11);
        matematica.adicionarNota(9);
        matematica.adicionarNota(7);
        matematica.adicionarNota(-1);

        System.out.println("Total de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média em Matemática: " + matematica.calcularMedia());
    }
}
