package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Empregado;
import entidade.EmpregadoTerceirizado;

public class ProgramaHeranca2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();

		System.out.print("Digite a quantidade de empregados: ");
		int nEmpregados = entrada.nextInt();

		for (int i = 1; i <= nEmpregados; i++) {
			System.out.println("Empregado #" + i + ", dados:");

			System.out.print("Terceirizado (s/n)? ");
			char ch = entrada.next().charAt(0);

			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Horas: ");
			int horas = entrada.nextInt();

			System.out.print("Valor por hora: ");
			double valorHora = entrada.nextDouble();

			if (ch == 's') {
				System.out.print(": ");
				double custoAdicional = entrada.nextDouble();
				list.add(new EmpregadoTerceirizado(nome, horas, valorHora, custoAdicional));
			} else {
				list.add(new Empregado(nome, horas, valorHora));
			}
		}

		System.out.println();
		System.out.println("Pagamentos:");

		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
		}
		entrada.close();
	}
}