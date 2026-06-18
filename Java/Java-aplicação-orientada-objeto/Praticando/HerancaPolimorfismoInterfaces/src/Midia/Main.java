package Midia;

public class Main {
    static void main(String[] args) {
        Livro livro = new Livro("jantar Secreto", 2020, "Raphael Montes");
        Revista revista = new Revista("jantar Secreto", 2020, "251");
        Ebook ebook = new Ebook("jantar Secreto", 2020, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
