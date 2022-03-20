package programmer.kode.desain.data;

public class Application {
    public static final int PROCESSORS;
    static {
        System.out.println("Mengakses class Aplication");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
