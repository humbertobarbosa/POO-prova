package ab1.ex06;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contasC1 = new ArrayList<>();
        ArrayList<ContaCorrente> contasC2 = new ArrayList<>();
        contasC1.add(new ContaCorrente(300));
        contasC1.add(new ContaEspecial(1000, 400));
        Cliente c1 = new Cliente("Arthur", contasC1);
        contasC2.add(new ContaCorrente(10000));
        Cliente c2 = new Cliente("Humberto", contasC2);
        c1.getContas().get(1).sacar(600);
        c2.getContas().get(0).depositar(500);
        c2.getContas().get(0).transferir(c1.getContas().get(0));
        System.out.println(c1.getContas().get(0).toString());
        System.out.println(c1.getContas().get(1).toString());
        System.out.println(c2.getContas().get(0).toString());

    }
}
