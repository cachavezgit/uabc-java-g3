package mx.uabc.cursojava.oop.nestedclasses.pruebas;

import mx.uabc.cursojava.oop.nestedclasses.CPU;

public class PruebaNestedClasses {
    public static void main(String args[]){
        CPU cpu = new CPU();
        cpu.setMarca("HP");
        cpu.setPrecio(108000);

        CPU.Procesador procesador = cpu.new Procesador();
        procesador.setMarca("Intel");
        procesador.setNucleos(8);

        CPU.Procesador.Demo demo = procesador.new Demo();

        CPU.Memoria memoria = cpu.new Memoria();
        memoria.setCantidad(16);
        memoria.setMarca("Kingston");

        System.out.println(cpu.toString());
        System.out.println(memoria.toString());
        System.out.println(procesador.toString());
    }
}
