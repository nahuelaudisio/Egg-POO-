package poo4;

import java.util.Scanner;
import poo4.entidades.Rectangulo;
import poo4.servicios.ServicioRectangulo;

public class POO4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r1 = sr.crearRectangulo();
        
        //adicional:
        System.out.println("la superficie del rectangulo es: "+r1.superficie());
        System.out.println("el perimetros del rectangulo es: "+r1.perimetro());
        System.out.println("el dibujo del rectangulo es: "); r1.dibuja();
    }
}
