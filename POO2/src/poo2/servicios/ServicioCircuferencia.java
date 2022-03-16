
package poo2.servicios;

import java.util.Scanner;
import poo2.entidades.Circuferencia;


public class ServicioCircuferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circuferencia crearCircuferencia() {
        
        System.out.println("ingrese el radio de la circuferencia:");
        
        return new Circuferencia(leer.nextDouble());
        
        /*
        la linea16 es equivalente a decir:
        Circuferencia c1 = new Circuferencia(leer.nextDouble());
        return c1;
        */
    }
}
