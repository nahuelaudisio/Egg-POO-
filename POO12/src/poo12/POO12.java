package poo12;

import poo12.entidades.Persona;
import poo12.servicios.ServicioPersona;

public class POO12 {

    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        Persona p = sp.crearPersona();
        
        int edad = sp.calcularEdad(p);
        System.out.println("la edad de la persona es: "+edad);
        
        boolean band = sp.menorQue(edad);
        if(band==true)
            System.out.println("la edad ingresada es menor que la edad del objeto persona.");
        else
            System.out.println("la edad ingresada es mayor que la edad del objeto persona.");
        
        System.out.println(sp.mostrarPersona(p));
        
    }
    
}
