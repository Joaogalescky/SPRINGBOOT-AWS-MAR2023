package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product255;
import util.ProductPredicate;
import java.util.function.Predicate;

public class Program255 {

	public static void main(String[] args) {

		List<Product255> list = new ArrayList<>();

		list.add(new Product255("Tv", 900.00));
		list.add(new Product255("Mouse", 50.00));
		list.add(new Product255("Tablet", 350.50));
		list.add(new Product255("HD Case", 80.90));

		//list.removeIf( p -> p.getPrice() >= 100);
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product255::staticProductPredicate);
		//list.removeIf(Product255::nonStaticProductPredicate);
		double min = 100.0;

		Predicate<Product255> pred = p -> p.getPrice() >= min;

		list.removeIf(pred);

		for (Product255 p : list) {
			System.out.println(p);
		}
	}
}