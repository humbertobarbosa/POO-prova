package ab1.ex01;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private ArrayList<Item> itens;
    private double valor;
    
    public Produto(String nome, ArrayList<Item> itens) {
        this.nome = nome;
        this.itens = itens;
        this.valor = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValor() {
        for (Item i : itens) {
            this.valor += i.getvalor() * i.getQuantidade();
        }
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Produtos de %s:\n%s", getNome(), getItens());
    }
}
