package poo6.servicios;

import java.util.Scanner;
import poo6.entidades.Cafetera;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera() {
        System.out.println("ingrese capacidad maxima de la cafetera:");
        double capacidadMaxima=leer.nextDouble();
        System.out.println("ingrese cantidad actual de la cafetera:");
        double cantidadActual=leer.nextDouble();
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual( c1.getCapacidadMaxima() );
    }
    
    public void servirTaza(Cafetera c1) {
        System.out.println("ingrese el tamaño de la taza vacia:");
        double tam = leer.nextDouble();
        while(tam<=0) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            tam = leer.nextDouble();
        }
        if(tam>c1.getCantidadActual()) {
            System.out.println("no se lleno la taza.");
            System.out.println("se sirvio: "+c1.getCantidadActual());
        }
        else
            System.out.println("se lleno la taza");
    }
    
    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera c1) {
        System.out.println("ingrese una cantidad de cafe:");
        double cant = leer.nextDouble();
        while(cant<=0)  {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            cant = leer.nextDouble();
        }
        while((cant+c1.getCantidadActual())>c1.getCapacidadMaxima()) {
            System.out.println("la cantidad deseada supera la capacidad maxima, vuelva a ingresar:");
            cant = leer.nextDouble();
        }
        c1.setCantidadActual( c1.getCantidadActual()+cant );
    }
    
}
