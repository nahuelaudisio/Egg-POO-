package poo6;

import java.util.Scanner;
import poo6.entidades.Cafetera;
import poo6.servicios.ServicioCafetera;

public class POO6 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera c1 = sc.crearCafetera();
        
        //adicional:
        sc.llenarCafetera(c1);
        sc.servirTaza(c1);
        sc.vaciarCafetera(c1);
        sc.agregarCafe(c1);
    }
    
}
