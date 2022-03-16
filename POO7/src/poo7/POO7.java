package poo7;

import java.util.Scanner;
import poo7.entidades.Persona;
import poo7.servicios.ServicioPersona;

public class POO7 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ServicioPersona sc = new ServicioPersona();
        
        Persona personas[] = new Persona[4];
        
        int aux, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for(int i=0; i<4; i++) {
            
            personas[i] = sc.crearPersona();
            
            switch( sc.calcularIMC( personas[i] )) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;
            }
            
            if( sc.esMayorDeEdad( personas[i] )==true) {
                System.out.println("usted es mayor de edad.");
                cont4++;
            }
            else {
                System.out.println("usted es menor de edad.");
                cont5++;
            }
            
        }
        
        System.out.println("el porcentaje de personas que estan debajo de su peso ideal son: "
            +((cont1*100)/4)+"%");
        System.out.println("el porcentaje de personas que estan en su peso ideal son: "
            +((cont2*100)/4)+"%");
        System.out.println("el porcentaje de personas que estan sobrepeso son: "
            +((cont3*100)/4)+"%");
        System.out.println("el porcentaje de personas mayores de edad son: "
            +((cont4*100)/4)+"%");
        System.out.println("el porcentaje de personas menores de edad son: "
            +((cont5*100)/4)+"%");
    }
}
