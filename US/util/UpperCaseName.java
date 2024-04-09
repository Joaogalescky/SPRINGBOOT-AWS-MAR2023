package util;

import java.util.function.Function;

import entities.Product257;

public class UpperCaseName implements Function<Product257, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}