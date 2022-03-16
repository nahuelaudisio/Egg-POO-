package poo2;

import java.util.Scanner;
import static java.lang.Character.toUpperCase;

import poo2.servicios.ServicioCircuferencia;
import poo2.entidades.Circuferencia;

public class POO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char opcion;
        
        ServicioCircuferencia sc = new ServicioCircuferencia();
        Circuferencia c1 = sc.crearCircuferencia();
        
        //adicional:
        System.out.println("Desea modificar el radio de la circuferencia? (S/N):");
        
        do {            
            
            opcion = leer.next().charAt(0);
            opcion = toUpperCase(opcion);
            if(opcion!='S' && opcion!='N')
                System.out.println("valor incorrecto, vuelva a ingresar:");
            
        } while (opcion!='S' && opcion!='N');
        
        if(opcion == 'S') {
            System.out.println("ingrese nuevo valor de radio:");
            c1.setRadio(leer.nextDouble());
            System.out.println("el nuevo valor del radio es: "+c1.getRadio());
        }
        
        System.out.println("el area de la circuferencia es: "+c1.area());
        System.out.println("el perimetro de la circuferencia es: "+c1.perimetro());
        
    }
}
