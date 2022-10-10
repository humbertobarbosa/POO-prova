package ab1.ex03;

public class Program {
    public static void main(String[] args) {
        new FormularioLogin().realizarLogin();
        new GoogleLogin().realizarLogin();
        new FacebookLogin().realizarLogin();
        new ICloudLogin().realizarLogin();
    }
}
