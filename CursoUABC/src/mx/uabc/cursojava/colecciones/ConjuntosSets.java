package mx.uabc.cursojava.colecciones;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosSets {
    public static void main (String args[]) {
        Set<String> conjuntoCadenas = new TreeSet<>();

        Set<Rectangulo> conjuntoRectangulos = new TreeSet<>();
        conjuntoRectangulos.add(new Rectangulo(40,10));
        conjuntoRectangulos.add(new Rectangulo(10,30));
        conjuntoRectangulos.add(new Rectangulo(20,20));

        Set<Integer> conjuntoEnteros = new HashSet<>();

        conjuntoCadenas.add("Wilson");
        conjuntoCadenas.add("Juan");
        conjuntoCadenas.add("Miguel");
        conjuntoCadenas.add("Alberto");
        conjuntoCadenas.add("Maria");

        conjuntoCadenas.forEach(nombre -> {
            System.out.println(nombre);
        });

        conjuntoRectangulos.forEach(rectangulo -> {
            System.out.println(rectangulo);
        });

        Integer[] numbers1 = new Integer[] {3, 25, 2, 79, 2};
        Integer[] numbers2 = new Integer[] {7, 12, 14, 79};
        Set<Integer> set1 = new TreeSet<>();
        Collections.addAll(set1, numbers1);
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, numbers2);
        set1.addAll(set2);
        System.out.println(set1);


    }
}
