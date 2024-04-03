package aplicacao;

import java.util.Scanner;
import utilidade.CalculadoraFuncoesEstatica;

//Versão 3 - classe Calculadora com método estático
public class ProgramaCircVolume3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio: ");		
		double raio = entrada.nextDouble();
		
		double c = CalculadoraFuncoesEstatica.circunferencia(raio);
		double v = CalculadoraFuncoesEstatica.volume(raio);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", CalculadoraFuncoesEstatica.PI);
		
		entrada.close();
	}
}
