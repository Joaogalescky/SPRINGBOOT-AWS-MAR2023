
// Bibliotecas
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Classe
public class SorteadorGrupo {

    // Metodo Main
    public static void main(String[] args) {

        // Variaveis
        String nomeArq, nomeArqEmbaralhado;
        int nIntegrantesPorGrupo, nGrupos;

        // Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo:");
        nomeArq = entrada.next();

        // Processo
        System.out.println("Conteúdo do arquivo texto:");
        try (BufferedReader lerArq = new BufferedReader(new FileReader(nomeArq))) {
            ArrayList<String> linhas = new ArrayList<>();
            String linha;

            while ((linha = lerArq.readLine()) != null) {
                linhas.add(linha);
                System.out.println(linha);
            }

            // Nome do arquivo embaralhado
            System.out.println("Digite o nome do novo arquivo embaralhado:");
            nomeArqEmbaralhado = entrada.next();

            // Número de integrantes por grupo
            System.out.println("Digite o número de integrantes por grupo:");
            nIntegrantesPorGrupo = entrada.nextInt();

            // Embaralhar linhas lidas
            Collections.shuffle(linhas);

            // Separar linhas em grupos com a menor variação possível
            nGrupos = (int) Math.ceil((double) linhas.size() / nIntegrantesPorGrupo);

            try (PrintWriter gravarArq = new PrintWriter(new FileWriter(nomeArqEmbaralhado))) {

                for (int i = 0; i < nGrupos; i++) {
                    int inicio = i * nIntegrantesPorGrupo; // Calculo do indice inicial
                    int fim = Math.min((i + 1) * nIntegrantesPorGrupo, linhas.size()); // Calculo do indice final

                    for (int j = inicio; j < fim; j++) { // Gravacao das linhas no novo arq pelo indice inicial ate o indice final
                        gravarArq.println(linhas.get(j));
                    }
                    gravarArq.println(); // Adiciona uma linha em branco entre os grupos
                }

            }
            System.out.println("Arquivo embaralhado criado com sucesso: " + nomeArqEmbaralhado);

        } catch (Exception e) {
            System.out.printf("Erro no arquivo: %s.\n", e.getMessage());
        }
        entrada.close();
    }
}