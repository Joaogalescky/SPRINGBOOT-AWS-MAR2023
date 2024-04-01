package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa218 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o caminho da pasta: ");

		String strPath = entrada.nextLine();
		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}

		boolean sucesso = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucesso);
		entrada.close();
	}
}
