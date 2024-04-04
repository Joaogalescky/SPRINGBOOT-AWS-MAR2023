package application;

import java.util.Map;
import java.util.TreeMap;

//Aula 248 - Map<K,V> - Demo 1
public class Program248 {
    //kaySet() - retorna um Set<K>

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133"); //vai substituir o valour da key "phone" - 997711122 por 99771133, pois há esta passando a mesma key com um valour diferente

        System.out.println("==========================");
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}