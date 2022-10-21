package mx.uabc.cursojava.oop.inheritance.pruebas;

import mx.uabc.cursojava.oop.inheritance.DemoHerencia;
import mx.uabc.cursojava.oop.inheritance.Girasol;
import mx.uabc.cursojava.oop.inheritance.GirasolExotico;

public class PruebaHerencia {
    public static void main(String[] args){
        DemoHerencia demoHerencia = new DemoHerencia();

        GirasolExotico g1= new GirasolExotico();
        g1.setNombre("Girasol Extensivo 1");
        g1.fotoSintesis();

        Girasol g2 = new Girasol();
        g2.fotoSintesis();
    }
}
