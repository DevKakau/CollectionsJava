package main;

import dominio.CatalogoLivros;
import dominio.Livro;

public  class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("vivo e morto", "Jack Sparrow", 2021);

        Livro l2 = new Livro("Arte da guerra", "Holly Molly", 2025);
        Livro l3 = new Livro("100 leis da guerra", "Holly Molly", 2015);
        Livro l4 = new Livro("AutoDestruição", "Avelino Santiago", 2018);
        Livro l5 = new Livro("Coração Valente", "Gustavo Tubarão", 2019);
        Livro l6 = new Livro("Os três Porquinhos", "Shaolin Matador", 2024);

        CatalogoLivros catalogoLivros =  new CatalogoLivros();

        catalogoLivros.adicionarLivro(l1);
        catalogoLivros.adicionarLivro(l2);
        catalogoLivros.adicionarLivro(l3);
        catalogoLivros.adicionarLivro(l4);
        catalogoLivros.adicionarLivro(l5);
        catalogoLivros.adicionarLivro(l6);
       // catalogoLivros.adicionarLivro(l9);


        var livrosPorAutor = (catalogoLivros.pesquisarPorAutor("Holly Molly"));
        var livrosPorAnos = (catalogoLivros.pesquisarPorIntervaloAnos(2015, 2019));
        var livroPorTitulo = (catalogoLivros.pesquisarPorTitulo("vivo e morto"));

        System.out.println("=============================");
        System.out.println("Livros por ano de publicação");
        System.out.println("=============================");
        for(Livro livro: livrosPorAnos){
            System.out.println("-----------------------");
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
            System.out.println("-----------------------");

        }
        System.out.println();
        System.out.println("=======================");
        System.out.println("Livros por Autor");
        System.out.println("========================");

        for(Livro livro: livrosPorAutor){
            System.out.println("-----------------------");
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
            System.out.println("-----------------------");
        }

        System.out.println();
        System.out.println("========================");
        System.out.println("Livros por titulo");
        System.out.println("=========================");

        System.out.println(livroPorTitulo.toString());


    }
}