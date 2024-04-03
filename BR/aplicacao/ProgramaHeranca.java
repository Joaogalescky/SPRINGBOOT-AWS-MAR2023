package aplicacao;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;

public class ProgramaHeranca {

	public static void main(String[] args) {
		
		Conta conta = new Conta( 1001, "João", 0.00);
		ContaComercial cc = new ContaComercial(1002, "Maria", 0.0, 500.00);
		
		
		// Upcasting
		Conta conta1 = cc;
		// Pegando objeto de uma subclasse e atribuindo para uma variavel da superclasse
		Conta conta2 = new ContaComercial(1003, "Pedro", 0.00, 200.00);
		Conta conta3 = new ContaPoupanca(1004, "Ana", 0.00, 0.01);
		
		// Downcasting
		ContaComercial conta4 = (ContaComercial)conta2;
		conta4.emprestimo(100.00);
		
		// Exemplo de erro: ClassCastException
		// ContaComercial conta5 = (ContaComercial)conta3;
		// Para evitar esse tipo de erro, deve-se fazer o teste, utilizando "instanceof"
		
		
		// IntanceOf
		if (conta3 instanceof ContaComercial) {
			 ContaComercial conta5 = (ContaComercial)conta3;
			 conta5.emprestimo(200.00);
			 System.out.println("Emprestimo!");
		}
		
		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			conta5.updateSaldo();
			System.out.println("Atualizado!");
		}
		
		System.out.println("-----------------------------");
		
		Conta conta6 = new Conta(1005, "Marlene", 1000.00);
		conta6.saque(200.00);
		System.out.println(conta6.getSaldo());
		
		Conta conta7 = new ContaPoupanca(1006, "Marcela", 1000.00, 0.01);
		conta7.saque(200.00);
		System.out.println(conta7.getSaldo());
		
		
		Conta conta8 = new ContaComercial(1007, "Bruno", 1000.00, 500.00);
		conta8.saque(200.00);
		System.out.println(conta8.getSaldo());
	}

}
