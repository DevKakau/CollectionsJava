package dominio;

import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }
    public Livro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Ano da Publicacao: " + anoPublicacao;
    }
}
