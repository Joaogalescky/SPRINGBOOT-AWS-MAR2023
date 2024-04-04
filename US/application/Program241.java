package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program241 {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	/* Soluções impróprias:
	 * 
	 * public double totalArea(List<Shape> list)
	 * 
	 * public double totalArea(List<?> list)
	 * 
	 * 
	 * Não poderá add elementos na lista do método
	 */

	public static double totalArea(List<? extends Shape> list) {
		// list.add(new Rectangle(3.0, 4.0)) //erro de compilação
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}