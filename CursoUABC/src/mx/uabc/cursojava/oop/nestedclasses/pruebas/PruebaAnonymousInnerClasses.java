package mx.uabc.cursojava.oop.nestedclasses.pruebas;

import mx.uabc.cursojava.oop.nestedclasses.Rectangulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaAnonymousInnerClasses {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(300,50);
        Rectangulo r2 = new Rectangulo(150,80);
        Rectangulo r3 = new Rectangulo(175,100);

        List<Rectangulo> listaRectangulos = new ArrayList<>();

        listaRectangulos.add(r1);
        listaRectangulos.add(r2);
        listaRectangulos.add(r3);

        // Indicar el comparador usando una Anonymous Nested Class
        // La clase anónima implementa una interfaz
        /*Collections.sort(listaRectangulos, new Comparator<Rectangulo>() {
            @Override
            public int compare(Rectangulo o1, Rectangulo o2) {
                return (int)(o2.getBase() - o1.getBase());
            }
        });*/

        Collections.sort(listaRectangulos, (Rectangulo o1, Rectangulo o2) -> {
            return (int)(o2.getBase() - o1.getBase());
        });

        System.out.println(listaRectangulos);
    }
}
