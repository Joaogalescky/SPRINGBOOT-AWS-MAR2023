package services;

import java.util.List;

public class CalculationService {

    //public static <T extends Comparable<? super T>> T max(List<T> list)
    //Tipo comparável <T> ou qualquer superclasse de <T> (product ou superclasse de product)
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}