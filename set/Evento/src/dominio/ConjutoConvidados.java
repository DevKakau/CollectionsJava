package dominio;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    Set<Convidado> listaDeConvidados;

    public ConjutoConvidados() {
        this.listaDeConvidados = new HashSet<>();
    }

    // metodos
    public void adicionarConvidado(String nome, String codigoConvite){
        listaDeConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(String codigoConvite){
        if(!listaDeConvidados.isEmpty()){
            listaDeConvidados.removeIf(convidado -> convidado.getCodigoConvite().equalsIgnoreCase(codigoConvite));
        }
    }

    public int contarConvidados() {
        return listaDeConvidados.size();
    }

    public void exibirConvidados(){
        if (!listaDeConvidados.isEmpty()){
            for(Convidado c: listaDeConvidados){
                System.out.println("Convidado: " + c.getNome() + " Codigo: " + c.getCodigoConvite());
            }
        }
        else {
            System.out.println("nenhum convidado na lista");
        }
    }
}
