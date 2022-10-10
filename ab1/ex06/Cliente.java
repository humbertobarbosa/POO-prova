package ab1.ex06;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> contas;
    public Cliente(){
        nome = "";
        contas = new ArrayList<>();
    }
    public Cliente(String nome, ArrayList<ContaCorrente> contas){
        this.nome = nome;
        this.contas = contas;
    }

    public ArrayList<ContaCorrente> getContas(){
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome +
                '}';
    }
}
