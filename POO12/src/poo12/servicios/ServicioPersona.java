
package poo12.servicios;

import java.util.Date;
import java.util.Scanner;
import poo12.entidades.Persona;

public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona p = new Persona();
        
        System.out.println("ingrese nombre:");
        String nombre = leer.next();
        p.setNombre(nombre);
        
        System.out.println("fecha de nacimiento:");
        System.out.println("ingrese dia:");
        int dia = leer.nextInt();
        System.out.println("ingrese mes:");
        int mes = leer.nextInt();
        mes=mes-1;
        System.out.println("ingrese anio:");
        int anio = leer.nextInt();
        if(anio>1900)
            anio-=1900;//ej: 1996 pasa a 96
        Date fecha_nacimiento = new Date(anio, mes, dia);
        p.setFecha_nacimiento(fecha_nacimiento);
        
        return p;
    }
    
    public int calcularEdad(Persona p) {
        
        Date fecha_actual = new Date();
        
        int edad = fecha_actual.getYear() - p.getFecha_nacimiento().getYear();
        
        return edad;
    }
    
    public boolean menorQue(int edad_p) {
        
        System.out.println("ingrese una edad:");
        int otra_edad = leer.nextInt();
        
        return otra_edad<edad_p ? true : false;
    }
    
    public String mostrarPersona(Persona p) {
        return "nombre: "+p.getNombre()+"\nfecha de nacimiento: "+p.getFecha_nacimiento();
    }
    
}
