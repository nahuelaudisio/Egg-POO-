package poo5.entidades;

public class Cuenta {
    private int numeroCuenta;
    private int DNI;
    private double saldo;
    
    

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
