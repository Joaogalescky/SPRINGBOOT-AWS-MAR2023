import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorteador {
    public static void main(String[] args) {

        // entrada
        String nomeArq, nomeArqEmbaralhado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo:");
        nomeArq = entrada.next();

        // processo
        System.out.println("Conteúdo do arquivo texto:");
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);

            ArrayList<String> linhas = new ArrayList<>();
            String linha = lerArq.readLine();

            while (linha != null) {
                linhas.add(linha);
                linha = lerArq.readLine();
            }
            arq.close();

            // exibir o conteúdo do arquivo
            for (String linhaLida : linhas) {
                System.out.println(linhaLida);
            }

            // nome do arquivo embaralhado
            System.out.println("Digite o nome do novo arquivo embaralhado:");
            nomeArqEmbaralhado = entrada.next();

            // embaralhar linhas lidas
            Collections.shuffle(linhas);

            // escrever o conteúdo embaralhado em um novo arquivo
            PrintWriter gravarArq = new PrintWriter(new FileWriter(nomeArqEmbaralhado));

            for (String linhaEmbaralhada : linhas) {
                if (linhaEmbaralhada != null) {
                    gravarArq.println(linhaEmbaralhada);
                }
            }
            // saida
            gravarArq.close();
            System.out.println("Arquivo embaralhado criado com sucesso: " + nomeArqEmbaralhado);
        } catch (Exception e) {
            System.out.printf("Erro no arquivo: %s.\n", e.getMessage());
        }
        entrada.close();
    }
}