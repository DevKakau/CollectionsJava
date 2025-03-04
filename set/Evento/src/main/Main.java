package main;

import dominio.ConjutoConvidados;

public class Main {

    public static void main(String[] args) {

        ConjutoConvidados listaDeConvidados = new ConjutoConvidados();
        listaDeConvidados.adicionarConvidado("Kauã", "124ASD");
        listaDeConvidados.adicionarConvidado("Kauã", "124ASD");
        listaDeConvidados.adicionarConvidado("Ana", "125BSF");
        listaDeConvidados.adicionarConvidado("Pedro", "126GHR");
        listaDeConvidados.adicionarConvidado("Maria", "127JKL");
        listaDeConvidados.adicionarConvidado("Carlos", "128MNO");
        listaDeConvidados.adicionarConvidado("Juliana", "129PQR");

        listaDeConvidados.removerConvidadoPorCodigoConvite("124ASD");

        System.out.println(listaDeConvidados.contarConvidados());


        listaDeConvidados.exibirConvidados();
    }
}