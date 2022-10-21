package mx.uabc.cursojava.oop.inheritance.geometria.pruebas;

import mx.uabc.cursojava.oop.inheritance.geometria.*;

import java.util.ArrayList;
import java.util.List;

public class PruebaFiguras {
    public static void main(String[] args){
        Triangulo t1 = new Triangulo();
        t1.setColor("rojo");
        t1.setBase(8);
        t1.setAltura(15);

        Cuadrado cuad1 = new Cuadrado();
        cuad1.setLado(45);

        Rectangulo r1 = new Rectangulo();
        r1.setBase(20);
        r1.setAltura(12);

        Circulo c1= new Circulo();
        c1.setDiametro(30);

        List<FiguraGeometrica> misFiguras = new ArrayList<>();
        misFiguras.add(c1);
        misFiguras.add(t1);
        misFiguras.add(cuad1);
        misFiguras.add(r1);

        for(FiguraGeometrica fig:misFiguras) {
            System.out.println(fig.getColor());
            System.out.println(fig.getClass());
            System.out.println(fig.calcularArea());
            System.out.println("------------------------");
        }

        FiguraGeometrica cuad2 = new Cuadrado();
        ((Cuadrado)cuad2).setLado(20);
        ((Cuadrado)cuad2).calcularArea();


        System.out.println(String.format("El area del rectangulo es: %.2f", r1.calcularArea()));
        System.out.println(String.format("El area del triangulo es: %.2f", t1.calcularArea()));
        System.out.println(String.format("El area del cuadrado es: %.2f", cuad1.calcularArea()));
        System.out.println(String.format("El area del circulo es: %.2f", c1.calcularArea()));
    }
}
