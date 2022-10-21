package mx.uabc.cursojava.excepciones;

public class DemoExcepcionesCustom {
    public static void main(String args[]) {
        CuentaBancaria cb1 = new CuentaBancaria(10000,2000);

        try {
            cb1.disposicionDeFondos(12001);
        }
        catch(SobregiroException ex) {
            System.out.println(ex.getMessage());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {

        }


        System.out.println(cb1.getSaldo());
    }
}
