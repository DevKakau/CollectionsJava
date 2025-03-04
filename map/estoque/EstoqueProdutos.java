package estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    // adicionar estoque.Produto

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    // exibir produtos
    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    // calcular o valor total de todos os produtos no estoque
    public double calcularValorTotalEstoque(){
        double valorTotal = 0.0;

        if(!estoqueProdutos.isEmpty()){
            for(Produto p: estoqueProdutos.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return  valorTotal;
    }

    // percorrer e retornar o produto mais caro do estoque

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutos.isEmpty()){
            for(Produto p: estoqueProdutos.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    // vou encerrar a live por agora glr, obg por quem compareceu
    // se encontramos nas proximas, prometo melhorar a qualidade quando puder, com um mic
    // webcam e trazendo projetos e desafios em live
    // até mais.
}
