package main;

import dominio.ListaTarefas;

public class Main {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // adicionando tarefa
        listaTarefas.adicionarTarefa("Almoçar");
        listaTarefas.adicionarTarefa("Fazer o jantar");
        listaTarefas.adicionarTarefa("Comprar roupas");
        listaTarefas.adicionarTarefa("Comprar placa de video");

        // removendo tarefas
        listaTarefas.removerTarefa("Almoçar");
        listaTarefas.removerTarefa("Fazer o jantar");

        System.out.println("Total de tarefas: "  + listaTarefas.retornarTotalTarefas());

        var tarefas = listaTarefas.obterTarefasComDescricao();

        System.out.println("------------------");
        System.out.println("LISTA DE TAREFAS");
        System.out.println("------------------");
        for(String e: tarefas){
            System.out.println("Tarefa: " + e);
        }
        System.out.println("-------------------");

    }
}