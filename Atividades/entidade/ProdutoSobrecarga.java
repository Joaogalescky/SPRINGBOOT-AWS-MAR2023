package entidade;

public class ProdutoSobrecarga {
	// 67. Object to String

	public String nome;
	public double preco;
	public int quantidade;
	
	// Construtor padrão
	public ProdutoSobrecarga() {
	}
	
	// Metodo construtor - por regra, utiliza os mesmos nomes das variaveis que esta
	public ProdutoSobrecarga(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtor sobrecarregado de parametros
	public ProdutoSobrecarga(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
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
