import Aula04.toolkit;

import java.awt.*;

public class Resolucao {
    public static void main() {

    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimensao = toolkit.getScreenSize();

    int largura = (int) dimensao.getWidth();
    int altura = (int) dimensao.getHeight();

        System.out.println("Sua tela tem a resolução de " + largura + "X " + altura);
    }
}
