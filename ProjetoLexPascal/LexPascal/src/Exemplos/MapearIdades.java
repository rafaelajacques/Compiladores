package Exemplos;

import java.util.HashMap;

public class MapearIdades {

    // Criando um HashMap que mapeia nomes para idades
    private HashMap<String, Integer> mapaIdades;
    
    public MapearIdades(){
        this.mapaIdades = new HashMap<>();
        this.popularMapa();
    }

    // Adicionando elementos ao HashMap
    private void popularMapa(){
        
        this.mapaIdades.put("Jesus", 33);
        this.mapaIdades.put("Maria", 25);
        this.mapaIdades.put("Pedro", 35); 
        this.mapaIdades.put("Tiago", 28); 
        this.mapaIdades.put("João", 30); 
        this.mapaIdades.put("André", 23); 
        this.mapaIdades.put("Filipe", 20); 
        this.mapaIdades.put("Judas Iscariotes", 27); 
        this.mapaIdades.put("Mateus", 28); 
        this.mapaIdades.put("Tomé", 32); 
        this.mapaIdades.put("Tiago Alfeu", 19); 
        this.mapaIdades.put("Bartolomeu", 20); 
        this.mapaIdades.put("Judas Tadeu", 25); 
        this.mapaIdades.put("Simão Zelote", 26);
    }

    private void confirmandoExistencia(String key){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Verificando se uma chave existe no HashMap:");
        System.out.println("Chave: " + key);
        if (mapaIdades.containsKey(key)) {
            System.out.println(key + " está no HashMap.");
        }
        else {
            System.out.println(key + " não está no HashMap.");
        }
    }

    private void localizando(String key){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Acessando e exibindo o valor associado a uma chave específica:");
        System.out.println("Chave: " + key);
        System.out.println("A idade de " + key + " é: " + this.mapaIdades.get(key));
    }
    
    private void removendo(String key){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Removendo um elemento do HashMap");
        System.out.println("Chave: " + key);
        mapaIdades.remove(key);
    }
    
    private void listando(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Iterando sobre as chaves e valores do HashMap (keySet):");
        for (String nome : mapaIdades.keySet()) {
            int idade = mapaIdades.get(nome);
            System.out.println(nome + " tem " + idade + " anos.");
        }
    }

    private void listando2(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Iterando sobre as chaves e valores do HashMap (entrySet):");
        for (var item : mapaIdades.entrySet()) {
            System.out.println(item.getKey() + " tem " + item.getValue() + " anos");
        }
    }

    private void validandoMapa(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Verificando se o HashMap está vazio:");
        if (mapaIdades.isEmpty()) {
            System.out.println("O HashMap está vazio.");
        } else {
            System.out.println("O HashMap não está vazio.");
        }
    }

    private void verificandoTamanho(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Obtendo o tamanho do HashMap:");
        System.out.println("O tamanho do HashMap é: " + mapaIdades.size());
    }

    public void executar(){
        this.validandoMapa();
        this.verificandoTamanho();
        this.listando();
        this.confirmandoExistencia("Maria");
        this.localizando("João");
        this.removendo("Pedro");
        this.listando2();
        this.verificandoTamanho();
    }
}
