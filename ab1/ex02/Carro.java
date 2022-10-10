package ab1.ex02;

public class Carro {
    private String modelo;
    private String cor;
    private int quantidadePessoas;
    private int capacidadeMax;

    public Carro(String modelo, String cor, int quantidadePessoas, int capacidadeMax){
        if(quantidadePessoas > capacidadeMax){
            System.out.println("Capacidade máxima do carro extrapolada");
            System.exit(1);
        }
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadePessoas = quantidadePessoas;
        this.capacidadeMax = capacidadeMax;
    }

    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", capacidadeMax=" + capacidadeMax +
                '}';
    }
}
