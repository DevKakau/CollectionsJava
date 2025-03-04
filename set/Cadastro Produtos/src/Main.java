public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produtos
        cadastro.adicionarProduto(101, "Teclado", 150.0, 10);
        cadastro.adicionarProduto(102, "Mouse", 80.0, 15);
        cadastro.adicionarProduto(103, "Monitor", 700.0, 5);
        cadastro.adicionarProduto(104, "Cadeira Gamer", 1200.0, 2);
        cadastro.adicionarProduto(105, "Fone de Ouvido", 200.0, 8);

        // Exibir ordenados por nome (usa Comparable)
        System.out.println("Produtos ordenados por nome:");
        for (Produto p : cadastro.exibirProdutosPorNome()) {
            System.out.println(p);
        }

        // Exibir ordenados por preço (usa Comparator)
        System.out.println("\nProdutos ordenados por preço:");
        for (Produto p : cadastro.exibirProdutosPorPreco()) {
            System.out.println(p);
        }
    }
}