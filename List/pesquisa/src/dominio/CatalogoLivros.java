package dominio;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    // metodos
    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaLivrosPorAutor = new ArrayList<>();

        if(!listaLivros.isEmpty()) {
            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).getAutor().equalsIgnoreCase(autor)) {
                    listaLivrosPorAutor.add(listaLivros.get(i));
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }

        return listaLivrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivroPorAno = new ArrayList<>();

        //verificar se a lista não está vazia
        if(!listaLivros.isEmpty()) {
            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).getAnoPublicacao() >= anoInicial && listaLivros.get(i).getAnoPublicacao() <= anoFinal) {
                    listaLivroPorAno.add(listaLivros.get(i));
                }
            }
        }
        return listaLivroPorAno;

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = l;
                }
            }
        }
        return livroEncontrado;
    }

}
