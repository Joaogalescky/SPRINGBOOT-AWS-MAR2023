package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa219 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o caminho de um arquivo: ");
        String strPath = entrada.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        entrada.close();
    }

}
