package mx.uabc.cursojava.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMapas {
    public static void main(String[] args){
        Map<Integer,Rectangulo> mapaRectangulos=new HashMap<>();

        mapaRectangulos.put(1,new Rectangulo(30,20));
        mapaRectangulos.put(2,new Rectangulo(20,20));
        mapaRectangulos.put(3,new Rectangulo(10,20));
        mapaRectangulos.put(2,new Rectangulo(100,20));
        mapaRectangulos.put(5,new Rectangulo(80,20));

        Rectangulo resultado=mapaRectangulos.get(2);

        Set<Integer> llaves= mapaRectangulos.keySet();
        Set<Map.Entry<Integer,Rectangulo>> entradas=mapaRectangulos.entrySet();

        System.out.println(llaves);
        System.out.println(entradas);

        System.out.println(resultado);
    }
}
