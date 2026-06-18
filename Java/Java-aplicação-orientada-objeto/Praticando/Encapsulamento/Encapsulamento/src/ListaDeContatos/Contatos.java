package ListaDeContatos;

public class Contatos {
    private String nome;
    private String telefone;

    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
