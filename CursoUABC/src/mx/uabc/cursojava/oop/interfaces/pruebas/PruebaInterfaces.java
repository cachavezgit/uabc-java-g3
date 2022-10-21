package mx.uabc.cursojava.oop.interfaces.pruebas;

import mx.uabc.cursojava.oop.interfaces.*;

import java.util.Arrays;

public class PruebaInterfaces {
    public static void main (String args[]){
        IFiguraGeometrica figura1 = new Cuadrado();
        figura1.cambiarColor("Rojo");

        String[] cadenas = new String[3];
        cadenas[0] = "xyz";
        cadenas[1] = "abc";
        cadenas[2] = "www";

        Arrays.sort(cadenas);

        for(String s:cadenas){
            System.out.println(s);
        }

        Rectangulo[] rectangulos = new Rectangulo[3];
        rectangulos[0] = new Rectangulo(20,5);
        rectangulos[1] = new Rectangulo(10,7);
        rectangulos[2] = new Rectangulo(100,30);

        ComparaRectangulos cr = new ComparaRectangulos(Orden.DESCENDENTE);
        Arrays.sort(rectangulos, cr);



        for(Rectangulo r:rectangulos){
            System.out.println(r);
        }

    }
}
