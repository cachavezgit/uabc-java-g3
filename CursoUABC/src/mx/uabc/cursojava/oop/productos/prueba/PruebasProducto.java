package mx.uabc.cursojava.oop.productos.prueba;

import mx.uabc.cursojava.oop.productos.Categoria;
import mx.uabc.cursojava.oop.productos.ProductManager;

import java.util.List;

public class PruebasProducto {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

        pm.agregarProducto(pm.new Product("1", "Jabon",23.45, Categoria.ABARROTES));
        pm.agregarProducto(pm.new Product("2", "Detergente", 45.54, Categoria.ABARROTES));
        pm.agregarProducto(pm.new Product("3", "Whiskas Filets", 12.54, Categoria.ABARROTES));

        List<ProductManager.Product> losProductos = pm.listarProductos();
        System.out.println(losProductos);

        pm.removerProducto("3");
        losProductos = pm.listarProductos();
        for(ProductManager.Product p:losProductos) {
            switch (p.getCategoria()) {
                case ABARROTES:
                    System.out.println("Abarrotes");
                    break;
                case LACTEOS:
                    System.out.println("Lacteos");
                    break;
                case CARNICOS:
                    System.out.println("Carnicos");
                    break;
                case SALCHICHONERIA:
                    System.out.println("Salchichoneria");
                    break;
            }
        }
        System.out.println(losProductos);


    }
}
