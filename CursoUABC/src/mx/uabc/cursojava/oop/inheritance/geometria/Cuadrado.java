package mx.uabc.cursojava.oop.inheritance.geometria;

public class Cuadrado extends FiguraConLados{
    @Override
    public double calcularArea() {
        return this.getLado() * this.getLado();
    }
}
