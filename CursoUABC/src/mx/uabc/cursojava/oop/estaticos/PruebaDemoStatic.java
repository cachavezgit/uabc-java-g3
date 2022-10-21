package mx.uabc.cursojava.oop.estaticos;

class DemoStatic {
    public static int dato = 10;

    public static double calculo(double x){
        return Math.pow(x,2);
    }

    public double test() {
        return DemoStatic.calculo(199);
    }
}
public class PruebaDemoStatic {
    public static void main(String[] args ){
        System.out.println(DemoStatic.dato);
        System.out.println(DemoStatic.calculo(90));
    }
}
