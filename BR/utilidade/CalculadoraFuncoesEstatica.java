package utilidade;

public class CalculadoraFuncoesEstatica {
	//Declaracao da constante estática (Por regra, o nome tem que ser MAÍSCULO)
	public static final double PI = 3.14159;
	
	//Metodos/Funções estáticas
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume (double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;
	}
}
