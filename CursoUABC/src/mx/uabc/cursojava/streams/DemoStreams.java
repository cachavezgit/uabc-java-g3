package mx.uabc.cursojava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreams {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[6];
        empleados[0] = new Empleado(1, "Wilson Perez", 12500);
        empleados[1] = new Empleado(2, "Lucia Manzur", 215000);
        empleados[2] = new Empleado(3, "Antonio Rodriguez", 5500);
        empleados[3] = new Empleado(4, "Marcos Gonzalez", 8000);
        empleados[4] = new Empleado(5, "Marcia Contreras", 1250);
        empleados[5] = new Empleado(6, "Bonifacia Rodriguez", 100000);

        for (Empleado e : empleados) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------");
        Stream<Empleado> empleadosStream = Arrays.asList(empleados).stream();

        Set<Empleado> empleadosMejorPagados = empleadosStream
                .filter(e -> e.getSueldo() > 10000)
                .limit(1)
                .collect(Collectors.toSet());
        System.out.println(empleadosMejorPagados);
        System.out.println("-----------------------------------");
        empleadosStream = Arrays.asList(empleados).stream();
        List<Empleado> listaEmpleados = empleadosStream.collect(Collectors.toList());
        System.out.println(listaEmpleados);
        System.out.println("-----------------------------------");
        List<String> cadenas = Stream.of("a", "b","c")
                .filter(e->e.contains("b"))
                .collect(Collectors.toList());
        System.out.println("-----------------------------------");
        System.out.println(cadenas);
        System.out.println("-----------------------------------");
        Arrays.asList(empleados).stream().forEach(System.out::println);
    }
}

class Empleado {
    private int clave;
    private String nombre;
    private double sueldo;

    public Empleado(int clave, String nombre, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}


