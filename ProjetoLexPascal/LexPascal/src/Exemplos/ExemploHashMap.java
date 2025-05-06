package Exemplos;

import java.util.HashMap;

public class ExemploHashMap {
    public static void executar() {
        HashMap<String, Integer> estoque = new HashMap<>();

        // Adicionando produtos e quantidades
        estoque.put("Café", 50);
        estoque.put("Chá", 30);
        estoque.put("Açúcar", 20);

        // Acessando um valor
        System.out.println("Quantidade de Café: " + estoque.get("Café"));

        // Atualizando um valor
        estoque.put("Café", 60);

        // Verificando se uma chave existe
        if (estoque.containsKey("Chá")) {
            System.out.println("Temos chá no estoque.");
        }

        // Removendo um item
        estoque.remove("Açúcar");

        // Iterando com entrySet()
        for (var entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}