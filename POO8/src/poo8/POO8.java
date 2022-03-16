package poo8;

import java.util.Scanner;
import poo8.entidades.Cadena;
import poo8.servicios.ServicioCadena;

public class POO8 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        ServicioCadena sc = new ServicioCadena();
        Cadena c = sc.crearCadena();
        
        int nrovocales;
        nrovocales = sc.mostrarVocales(c);
        System.out.println("el numero de vocales que tiene la frase es: "+nrovocales);
        
        String cadena_invertida="";
        cadena_invertida = sc.invertirCadena(c);
        System.out.println("la frase invertida es: "+cadena_invertida);
        
        int cant;
        cant = sc.vecesRepetido(c);
        System.out.println("la cantidad de veces que se encuentra repetido es: "+cant);
        
        String compara_longitud;
        compara_longitud = sc.compararLongitud(c);
        System.out.println(compara_longitud);
        
        String frase_union = sc.unirFrase(c);
        System.out.println("la frase resultante es: "+frase_union);
        
        String cadena_reemplazada="";
        cadena_reemplazada = sc.reemplazar(c);
        System.out.println("la frase con el reemplazo es: "+cadena_reemplazada);
        
        boolean contiene;
        contiene = sc.contiene(c);
        System.out.println("la frase contiene esa letra?: "+contiene);
        
    }
    
}
