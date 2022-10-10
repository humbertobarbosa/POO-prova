package ab1.ex04;

public class Boleto extends MetodoPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Boleto");
    }
}
