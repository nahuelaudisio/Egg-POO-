package poo2.entidades;

import java.util.Scanner;

public class Circuferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final double PI = 3.14;
    private double radio;
    
    public Circuferencia(double radio) {
        while(radio<=0){
            //valido el radio, para que no sea cero ni negativo.
            System.out.println("valor incorrecto, vuelva a ingresar:");
            radio = leer.nextDouble();
        }
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        while(radio<=0) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            radio = leer.nextDouble();
        }
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double area() {
        return (PI*(radio*radio));
    }
    
    public double perimetro() {
        return (2*PI*radio);
    }
}
