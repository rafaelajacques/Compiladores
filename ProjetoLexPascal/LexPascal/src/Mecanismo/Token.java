package Mecanismo;

public class Token {

    private String token;

    private String lexema;

    private String tipo;

    private String descricao;

    private int endereco;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public Token() {
    }

    public Token(String token, String lexema, String tipo, String descricao, int endereco) {
        this.token = token;
        this.lexema = lexema;
        this.tipo = tipo;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Token [token=" + token + ", lexema=" + lexema + ", tipo=" + tipo + ", descricao=" + descricao
                + ", endereco=" + endereco + "]";
    }
}
