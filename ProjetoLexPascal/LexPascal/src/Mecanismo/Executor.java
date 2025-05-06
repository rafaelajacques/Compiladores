package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Executor {

    private final String captureComment = "\\/\\/.*|\\(\\*(?:.|\\s)*\\*\\)";
    private final String captureNumbers = "(?<!\\w)(?:-?\\d+(?:\\.\\d+)?)(?!\\w)";
    private final String captureLiteral = "'(?:[^']|'')*'";
    private final String captureWords   = "\\w+";
    private final String captureCharacters = "(?::=|>=|<=|<>|>|<|=|\\+|\\-|\\*|\\/|[:;,.()\\[\\]{}])";
    private final String captureIdentifier = "^[A-Za-z][A-Za-z0-9_]*$";
    private String capture;

    private BufferedReader reader;
    private ArrayList<String> bufferPrimario;
    private ArrayList<String> bufferSecundario;

    private HashMap<String, Token> tabelaSimbolosPrograma;

    private boolean IsNumber(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureNumbers);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsLiteral(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureLiteral);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsCharacter(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureCharacters);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    private boolean IsIdentifier(String valor)
    {
        Pattern pattern = Pattern.compile(this.captureIdentifier);
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find() == true){
            return true;
        }
        return false;
    }

    public void CarregarArquivo(){
        System.out.println("----------------------------------------");
        System.out.println("##### Carregar Arquivo Pascal #####");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o diretório do arquivo: ");
        String diretorio = scanner.next();
        System.out.print("Digite o nome do arquivo (com extensão .pas): ");
        String nomeArquivo = scanner.next();
        String caminhoCompleto = diretorio + "/" + nomeArquivo;
        this.CarregarBufferPrimario(caminhoCompleto);
        scanner.close();        
    }

    public void CarregarArquivo(String caminhoCompleto){
        System.out.println("----------------------------------------");
        System.out.println("##### Carregar Arquivo Pascal #####");
        this.CarregarBufferPrimario(caminhoCompleto);
    }

    private void CarregarBufferPrimario(String caminhoCompleto){
        this.reader = null;
        try {
            this.reader = new BufferedReader(new FileReader(caminhoCompleto));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void ProcessarBufferPrimario(){
        this.bufferPrimario = new ArrayList<>();
        try {
            String linha;
            while ((linha = this.reader.readLine()) != null) {
                bufferPrimario.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

    public void ImprimirBufferPrimario(){
        System.out.println("----------------------------------------");
        System.out.println("##### Conteúdo do Buffer primário: #####");
        for (String texto : this.bufferPrimario) {
            System.out.println(texto);
        }
        System.out.println("----------------------------------------");        
    }

    public void ProcessarBufferSecundario()
    {        
        this.capture = captureComment.concat("|")
            .concat(captureNumbers).concat("|")
            .concat(captureLiteral).concat("|")
            .concat(captureWords).concat("|")
            .concat(captureCharacters);

        this.bufferSecundario = new ArrayList<>();

        Pattern pattern = Pattern.compile(this.capture);

        for (String texto : bufferPrimario) {
            Matcher matcher = pattern.matcher(texto);
            while(matcher.find()){
                String lexema = matcher.group();
                if (this.bufferSecundario.contains(lexema) == false){
                    this.bufferSecundario.add(lexema);
                }
            }
        }
        bufferSecundario.removeIf(value -> value.startsWith("//") || value.startsWith("(*"));
    } 
    
    public void ImprimirBufferSecundario(){
        System.out.println("----------------------------------------");
        System.out.println("##### Conteúdo do Buffer secundário: #####");
        for (String texto : this.bufferSecundario) {
            System.out.println(texto);
        }
        System.out.println("----------------------------------------");        
    }

    public void AnalisarMontandoTabelaSimbolos() {
        // Tabela de palavras reservadas da linguagem
        HashMap<String, String> tabelaLinguagem = new HashMap<>();
        tabelaLinguagem.put("program", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("begin", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("end", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("var", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("integer", "TIPO");
        tabelaLinguagem.put("real", "TIPO");
        tabelaLinguagem.put("if", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("then", "PALAVRA_RESERVADA");
        tabelaLinguagem.put("else", "PALAVRA_RESERVADA");
    
        this.tabelaSimbolosPrograma = new HashMap<>();
        int endereco = 0;
    
        System.out.println("----------------------------------------");
        System.out.println("##### Tokens encontrados: #####");
    
        for (String lexema : bufferSecundario) {
            String tipo = "";
            String descricao = "";
    
            if (tabelaLinguagem.containsKey(lexema)) {
                tipo = tabelaLinguagem.get(lexema);
                descricao = "Palavra reservada";
            } else if (IsNumber(lexema)) {
                tipo = "NUMERO";
                descricao = "Número inteiro ou real";
            } else if (IsLiteral(lexema)) {
                tipo = "LITERAL";
                descricao = "Constante literal";
            } else if (IsCharacter(lexema)) {
                tipo = "OPERADOR/SIMBOLO";
                descricao = "Operador ou símbolo especial";
            } else if (IsIdentifier(lexema)) {
                tipo = "IDENTIFICADOR";
                descricao = "Identificador do programa";
            } else {
                tipo = "DESCONHECIDO";
                descricao = "Token não reconhecido";
            }
    
            // Cria o token e adiciona à tabela do programa somente se for identificador
            Token token = new Token(lexema, lexema, tipo, descricao, endereco++);
    
            if (tipo.equals("IDENTIFICADOR") && !tabelaSimbolosPrograma.containsKey(lexema)) {
                tabelaSimbolosPrograma.put(lexema, token);
            }
    
            System.out.println(token);
        }
    
        System.out.println("----------------------------------------");
    }

    public void ImprimirTabelaSimbolosPrograma() {
        System.out.println("----------------------------------------");
        System.out.println("##### Tabela de Símbolos do Programa #####");
    
        for (Token token : tabelaSimbolosPrograma.values()) {
            System.out.println(token);
        }
    
        System.out.println("----------------------------------------");
    }
}
