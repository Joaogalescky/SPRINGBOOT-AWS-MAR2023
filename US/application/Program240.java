import java.util.Arrays;
import java.util.List;

//Tipo curinga (dos Tipos Generics)
/*
    Esse <?> é conhecido como tipo curinga (Wild Card). Ele faz parte dos tipos genéricos. Com ele você consegue receber um genérico de qualquer tipo
*/
//Tipo Generics
/*
    Os tipos genéricos servem para flexibilizar a implementação. Pois eles aceitam um numero maior de tipos diferentes.
    Os genéricos são ótimos para fazer reuso de classes e métodos pois eles podem ser parametrizados por tipo. Porém há perda de informações dos tipos durante sua execução
*/

public class Program240 {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    // Esse método funcinaria para qualquer tipo de lista
    public static void printList(List<?> list) {
        // list.add(3) //Erro de compilação, pois o compilador não sabe se será compátivel com o tipo da lista (não dá para adicionar)
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
