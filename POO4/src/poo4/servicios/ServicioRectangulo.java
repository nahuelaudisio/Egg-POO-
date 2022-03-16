package poo4.servicios;

import java.util.Scanner;
import poo4.entidades.Rectangulo;

public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo() {
        System.out.println("ingrese el valor de la base del rectangulo:");
        double base = leer.nextDouble();
        base = valida(base);
        System.out.println("ingrese el valor de la altura del rectangulo:");
        double altura = leer.nextDouble();
        altura = valida(altura);
        return new Rectangulo(base, altura);
    }
    
    public double valida(double dato) {
        while(dato<=0) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            dato = leer.nextDouble();
        }
        return dato;
    }
}
