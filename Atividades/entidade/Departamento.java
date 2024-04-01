package entidade;

public class Departamento {

	private String nome;

	public Departamento() {
	}

	// Construtor
	public Departamento(String nome) {
		this.nome = nome;
	}

	// Metodo getter
	public String getNome() {
		return nome;
	}

	// Metodo setter
	public void setNome(String nome) {
		this.nome = nome;
	}
}
