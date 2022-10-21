package mx.uabc.cursojava.fundamentales;

class Figura {
    public String color = "";
}

public class PorValorOPorReferencia {
    public static void main(String args[]) {
        Figura miFigura = new Figura();
        miFigura.color = "Verde";
        procesaFigura(miFigura);
        System.out.println(miFigura.color);

        Integer numero1 = 1000; //int a Integer
        Double test = 3.5;
        Float demo = 8.8f;
        procesaEntero(numero1);
        System.out.println(numero1);
    }

    public static void procesaEntero (Integer elNumero) {
        elNumero+=1;
        System.out.println(elNumero);
    }

    public static void procesaFigura(Figura fig) {
        Figura interna = new Figura();
        interna.color = fig.color; //Clonar o deep copy
        interna.color = "Rojo";
    }


}
