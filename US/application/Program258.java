import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.entities.Product;
import model.services.ProductService;

public class Program258 {
    public static void main(String[] args) {
         
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        ProducService ps = new ProducService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
