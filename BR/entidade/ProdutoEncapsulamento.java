package entidade;

public class ProdutoEncapsulamento {
	// 67. Object to String

	private String nome;
	private double preco;
	private int quantidade;
	
	// Construtor padrão
	public ProdutoEncapsulamento() {
	}
	
	// Metodo construtor - por regra, utiliza os mesmos nomes das variaveis que esta
	public ProdutoEncapsulamento(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtor sobrecarregado de parametros
	public ProdutoEncapsulamento(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// Encapsulamento - get - obter atributo
	public String getNome() {
		return nome;
	}
	
	// Encapsulamento - set - alterar atributo
	public void setNome(String nome) {
		this.nome = nome;
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
