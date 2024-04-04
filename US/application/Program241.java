package application;

import java.util.ArrayList;
import java.util.List;

public class Program241 {

	public static void main(String[] args) {

		// Princípio get/put - contravariância
		/*
		 * Get - Error
		 * put - Ok
		 */

		List<Object> myObjts = new ArrayList<Object>();
		myObjts.add("Maria");
		myObjts.add("Alex");

		// Lista pode ser um tipo ou qualquer supertipo de Number
		List<? super Number> myNums = myObjts;

		myNums.add(10);
		myNums.add(3.14);

		// Não podera acessar os objetos da lista, pois a lista pode ser um supertipo de Number
		Number x = myNums.get(0); // erro de compilação
	}
}