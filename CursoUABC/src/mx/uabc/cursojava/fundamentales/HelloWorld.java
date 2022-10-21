package mx.uabc.cursojava.fundamentales;

import mx.uabc.cursojava.geometria.Circulo;
import mx.uabc.cursojava.geometria.Triangulo;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0]);

        long maximoValor = Long.MAX_VALUE;
        System.out.println(maximoValor);

        String valor="43874";
        int val = Integer.parseInt(valor);

        Integer numero = null;

        String nombre = "Ivan";

        Triangulo t = new Triangulo();
        Circulo c = new Circulo();

    }
}
