package mx.uabc.cursojava.excepciones;

public class CuentaBancaria {
    private double saldo;

    private double margenDeSobregiro;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void disposicionDeFondos(double cantidad) throws SobregiroException{
        this.saldo-=cantidad;
        if ((this.saldo+this.margenDeSobregiro)<0) {
            double sobregiro = this.saldo+this.margenDeSobregiro;
            String mensaje=String.format("La cuenta se sobregiro por %.2f pesos.", sobregiro);
            throw new SobregiroException(mensaje);
        }

    }

    public CuentaBancaria(double saldo, double margenDeSobregiro) {
        this.saldo = saldo;
        this.margenDeSobregiro = margenDeSobregiro;
    }
}
