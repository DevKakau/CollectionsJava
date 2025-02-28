package main;

import dominio.OrdenacaoPessoa;
import dominio.Pessoa;

import java.io.ObjectStreamException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        OrdenacaoPessoa listaPessoas = new OrdenacaoPessoa();
        listaPessoas.adicionarPessoa("Kauã",  19, 1.75);
        listaPessoas.adicionarPessoa("Ana",  25, 1.65);
        listaPessoas.adicionarPessoa("Bruno",  22, 1.80);
        listaPessoas.adicionarPessoa("Carlos",  30, 1.78);
        listaPessoas.adicionarPessoa("Débora",  27, 1.72);
        listaPessoas.adicionarPessoa("Eduardo",  21, 1.85);
        listaPessoas.adicionarPessoa("Fernanda",  24, 1.60);
        listaPessoas.adicionarPessoa("Gabriel",  26, 1.82);
        listaPessoas.adicionarPessoa("Helena",  23, 1.68);
        listaPessoas.adicionarPessoa("Igor",  28, 1.79);

        var ordenadosPorAltura = listaPessoas.ordenarPorAltura();
        var ordenadosPorIdade = listaPessoas.ordenarPorIdade();

        System.out.println("----------------");
        System.out.println("ORDENADOS POR ALTURA");

        for(Pessoa l: ordenadosPorAltura){
            System.out.println(l.toString());
        }


        System.out.println();
        System.out.println("----------------");
        System.out.println("ORDENADOS POR IDADE");

        for(Pessoa l: ordenadosPorIdade){
            System.out.println(l.toString());
        }

    }
}