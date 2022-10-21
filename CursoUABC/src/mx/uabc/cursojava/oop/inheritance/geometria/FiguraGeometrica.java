package mx.uabc.cursojava.oop.inheritance.geometria;

public abstract class FiguraGeometrica {
    private String color="";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
