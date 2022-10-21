package mx.uabc.cursojava.oop.banco;

public class CuentaBancaria {
    private String numeroCuenta="";
    private double saldo=0.0;

    private CuentaHabiente titular;

    private TipoCuenta tipoDeCuenta;

    public CuentaBancaria(){
        System.out.println("Se creo una cuenta bancaria...");
    }

    public CuentaBancaria(String numeroCuenta, double saldo, CuentaHabiente titular, TipoCuenta tipo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoDeCuenta = tipo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaHabiente getTitular() {
        return titular;
    }

    public void setTitular(CuentaHabiente titular) {
        this.titular = titular;
    }

    public double depositar (double cantidad) {
        this.saldo +=cantidad;
        return saldo;
    }

    public double retirar(double cantidad) {
        this.saldo -=cantidad;
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                ", tipoDeCuenta=" + tipoDeCuenta +
                '}';
    }
}
