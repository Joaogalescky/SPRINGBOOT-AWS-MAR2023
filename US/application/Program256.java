package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product256;
import util.PriceUpdate;

public class Program256 {

	public static void main(String[] args) {

		List<Product256> list = new ArrayList<>();

		list.add(new Product256("Tv", 900.00));
		list.add(new Product256("Mouse", 50.00));
		list.add(new Product256("Tablet", 350.50));
		list.add(new Product256("HD Case", 80.90));

		list.forEach(new PriceUpdate());

		list.forEach(System.out::println);
	}
}