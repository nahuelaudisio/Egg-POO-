package poo3.servicios;

import java.util.Scanner;
import poo3.entidades.Operacion;

public class ServicioOperacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //item d:
    public Operacion crearOperacion() {
        System.out.println("ingrese el primer numero:");
        int numero1 = leer.nextInt();
        System.out.println("ingrese el segundo numero:");
        int numero2 = leer.nextInt();
        return( new Operacion(numero1, numero2) );
    }
}
