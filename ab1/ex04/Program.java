package ab1.ex04;

public class Program {
    public static void main(String[] args) {
        Pix pix = new Pix();
        Boleto boleto = new Boleto();
        CartaoCredito cartaoCredito = new CartaoCredito();
        Pagamento pagamento = new Pagamento(boleto);
        pagamento.pagar();
        pagamento.setMetodoPagamento(pix);
        pagamento.pagar();
        pagamento.setMetodoPagamento(cartaoCredito);
        pagamento.pagar();
    }
}
