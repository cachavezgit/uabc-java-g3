package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que administra el inventario de los productos
 * Autor: Carlos Ivan Chavez Fuentes
 * Fecha: 12 de Octubre del 2022
 */
public class ProductManager {
    private List<Product> inventario = new ArrayList<>(); //ArrayList para mantener el inventario

    /*
        Método para agregar productos
     */
    public void agregarProducto (Product product) {
        inventario.add(product);
    }

    public List<Product> listarProductos () {
        return inventario;
    }

    public void removerProducto(String clave) {
        inventario.removeIf(p->p.getClaveProducto().equals(clave));
    }

    public class Product {
        private String claveProducto;

        private String nombre;

        private double precio = 0.0;

        private Categoria categoria;

        public Product(String claveProducto, String nombre, double precio, Categoria categoria) {
            this.claveProducto = claveProducto;
            this.nombre = nombre;
            this.precio = precio;
            this.categoria = categoria;
        }

        public String getClaveProducto() {
            return claveProducto;
        }

        public void setClaveProducto(String claveProducto) {
            this.claveProducto = claveProducto;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "claveProducto='" + claveProducto + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", categoria=" + categoria +
                    '}';
        }
    }

}
