package poo8.servicios;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

import poo8.entidades.Cadena;

public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        
        Cadena c = new Cadena();
        
        System.out.println("ingrese frase:");
        String frase = leer.next();
        c.setFrase(frase);
        
        int longitud = frase.length();
        c.setLongitud(longitud);
        
        return c;
    }
    
    public int mostrarVocales(Cadena c) {
        
        int cont=0;
        String frase = c.getFrase();
        char letra;
        int longitud = c.getLongitud();
        
        for(int i=0; i<longitud; i++) {
            
            letra = frase.charAt(i);
            letra = toUpperCase(letra);
            
            switch (letra) {
                case 'A':
                    cont++;
                    break;
                case 'E':
                    cont++;
                    break;
                case 'I':
                    cont++;
                    break;
                case 'O':
                    cont++;
                    break;
                case 'U':
                    cont++;
                    break;
            }
        }
        
        return cont;
    }
    
    public String invertirCadena(Cadena c) {
        
        String frase = c.getFrase();
        String cadena_invertida = "";
        int fin = c.getLongitud();
        
        for(int i=fin-1; i>=0; i--) {
            
            cadena_invertida+=frase.charAt(i);
            
        }
        
        return cadena_invertida;
    }
    
    public int vecesRepetido(Cadena c) {
        
        int cont=0;
        int fin = c.getLongitud();
        String frase = c.getFrase();
        
        System.out.println("ingrese una letra:");
        char letra = leer.next().charAt(0);
        
        for(int i=0; i<fin; i++) {
            
            if(letra == frase.charAt(i))
                cont++;
            
        }
        
        return cont;
    }
    
    public String compararLongitud(Cadena c) {
        
        int longitud1 = c.getLongitud();
        
        System.out.println("ingrese una nueva frase:");
        String nueva_frase = leer.next();
        
        int longitud2 = nueva_frase.length();
        
        return longitud1==longitud2 ? "las cadenas tienen misma longitud"
                : ( longitud1>longitud2 ? "la cadena anterior es mayor a la nueva"
                : "la cadena nueva es mayor a la anterior");
    }
    
    public String unirFrase(Cadena c) {
        
        String frase1 = c.getFrase();
        String frase2 = "";
        String frase3 = "";
        
        System.out.println("ingrese la frase que desea unir:");
        frase2 = leer.next();
        
        frase3 = frase1 + frase2;
        
        return frase3;
    }
    
    public String reemplazar(Cadena c) {
        
        String frase1 = c.getFrase();
        String frase2 = "";
        char letra;
        int fin = c.getLongitud();
        
        System.out.println("ingrese una letra para reemplazar:");
        letra = leer.next().charAt(0);
        
        for(int i=0; i<fin; i++) {
            
            if(letra == frase1.charAt(i))
                frase2+='a';
            else
                frase2+=frase1.charAt(i);
        }
        
        return frase2;
    }
    
    public boolean contiene(Cadena c) {
        
        String frase = c.getFrase();
        int fin = c.getLongitud();
        char letra;
        int i=0;
        boolean contiene=false;
        
        System.out.println("ingrese una letra:");
        letra = leer.next().charAt(0);
        
        while( i<fin && contiene!=true ) {
            
            if( frase.charAt(i)==letra )
                contiene=true;
            
            i++;
            
        }
        
        return contiene;
    }
}
