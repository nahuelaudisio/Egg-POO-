package poo4.entidades;

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double superficie() {
        return base*altura;
    }
    
    public double perimetro() {
        return (base+altura)*2;
    }
    
    public void dibuja() {
        for(int i=0; i<altura; i++)
        {        
            for(int j=0; j<base; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
