public class carro {
    static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = capacidadeTanque * consumoMedio;
        double autonomiaAtual = combustivelAtual * consumoMedio;

        System.out.println("Autonômia máxima do veículo: " + autonomiaMaxima);
        System.out.println("Autonômia atual: " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem){
            System.out.println("Você conseguirá terminar a viagem sem precisar abastecer");
        }else{
            System.out.println("Você terá que abastecer na viagem");
        }
    }
}
