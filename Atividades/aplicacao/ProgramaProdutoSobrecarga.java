package aplicacao;

import java.util.Scanner;

import entidade.ProdutoSobrecarga;

public class ProgramaProdutoSobrecarga {
	// 67. Object to String

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ProdutoSobrecarga p = new ProdutoSobrecarga();
		
		// Entrada
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Preço: ");
		double preco = entrada.nextDouble();
		ProdutoSobrecarga produto = new ProdutoSobrecarga(nome, preco);

		// Desenvolvimento
		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.print("Entre com o número de produtos para ser adicionados no estoque: ");
		int quantidade = entrada.nextInt();
		produto.adicionarProduto(quantidade);

		System.out.println();
		System.out.println("Atualização do produto: " + produto);

		System.out.println();
		System.out.print("Entre com o número de produtos para ser removidos no estoque: ");
		quantidade = entrada.nextInt();
		produto.removerProduto(quantidade);

		System.out.println();
		System.out.println("Atualização do produto: " + produto);

		entrada.close();
	}
}