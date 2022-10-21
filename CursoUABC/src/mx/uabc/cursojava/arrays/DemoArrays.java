package mx.uabc.cursojava.arrays;

import mx.uabc.cursojava.oop.inheritance.geometria.Circulo;
import mx.uabc.cursojava.oop.inheritance.geometria.FiguraGeometrica;
import mx.uabc.cursojava.oop.inheritance.geometria.Triangulo;

import java.util.Arrays;

public class DemoArrays {
    public static void main (String[] args) {
        String nombres[] = {"Maria", "Lucia", "Ivan", "Pablo"};

        for(String n:nombres) {
            System.out.println(n);
        }

        for(int x=0;x<nombres.length;x++) {
            System.out.println(nombres[x]);
        }

        Arrays.asList(nombres).forEach(gato->System.out.println(gato));

        FiguraGeometrica[] figuras= new FiguraGeometrica[5];
        figuras[0] = new Circulo();
        figuras[1] = new Triangulo();

        for (FiguraGeometrica fig:figuras){
            System.out.println(fig.calcularArea());
        }

        int[] tabla = new int[10];

        for (int x:tabla){
            x = (int)(Math.random()*(10-1)+1);
            System.out.println(x);
        }

        //System.out.println(nombres[4]);

    }
}
