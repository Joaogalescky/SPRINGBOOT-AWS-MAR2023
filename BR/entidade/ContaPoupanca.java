package entidade;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void updateSaldo() {
		saldo += saldo * taxaJuros;
	}

	// Anotação Override é para indicar ao compilador que é uma sobreposição sobre a superclasse
	// Quando está com @Override, o nome do método tem que ser igual ao da superclasse
	@Override
	public final void saque(double valor) {
		saldo -= valor;
	}
}
