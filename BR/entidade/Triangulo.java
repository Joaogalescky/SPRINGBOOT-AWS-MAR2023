package entidade;

public class Triangulo {
	
	//64.Criando uma classe com três atributos para representar melhor o triângulo
	public double a;
	public double b;
	public double c;
	//----------------------------------------------------------------------------
	
	//65.Criando um método para obtermos os benefícios de reaproveitamento e delegação
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	//---------------------------------------------------------------------------------
	}
}
