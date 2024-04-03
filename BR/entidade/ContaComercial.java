package entidade;

//Subclase (classe derivada)
public class ContaComercial extends Conta {
	// A classe ContaComercial extende a classe Conta

	private Double limiteEmprestimo;

	public ContaComercial() {
		super(); // Super() : executar a lógica do construtor da classe base ou da super classe
	}

	public ContaComercial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo); // Chamando construtor da super classe (classe Conta)
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.00;
		}
	}
	
	@Override
	public void saque(double valor) {
		//Palavra Super
		super.saque(valor);
		saldo -= 2.00;
	}
}
