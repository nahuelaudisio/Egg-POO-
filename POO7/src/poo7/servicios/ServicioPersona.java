package poo7.servicios;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import poo7.entidades.Persona;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("ingrese nombre de la persona:");
        String nombre = leer.next();
        
        System.out.println("ingrese edad de la persona:");
        int edad = leer.nextInt();
        edad=valida(edad);
        
        System.out.println("ingrese sexo de la persona(H/M):");
        char sexo = leer.next().charAt(0);
        sexo = valida(sexo);
        
        System.out.println("ingrese peso de la persona:");
        double peso = leer.nextDouble();
        peso = valida(peso);
        
        System.out.println("ingrese altura de la persona:");
        double altura = leer.nextDouble();
        altura = valida(altura);
        
        return new Persona (nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona p) {
        int aux=0;
        double imc = p.getPeso()/((double)(Math.pow(p.getAltura(), 2)));
        
        if(imc<20) {
            aux=-1;//debajo de su peso ideal.
            System.out.println("usted esta por debajo de su peso ideal.");
        }
        if(imc>=20 && imc<=25) {
            aux=0;//esta en su peso ideal.
            System.out.println("usted esta en su peso ideal.");
        }
        if(imc>25) {
            aux=1;//sobrepeso.
            System.out.println("usted esta en sobrepeso.");
        }
        
        return aux;
    }
    
    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad()>=18 ? true : false;
    }
    
    public int valida(int dato) {
        while(dato<=0) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            dato = leer.nextInt();
        }
        
        return dato;
    }
    
    public char valida(char dato) {
        dato = toUpperCase(dato);
        while( (dato!='H') && (dato!='M')) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            dato = leer.next().charAt(0);
            dato = toUpperCase(dato);
        }
        
        return dato;
    }
    
    public double valida(double dato) {
        while(dato<=0) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            dato = leer.nextDouble();
        }
        
        return dato;
    }
    
}
