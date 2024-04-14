import java.util.Map;
import entities.Product;
import java.util.HashMap;

//Aula 248 - Map<K,V> - Demo 1
public class Program248 {
    //kaySet() - retorna um Set<K>

    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        stock.put(p1, 10000.00);
        stock.put(p2, 20000.00);
        stock.put(p3, 15000.00);

        /* Explicação
         * Quando não há HashCode equals, o programa vai se orientar por comparação de ponteiros, logo, por haver 2 objetos diferentes, as referências dos ponteiros são diferentes, sendo por isso, que o retorna da saída sera "false"
         * Tendo o HashCode equals inserido na classe Product, o código ira  comparar os valores Hash de cada item, mesmo sendo instancias diferentes, retornando "true" neste caso
        */

        Product ps = new Product("TV", 900.00);

        System.out.println("COntains 'ps' key: " + stock.containsKey(ps));
    }
}