import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program260 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y); // 0 é o elemento neutro da operação
        System.out.println("Sum = " + sum);

        // Pipeline - início
        List<Integer> newList = list.stream()
        // Operações intermediárias:
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
        // -------------------------
        // Operação terminal        
                .collect(Collectors.toList());
        // -------------------------
        System.out.println(Arrays.toString(newList.toArray()));
        // Pipeline - fim
    }
}
