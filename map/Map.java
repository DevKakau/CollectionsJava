import agendaContatos.AgendaContatos;
import agendaEventos.AgendaEventos;
import estoque.EstoqueProdutos;

import java.time.LocalDate;

public  class Map {

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kakau", 93934923);
        agendaContatos.adicionarContato("kau", 62135923);
        agendaContatos.adicionarContato("Kak", 12345923);
        agendaContatos.adicionarContato("Kaau", 6232923);
        agendaContatos.adicionarContato("Kkau", 535363);

        agendaContatos.removerContato("Kakau");
        agendaContatos.removerContato("Kaau");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Kak"));

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        // Estoque produtos

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1l, "estoque.Produto A", 12.5, 10);
        estoqueProdutos.adicionarProduto(2l, "estoque.Produto B", 2.5, 1);
        estoqueProdutos.adicionarProduto(3l, "estoque.Produto C", 233.5, 4);
        estoqueProdutos.adicionarProduto(4l, "estoque.Produto D", 51.7, 6);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total dos produtos R$: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Valor do produto mais caro R$: " + estoqueProdutos.obterProdutoMaisCaro().getPreco());

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        // agenda de eventos

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2000, 9, 22), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2015, 12, 10), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 3, 15), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 5), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 20), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 1, 30), "Evento 6", "Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 12, 30), "Evento 6", "Atração 6");


        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}