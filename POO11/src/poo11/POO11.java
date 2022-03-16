package poo11;

import java.util.Date;
import java.util.Scanner;

public class POO11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dia:");
        int dia = leer.nextInt();
        
        System.out.println("ingrese mes:");
        int mes = leer.nextInt();
        mes = mes-1;//porque el mes enero seria 0 y diciembre 11.
        
        System.out.println("ingrese anio, solo los ultimos dos digitos:");//ejemplo 1996 = 96.
        int anio = leer.nextInt();
        anio = anio -1900;
        Date fecha = new Date(anio, mes, dia);
        
        Date fechaActual = new Date();
        
        System.out.println("fecha ingresada: "+fecha.toString());
        System.out.println("fecha actual: "+fechaActual.toString());
        
        System.out.println(fechaActual.getYear()+" "+fecha.getYear());
        
        int diferencia_anios = fechaActual.getYear() - fecha.getYear();
        System.out.println("la diferencia de años que hay entre las fechas es: "+diferencia_anios);
    
    }
    
}
