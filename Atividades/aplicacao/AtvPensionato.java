package aplicacao;

import java.util.Scanner;
import entidade.Aluguel;

public class AtvPensionato {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Aluguel[] vetor = new Aluguel[10];

		System.out.println("Quantos quartos você deseja alugar? ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
 
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Email: ");
			String email = entrada.next();

			System.out.print("Quarto: ");
			int quartoNumero = entrada.nextInt();

			vetor[quartoNumero] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for (int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println( i + ": " + vetor[i]);
			}
		}
		entrada.close();
	}
}
