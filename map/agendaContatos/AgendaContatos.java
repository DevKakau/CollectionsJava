package agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos
    Map<String, Integer> listaDeContatos;

    public  AgendaContatos(){
        this.listaDeContatos = new HashMap<>();
    }

    // metodos

    public void adicionarContato(String nome, int numero){
        listaDeContatos.put(nome, numero);
    }

    // metodo para remover um contato da lista
    public void removerContato(String nome){
        if(!listaDeContatos.isEmpty()){
            if(listaDeContatos.containsKey(nome)){
                listaDeContatos.remove(nome);
            }
            else{
                System.out.println("agendaContatos.Contato não encontrado!!");
            }
        }
        else {
            System.out.println("Agenda contatos está vazia!!");
        }


    }

    public void exibirContatos(){

        listaDeContatos.forEach((nome, numero) ->
                System.out.println("agendaContatos.Contato: " + nome + " -> " + " Numero: " + numero));
    }

    public Integer pesquisarPorNome(String nome) {

        Integer numeroEncontrado = null;
        if (!listaDeContatos.isEmpty()) {
            if (listaDeContatos.containsKey(nome)) {
                numeroEncontrado = listaDeContatos.get(nome);
            }
        }
        return numeroEncontrado;
    }
}
