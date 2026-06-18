package NotasValidas;

import java.util.ArrayList;

public class Materia {
    private String materia;
    private double nota;
    private ArrayList<Double> notas;


    public Materia(String materia) {
        this.materia = materia;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    int contarNotasValidas(){
        return notas.size();
    }

    double soma = 0;
    double calcularMedia(){
        if (notas.isEmpty()){
            return 0;
        }

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
