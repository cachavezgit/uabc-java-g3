package mx.uabc.cursojava.oop.nestedclasses;

public class CPU {
    private String marca;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }

    public class Memoria {
        private int cantidad;
        private String marca;

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public String toString() {
            return "Memoria{" +
                    "cantidad=" + cantidad +
                    ", marca='" + marca + '\'' +
                    '}';
        }
    }

    public class Procesador {
        private String marca;
        private int nucleos;

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getNucleos() {
            return nucleos;
        }

        public void setNucleos(int nucleos) {
            this.nucleos = nucleos;
        }

        public class Demo {

        }

        @Override
        public String toString() {
            return "Procesador{" +
                    "marca='" + marca + '\'' +
                    ", nucleos=" + nucleos +
                    '}';
        }
    }
}
