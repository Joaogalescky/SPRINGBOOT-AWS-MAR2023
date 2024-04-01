package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Locale;
import java.util.Scanner;

import entidade.Departamento;
import entidade.HoraContrato;
import entidade.Trabalhador;
import entidade.enums.NivelTrabalhador;

public class ProgramaComposicao {

	public static void main(String[] args) throws ParseException {

		//Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = entrada.nextLine();
		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = entrada.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = entrada.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = entrada.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

		System.out.print("Quantos contratos esse trabalhador tem? ");
		int nContratos = entrada.nextInt();

		for (int i = 1; i <= nContratos; i++) {
			System.out.println("Entre com as informações do contrato#" + i);
			System.out.print("Data (DD/MM/AAAA: ");
			Date contratoData = sdf.parse(entrada.next());
			System.out.print("Valor por Hora: ");
			double valorPorHora = entrada.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = entrada.nextInt();
			HoraContrato contrato = new HoraContrato(contratoData, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário (MM/AAAA): ");
		String mesAno = entrada.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Salário de " + mesAno + ": " + String.format("%.2f",  trabalhador.renda(ano, mes)));
		
		entrada.close();
	}

}
