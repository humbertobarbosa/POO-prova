package ab1.ex01;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private double valorTotal;

    public Compra() {
        this.valorTotal = 0;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarAoCarrinho(Produto produto) {
        ArrayList<Produto> carrinho = getProdutos();
        carrinho.add(produto);
        setProdutos(carrinho);
    }

    public double getValorTotal() {
        for (Produto p : produtos) {
            this.valorTotal += p.getValor();
        }
        return valorTotal;
    }
    
    public void valorTotal() {
        System.out.println("Valor total: " + getValorTotal());
    }

    public void listarProdutos() {
        System.out.println(getProdutos());
    }
}
