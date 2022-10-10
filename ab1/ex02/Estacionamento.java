package ab1.ex02;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Carro> carros = new ArrayList<>();

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    public int pessoasNoEstacionamento(){
        int pessoas = 0;
        for(int i = 0; i < carros.size(); i++){
            pessoas += carros.get(i).getQuantidadePessoas();
        }
        return pessoas;
    }

    public void ListarCarros(){
        for(int i = 0; i < carros.size(); i++){
            System.out.println(carros.get(i).toString());
        }
    }
}
