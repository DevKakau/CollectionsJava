import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();

        // para adicionar no map, utilizamos o metodo put(key, value) -> recebe dos parametros

        countries.put("USA", "Washington DC");
        countries.put("Brasil", "Brasilia");
        countries.put("Russia", "Moscow");
        countries.put("India", "New Delhi");

        // metodo remove -> passamos a chave para remover remove(key);
        // countries.remove("Brasil");

        // pra pegar os valores passamos a chave através do metodo get como no list e set

        // countries.clear(); // vai remover tudo
        System.out.println(countries.get("Brasil")); // vai retornar apenas o valor
        System.out.println(countries.size());
        countries.replace("USA", "Detroit");
        System.out.println(countries);

        // temos os metodos containsKey e containsValue que retorna true ou false
        // fazendo o retorno de acordo se tiver o valor passado como parametro na estrutura Map

        System.out.println(countries.containsKey("Brasil")); // true
        System.out.println(countries.containsKey("Japão")); // false
        System.out.println(countries.containsValue("Brasilia")); // true
        System.out.println(countries.containsValue("Casa do lula")); // false

        System.out.println("=======================");
        for(String i: countries.keySet()){
            System.out.print(i + " = ");
            System.out.print(countries.get(i) + "\n");
        }
        System.out.println("===================");

    }
}