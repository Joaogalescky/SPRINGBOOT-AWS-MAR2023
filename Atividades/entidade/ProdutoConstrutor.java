package entidade;

public class ProdutoConstrutor {
	// 67. Object to String

	public String nome;
	public double preco;
	public int quantidade;

	// Metodo construtor - por regra, utiliza os mesmos nomes das variaveis que esta
	// utilizando
	public ProdutoConstrutor(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// função sem retorno
	public double totalValorEstoque() {
		return preco * quantidade;
	}

	// função sem retorno
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	// função sem retorno
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	// função com retorno
	public String toString() {
		return nome + 
			", R$ " + 
			String.format("%.2f", preco) +
			", " + 
			quantidade + 
			" unidades, Total: R$ "
			+ String.format("%.2f", totalValorEstoque());
	}
}
