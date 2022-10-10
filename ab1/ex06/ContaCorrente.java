package ab1.ex06;

public class ContaCorrente {
    protected float saldo;
    public ContaCorrente(){
        saldo = 0;
    }
    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }
    public void depositar(float valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("insira um valor maior que zero para depositar");
        }
    }
    public boolean sacar(float valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(ContaCorrente conta){
        float valor = saldo;
        if(sacar(valor)){
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
