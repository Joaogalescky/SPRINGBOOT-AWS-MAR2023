package aplicacao;

import java.util.Scanner;
import entidade.ProdutoEncapsulamento;

public class ProgramaProdutoEncapsulamento {
	// 67. Object to String

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ProdutoEncapsulamento p = new ProdutoEncapsulamento();
		
		// Entrada
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Preço: ");
		double preco = entrada.nextDouble();
		ProdutoEncapsulamento produto = new ProdutoEncapsulamento(nome, preco);

		// Encapsulamento - set - alterar atributo
		produto.setNome ("Computador");
		System.out.println("Atualizar nome: " + produto.getNome());
		// Encapsulamento - get - obter atributo
		System.out.println(produto.getNome());
		
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