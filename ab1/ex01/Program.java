package ab1.ex01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Compra c = new Compra();

        ArrayList<Item> itensLimpeza = new ArrayList<>();
        itensLimpeza.add(new Item("Sabonete", 3.50, 8));
        itensLimpeza.add(new Item("Detergente", 3, 4));
        itensLimpeza.add(new Item("Alcool", 10, 1));
        c.adicionarAoCarrinho(new Produto("Limpeza", itensLimpeza));

        c.listarProdutos();
        c.valorTotal();
    }
}
