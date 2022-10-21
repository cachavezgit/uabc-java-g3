package mx.uabc.cursojava.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConfusionArraysAsList {
    public static void main(String args[]) {
        Integer[] numeros = new Integer[]{2,5,7,57,100,345};

        List<Integer> lista1 = Arrays.asList(numeros); // devuelve una lista de longitud fija

        List<Integer> lista2 = new ArrayList<>();
        Collections.addAll(lista2,numeros);

        //lista1.remove(57); Manda una excepcion
        //lista1.add(90); Manda excepcion
        lista2.removeIf(n->n.equals(57));

        lista1.forEach(n->System.out.print(n));
        System.out.println("");
        lista2.forEach(n->System.out.print(n));

    }
}
