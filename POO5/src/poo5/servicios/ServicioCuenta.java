package poo5.servicios;

import java.util.Scanner;
import poo5.entidades.Cuenta;

public class ServicioCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta() {
        System.out.println("ingrese el numero de cuenta:");
        int numeroCuenta=leer.nextInt();
        System.out.println("ingrese el numero de dni:");
        int DNI=leer.nextInt();
        System.out.println("ingrese saldo:");
        double saldo=leer.nextDouble();
        return new Cuenta(numeroCuenta, DNI, saldo); 
    }
    
    public void ingresar(Cuenta c1) {
        System.out.println("cantidad de dinero que desee ingresar:");
        double ingreso=leer.nextDouble();
        c1.setSaldo(c1.getSaldo()+ingreso);
        System.out.println("saldo actual: "+c1.getSaldo());
    }
    
    public void retiro(Cuenta c1) {
        System.out.println("cantidad de dinero a retirar:");
        double retiro=leer.nextDouble();
        if(retiro>c1.getSaldo()) {
            System.out.println("retiro: "+c1.getSaldo());
            c1.setSaldo(0);
            System.out.println("saldo actual: "+c1.getSaldo());
        }
        else {
            System.out.println("retiro: "+retiro);
            c1.setSaldo(c1.getSaldo()-retiro);
            System.out.println("saldo actual: "+c1.getSaldo());
        }
    }
    
    public void extraccionRapida(Cuenta c1) {
        double max = (20*c1.getSaldo())/100;
        System.out.println("cantidad de dinero de extraccion rapida (max 20%):");
        double extraccion=leer.nextDouble();
        while(extraccion>max) {
            System.out.println("la cantidad ingresada supera el 20% de su saldo, vuelva a ingresar:");
            extraccion=leer.nextDouble();
        }
        System.out.println("extraccion rapida: "+extraccion);
        c1.setSaldo(c1.getSaldo()-extraccion);
        System.out.println("saldo actual: "+c1.getSaldo());
    }
    
    public void consultarSaldo(Cuenta c1) {
        System.out.println("saldo actual: "+c1.getSaldo());
    }
    
    public void consultarDatos(Cuenta c1) {
        System.out.println("numero de cuenta: "+c1.getNumeroCuenta());
        System.out.println("numero de DNI: "+c1.getDNI());
        System.out.println("saldo: "+c1.getSaldo());
    }
}
