package mx.uabc.cursojava.oop.interfaces;

public class Rectangulo implements IFiguraGeometrica, Comparable<Rectangulo>{
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void cambiarColor(String color) {

    }

    @Override
    public int compareTo(Rectangulo o) {
        return (int)(this.getBase()-o.getBase());
    }

    /*
    @Override
    public int compareTo(Object o) {
        return (int)this.altura - (int)((Rectangulo)o).getAltura();
    }*/
}
