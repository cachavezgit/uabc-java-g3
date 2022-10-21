package mx.uabc.cursojava.colecciones;

import java.util.LinkedList;
import java.util.List;

public class EjemploListas {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);
        System.out.println(list);
        int index = list.indexOf(19);
        System.out.println("Find 19 at: " + index);
        System.out.println("Component: " + list.get(index));
    }
}
