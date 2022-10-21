package mx.uabc.cursojava.designpatterns;

public class PruebaDesignPatterns {
    public static void main(String args[]) {
        MatematicoSingleton m = MatematicoSingleton.getInstance();
        System.out.println(m.suma(80,90));
    }
}
