package mx.uabc.cursojava.designpatterns;

public class MatematicoSingleton {
    private static MatematicoSingleton instance;

    public double suma (double a, double b) {
        return a+b;
    }
    private MatematicoSingleton() {
    }

    public static MatematicoSingleton getInstance()
    {
        if (instance == null)
            instance = new MatematicoSingleton();
        return instance;
    }
}
