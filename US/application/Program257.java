package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product257;
import util.UpperCaseName;

public class Program257 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product257("Tv", 900.00));
		list.add(new Product257("Mouse", 50.00));
		list.add(new Product257("Tablet", 350.50));
		list.add(new Product257("HD Case", 80.90));

		Function<Product, String> func = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}