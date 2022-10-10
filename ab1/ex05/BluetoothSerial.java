package ab1.ex05;

public class BluetoothSerial extends UFALBluetooth {
    @Override
    public void processarDados() {
        System.out.println("Dados processados por comunicação serial");
    }
}
