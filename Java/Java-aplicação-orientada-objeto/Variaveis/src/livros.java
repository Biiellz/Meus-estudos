public class livros {
    static void main(String[] args) {
        String titulo = "O pequeno Principe";
        String autor = "Antoine de Saint-Exupérry";
        int numPags = 96;
        double preço = 39.90;
        char categoria = 'F';

        String categoriaDescrição;

        if (categoria == 'F'){
            categoriaDescrição = "Ficção";
        }else if (categoria == 'N'){
            categoriaDescrição = "Não-Ficção";
        }else if (categoria == 'T'){
            categoriaDescrição = "Tecnologia";
        }else if (categoria == 'H'){
            categoriaDescrição = "História";
        }else {
            categoriaDescrição = "Caregoria inválida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numPags + " Páginas, custa R$ " + preço + " e pertence à categoria " + categoriaDescrição + ".");
        // Aspas = \"
    }
}
