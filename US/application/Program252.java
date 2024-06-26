import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;
import entities.Product252;

public class Program252 {

	public static void main(String[] args) {

		List<Product252> list = new ArrayList<>();

		list.add(new Product252("TV", 900.00));
		list.add(new Product252("Notebook", 1200.00));
		list.add(new Product252("Tablet", 450.00));

		/* Expressões Lambda
		 * Expressões Lambda permite criar instâncias de interfaces funcionais de forma concisa e simplificada
		*/
		/* Função anônima ou Arrow Fuction
		 * É uma forma de simplificar a criação de funções menores e de executar o código exatamente no local que foi escrito 
		*/ 
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product252 p : list) {
			System.out.println(p);
		}
	}
}