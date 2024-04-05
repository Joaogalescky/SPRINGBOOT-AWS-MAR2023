package util;

import java.util.function.Predicate;
import entities.Product255;

public class ProductPredicate implements Predicate<Product255> {

	@Override
	public boolean test(Product255 p) {
		return p.getPrice() >= 100.0;
	}
}