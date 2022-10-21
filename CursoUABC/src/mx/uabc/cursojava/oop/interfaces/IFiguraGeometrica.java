package mx.uabc.cursojava.oop.interfaces;

public interface IFiguraGeometrica {
    double calcularArea();
    void cambiarColor(String color);
    default void otroCalculo(){
        System.out.println("Calling otroCalculo()");
    }
}
