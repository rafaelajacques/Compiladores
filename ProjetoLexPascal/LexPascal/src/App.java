import Mecanismo.*;

public class App {
    public static void main(String[] args) throws Exception {
        //ExemploHashMap.executar();
        // MapearIdades mapa = new MapearIdades();
        // mapa.executar();

        Executor exec = new Executor();
        // motor.CarregarArquivo();
        exec.CarregarArquivo("C:\\Meus testes\\teste.pas");
        exec.ProcessarBufferPrimario();
        exec.ImprimirBufferPrimario();
        exec.ProcessarBufferSecundario();
        exec.ImprimirBufferSecundario();
        exec.AnalisarMontandoTabelaSimbolos();
        exec.ImprimirTabelaSimbolosPrograma();        
    }
}
