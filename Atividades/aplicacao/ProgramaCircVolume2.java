package aplicacao;

import java.util.Scanner;

import utilidade.CalculadoraFuncoesConstante;

//Versão 2 - classe Calculadora com membros de instância
public class ProgramaCircVolume2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		CalculadoraFuncoesConstante calc = new CalculadoraFuncoesConstante();
		
		System.out.println("Digite o valor do raio: ");		
		double raio = entrada.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", calc.PI);
		
		entrada.close();
	}
}
