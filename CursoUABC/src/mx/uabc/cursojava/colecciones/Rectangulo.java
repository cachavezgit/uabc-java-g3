package mx.uabc.cursojava.colecciones;

public class Rectangulo implements Comparable<Rectangulo>{
    private double base;
    private double altura;

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

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Rectangulo o) {
        return (int)(o.base-this.base);
    }
}
