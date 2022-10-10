package ab1.ex05;

public class Program {
    public static void main(String[] args) {
        UFALBluetooth bs = new BluetoothSerial();
        bs.executarConexao();

        UFALBluetooth bp = new BluetoothPackages();
        bp.executarConexao();
    }
}
