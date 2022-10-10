package ab1.ex05;

public abstract class UFALBluetooth {
    public void executarConexao() {
        estabelecerConexao();
        processarDados();
        fecharConexao();
    }

    public void estabelecerConexao() {
        System.out.println("Conexão estabelecida!");
    } 

    public abstract void processarDados();

    public void fecharConexao() {
        System.out.println("Conexão fechada!");
    }
}
