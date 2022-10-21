package mx.uabc.cursojava.designpatterns;

import java.util.*;

public class IteratorSample {
    public static void main(String args[]) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Uno");
        cadenas.add("Dos");
        cadenas.add("Tres");

        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Perro");
        conjunto.add("Pez");
        conjunto.add("Gato");

        for(String s:conjunto){

        }

        Iterator iterator = cadenas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
