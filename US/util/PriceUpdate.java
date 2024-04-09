package util;

import java.util.function.Consumer;

import entities.Product256;

public class PriceUpdate implements Consumer<Product256> {

	@Override
	public void accept(Product256 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}