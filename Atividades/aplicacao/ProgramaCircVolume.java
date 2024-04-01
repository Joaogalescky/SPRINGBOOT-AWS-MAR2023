package aplicacao;

import java.util.Scanner;

//Versão 1 - métodos na própria classe do programa
public class ProgramaCircVolume {

	//Declaracao da constante estática (Por regra, o nome tem que ser MAÍSCULO)
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor do raio: ");
		
		double raio = entrada.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", PI);
		
		entrada.close();
	}
	//Metodos/Funções estáticas
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume (double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;
	}
}
