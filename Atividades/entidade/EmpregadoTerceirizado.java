package entidade;

public class EmpregadoTerceirizado extends Empregado {

	private Double custoAdicional;

	public EmpregadoTerceirizado() {
		super();
	}
	
	public EmpregadoTerceirizado(String nome, Integer horas, Double valorHora, Double custoAdicional) {
		super(nome, horas, valorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicional * 1.1;
	}
}
