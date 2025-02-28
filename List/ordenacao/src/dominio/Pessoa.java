package dominio;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return  "--------------------" + '\n' +
                "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Altura: " + altura + '\n' +
                "--------------------" + '\n';
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.getIdade());
    }

    // metodo comparator
    public static Comparator<Pessoa> compararPorAltura = new Comparator<Pessoa>(){

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    };
}
