package ab1.ex04;

public class CartaoCredito extends MetodoPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Cartão de Crédito");
    }
}
