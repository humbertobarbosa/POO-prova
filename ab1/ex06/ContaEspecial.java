package ab1.ex06;

public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float limite, float saldo){
        super(saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if(valor <= limite + saldo){
            saldo -= valor;
            if(saldo < 0){
                limite += saldo;
                saldo = 0;
            }

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "saldo=" + saldo +
                '}';
    }

}
