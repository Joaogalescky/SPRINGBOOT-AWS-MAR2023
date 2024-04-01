package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Circulo;
import entidade.Forma;
import entidade.Retangulo;
import entidade.enums.Cor;

public class ProgramaMetodosAbstratos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Forma> lista = new ArrayList<>();

		System.out.print("Digite a quantidade de formas: ");
		int nFormas = entrada.nextInt();

		for (int i = 1; i <= nFormas; i++) {
			System.out.println("Forma #" + i + ", dados:");
			System.out.print("Retângulo ou Circulo (r/c)? ");
			char ch = entrada.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(entrada.next());
			
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = entrada.nextDouble();
				System.out.print("Altura: ");
				double altura = entrada.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			} else {
				System.out.print("Raio: ");
				double raio = entrada.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}

		System.out.println();
		System.out.println("AREAS DAS FORMAS:");
		for (Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		entrada.close();
	}
}
