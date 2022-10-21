package mx.uabc.cursojava.oop.inheritance;

public class Flor {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void fotoSintesis () {
        System.out.println("Se ejecutó la fotosintesis...");
    }
}
