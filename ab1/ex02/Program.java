package ab1.ex02;

public class Program {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(new Carro("Corsa", "branco", 3, 5));
        estacionamento.adicionarCarro(new Carro("Uno", "prata", 5, 5));
        estacionamento.adicionarCarro(new Carro("Kombi", "branca", 6, 7));
        System.out.println(estacionamento.pessoasNoEstacionamento());
        estacionamento.ListarCarros();

    }
}
