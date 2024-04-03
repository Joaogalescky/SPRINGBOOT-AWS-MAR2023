package aplicacao;

import java.util.Scanner;

public class ProgramaAreaTriangulo {
	//63.Resolvendo um problema sem orientação a objetos

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite o valores do triangulo X: ");
		xA = entrada.nextDouble();
		xB = entrada.nextDouble();
		xC = entrada.nextDouble();
		
		System.out.println("Digite o valores do triangulo Y: ");
		yA = entrada.nextDouble();
		yB = entrada.nextDouble();
		yC = entrada.nextDouble();		
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC)); 
		
		double pY = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC)); 
		
		System.out.printf("Area do triangulo X: %.4f\n", areaX);
		System.out.printf("Area do triangulo Y: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		
		entrada.close();
	}

}
