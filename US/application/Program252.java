package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product252;

public class Program252 {

	public static void main(String[] args) {

		List<Product252> list = new ArrayList<>();

		list.add(new Product252("TV", 900.00));
		list.add(new Product252("Notebook", 1200.00));
		list.add(new Product252("Tablet", 450.00));

		list.sort(new MyComparator());

		for (Product252 p : list) {
			System.out.println(p);
		}
	}
}