package aplicacao;

import java.util.Scanner;
import entidade.Triangulo;

public class ProgramaAreaTriangulo2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		//64.Criando uma classe com três atributos para representar melhor o triângulo
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		//----------------------------------------------------------------------------
		
		System.out.println("Digite o valores do triangulo X: ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Digite o valores do triangulo Y: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();		
		
		//65.Criando um método para obtermos os benefícios de reaproveitamento e delegação
		double areaX = x.area();
		double areaY = y.area();
		//--------------------------------------------------------------------------------
		
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
