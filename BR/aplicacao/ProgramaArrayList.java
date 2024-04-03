package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaArrayList {

	public static void main(String[] args) {

		// Lista - Classe ArrayList - permite acesso direto aos elementos da lista
		List<String> list = new ArrayList<>();

		// Add elementos na lista
		list.add("Maria");
		list.add("Pedro");
		list.add("Joao");
		list.add("Carlos");
		list.add("Carol");
		list.add("Carolina");
		list.add("Matheus");
		// Add entre elementos da lista
		list.add(2, "Marco");

		// Retorna o tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------");
		// Remover elementos da lista
		list.remove("Joao");
		// Remover pela posicao index
		list.remove(1);
		// Remover por predicado (Lambda)
		list.removeIf(x -> x.charAt(0) == 'C');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		// Encontrar a posicao de um elemento na lista
		System.out.println("Index de Carolina: " + list.indexOf("Carolina"));
		// Encontrar a posicao de um elemento não existe na lista
		System.out.println("Index de Zanata: " + list.indexOf("Zanata"));
		
		System.out.println("--------------------");
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(nome);
	}
}
