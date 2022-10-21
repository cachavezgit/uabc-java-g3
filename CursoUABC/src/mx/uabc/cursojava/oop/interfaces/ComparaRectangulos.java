package mx.uabc.cursojava.oop.interfaces;

import java.util.Comparator;

public class ComparaRectangulos implements Comparator<Rectangulo> {
    private Orden orden;

    public ComparaRectangulos(Orden orden) {
        this.orden = orden;
    }

    @Override
    public int compare(Rectangulo o1, Rectangulo o2) {
        return orden==Orden.ASCENDENTE?
                (int)(o1.getBase()-o2.getBase()):(int)(o2.getBase()-o1.getBase());
    }
}
