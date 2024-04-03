package entidade;

import java.util.Date;

public class HoraContrato {

	private Date data;
	private Double valorPorHora;
	private Integer horas;

	// Construtor padrão
	public HoraContrato() {
	}

	// Metodo construtor
	public HoraContrato(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	// Metodo getter
	public Date getData() {
		return data;
	}

	// Metedo setter
	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double valorTotal() {
		return valorPorHora * horas;
	}
}
