package poo3.entidades;

import java.util.Scanner;

public class Operacion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int numero1;
    private int numero2;

    //item a:
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //item b:
    public Operacion() {
    }
    
    //item c:
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //item e:
    public int suma() {
        return (numero1 + numero2);
    }
    
    //item f:
    public int resta() {
        return (numero1 - numero2);
    }
    
    //item g:
    public int multiplica() {
        if(numero1!=0 && numero2!=0)
            return (numero1 * numero2);
        else
            return 0;//se le debe informar al usuario que no se pudo hacer la operacion.
    }
    
    //item h:
    public double divide() {
        if(numero2!=0)
            return (numero1/numero2);
        else
            return 0;
    }
    
}
