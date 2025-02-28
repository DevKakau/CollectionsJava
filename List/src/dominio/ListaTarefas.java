package dominio;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> lista;

    public ListaTarefas(){
        this.lista = new ArrayList<>();
    }

    // metodos
    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }

//    public void removerTarefa(String descricao){
//
//        var removido = false;
//        for(int i =0; i < lista.size(); i++ ){
//            if(lista.get(i).getDescricao().equals(descricao)){
//                lista.remove(i);
//                removido = true;
//            }
//        }
//        if (removido){
//            System.out.println("Tarefa removida com sucesso!!");
//        }
//        else {
//            System.out.println("Tarefa não encontrada ou erro de digitação");
//        }
//    }

    public boolean removerTarefa(String descricao){
        return lista.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int retornarTotalTarefas(){
        return lista.size();
    }

//    public void exibirTodasTarefas(){
//        System.out.println("===================");
//        System.out.println("LISTA DE TAREFAS");
//        System.out.println("===================");
//        for(int i= 0; i < lista.size(); i++){
//            System.out.println("Descrição: " + lista.get(i).getDescricao());
//        }
//        System.out.println("===================");
//    }

    public List<String> obterTarefasComDescricao() {
        List<String> tarefas = new ArrayList<>();

        lista.forEach(tarefa -> tarefas.add(tarefa.getDescricao()));

        return tarefas;
    }



}
