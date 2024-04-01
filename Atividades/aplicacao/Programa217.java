package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa217 {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\Users\\Skyfall_jack\\Downloads\\out.txt";

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			// Para não recriar o arq, coloque o parâmetro "true"
			for (String linha : linhas) {
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
