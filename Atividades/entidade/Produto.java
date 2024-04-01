package entidade;

public class Produto {
	//67. Object to String
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$ "
			+ String.format("%.2f", totalValorEstoque());
	}
}
