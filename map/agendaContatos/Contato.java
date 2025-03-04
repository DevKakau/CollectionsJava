package agendaContatos;

public class Contato {
    // atributos
    private String nome;
    private int numero;

    // construtor

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    // getters

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
