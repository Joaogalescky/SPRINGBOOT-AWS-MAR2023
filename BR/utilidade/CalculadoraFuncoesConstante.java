package utilidade;

public class CalculadoraFuncoesConstante {
	//Declaracao da constante (Por regra, o nome tem que ser MAÍSCULO)
	public final double PI = 3.14159;
	
	//Metodos/Funções estáticas
	public double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public double volume (double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;
	}
}
