package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import entities.Product252;

public class Program252 {

	public static void main(String[] args) {

		List<Product252> list = new ArrayList<>();

		list.add(new Product252("TV", 900.00));
		list.add(new Product252("Notebook", 1200.00));
		list.add(new Product252("Tablet", 450.00));

		// Classe anônima
		/*
		 * Permitem criar um código mais conciso, por meio de declarações e
		 * instanciações ao mesmo tempo em uma classe. São como classes locais,
		 * desconsiderando que não possuem nome.
		 */
		Comparator<Product252> comp = new Comparator<Product252>() {
			@Override
			public int compare(Product252 p1, Product252 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		list.sort(comp);

		for (Product252 p : list) {
			System.out.println(p);
		}
	}
}