import java.util.HashSet;
import java.util.Set;
import entities.Product;

public class Program244 {
    public static void main(String[] args) {

        /*
         * Explicacao
         * A classe produtc não contem a implementacao do HashCode equals. Logo o Set
         * vai utilizar a referencia de ponteiros para equiparar as variaveis
         * Por serem instancias diferentes, a resposta vai ser "false"
         */

        // Para comparar o conteudo de uma váriavel, utiliza-se o HashCode equals na classe Product
        // Apos isso, a saida dara como "true"

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));
    }
}