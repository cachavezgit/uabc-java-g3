package mx.uabc.cursojava.oop.banco.pruebas;

import mx.uabc.cursojava.oop.banco.CuentaBancaria;
import mx.uabc.cursojava.oop.banco.CuentaHabiente;
import mx.uabc.cursojava.oop.banco.TipoCuenta;

public class PruebasBanco {
    public static void main(String[] args) {
        CuentaHabiente ch1 = new CuentaHabiente("Wilson", "Perez Perez", "wperez@gmail.com");
        //ch1.setNombre("Wilson");
        //ch1.setApellidos("Perez Perez");
        //ch1.setEmail("wperez@gmail.com");

        CuentaBancaria cb1 = new CuentaBancaria("84847444", 1000, ch1, TipoCuenta.INVERSION);
        //cb1.setNumeroCuenta("8484848404");
        //cb1.setSaldo(1000);
        //cb1.setTitular(ch1);

        CuentaBancaria cb2 = new CuentaBancaria("8447474",5000,
                new CuentaHabiente("Lucia", "Gonzalez", "lgonzalez@gmail.com"),
                TipoCuenta.CHEQUES);
        //cb2.setNumeroCuenta("7476658");
        //cb2.setSaldo(5000);
        //cb2.setTitular(ch1);

        cb1.depositar(50000);
        cb1.retirar(2000);

        cb2.depositar(10000);

        System.out.println(cb1.toString());
        System.out.println(cb2.toString());

    }
}
