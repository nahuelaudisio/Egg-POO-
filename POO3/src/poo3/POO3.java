package poo3;

import java.util.Scanner;
import poo3.entidades.Operacion;
import poo3.servicios.ServicioOperacion;

public class POO3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioOperacion so = new ServicioOperacion();
        Operacion o1 = so.crearOperacion();
        
        //adicional:
        System.out.println("la suma es: "+o1.suma() );
        System.out.println("la resta es: "+o1.resta() );
        if(o1.multiplica()==0)
            System.out.println("error, uno de los numeros es cero.");
        else
            System.out.println("la multiplicacion es: "+o1.multiplica());
        if(o1.divide()==0)
            System.out.println("error, el divisor es cero.");
        else
            System.out.println("la division es: "+o1.divide());
    }
}
