package ConsolidandoConcecimentos;
import java.util.Scanner;

public class ContaBancaria {
        public static void main() {
        Scanner ler = new Scanner(System.in);
        double saldo = 2500;

            /*
        * Dados cliente
        * nome gabriel siqueira
        * tipo conta corrente
        * saldo: 2.500*/
                System.out.println("Operações");
                System.out.println(" ");
                System.out.println("1- Consultar saldo");
                System.out.println("2- Receber valor");
                System.out.println("3- Transfeir valor");
                System.out.println("4- Sair");
                System.out.println(" ");

                System.out.println("Digite a opção desejada");
                int opcao = ler.nextInt();

            while (opcao != 4) {
                if (opcao < 1 || opcao > 4) {
                    System.out.println("Opção invalida! Digite outra");
                    opcao = ler.nextInt();
                } else {
                    switch (opcao) {
                        case 1: //consultar
                            System.out.println("Saldo atualizado: " + saldo);
                            break;
                        case 2: //receber
                            System.out.println("Quanto irá receber? ");
                            int receber = ler.nextInt();
                            saldo += receber;
                            System.out.println("Saldo atualizado: " + saldo);
                            break;
                        case 3: //transefrir
                            System.out.println("Quanto deseja transefir");
                            int transefir = ler.nextInt();
                            if (transefir > saldo){
                                System.out.println("Saldo insuficiente! tente novamente");
                            }else {
                                saldo -= transefir;
                                System.out.println("Saldo atualizado: " + saldo);
                            }
                            break;
                    }
                    System.out.println("Operações");
                    System.out.println(" ");
                    System.out.println("1- Consultar saldo");
                    System.out.println("2- Receber valor");
                    System.out.println("3- Transfeir valor");
                    System.out.println("4- Sair");
                    System.out.println(" ");
                    System.out.println("Digite a opção desejada");
                    opcao = ler.nextInt();
                }
            }System.out.println("Saindo!");
    }
}
