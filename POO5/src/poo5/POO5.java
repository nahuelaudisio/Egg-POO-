package poo5;

import java.util.Scanner;
import poo5.entidades.Cuenta;
import poo5.servicios.ServicioCuenta;

public class POO5 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.crearCuenta();
        
        sc.ingresar(c1);
        sc.retiro(c1);
        sc.extraccionRapida(c1);
        sc.consultarSaldo(c1);
        sc.consultarDatos(c1);
        
    }
}
