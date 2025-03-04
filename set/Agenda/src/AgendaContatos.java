import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> listaContatos;


    public AgendaContatos() {
        this.listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        listaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c: listaContatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int numero){
        Contato novoContato = null;

        for(Contato c: listaContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
            }
        }
        return novoContato;
    }

}
