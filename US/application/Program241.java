import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program241 {

	/* Explicação
		No geral, o código demonstra como genéricos com curingas (<? extends Number> e <? super Number>) podem ser usados para criar métodos flexíveis e reutilizáveis para trabalhar com listas contendo elementos de um tipo específico ou seus subtipos/supertipos.
	*/

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	// Lista de Origem - List<? extends Number> --> covariancia (subtipos)
	// Lista de Destino - List<? super Number> --> contravariancia (supertipos)
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		//Usa genéricos com curingas para aceitar listas de qualquer subtipo ou supertipo de Number.
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}
}