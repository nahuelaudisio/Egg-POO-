package poo1;

import java.util.Scanner;
import poo1.entidades.Libro;

public class POO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese el numero ISBN del libro:");
        int isbn = leer.nextInt();
        System.out.println("ingrese titulo del libro:");
        String titulo = leer.next();
        System.out.println("ingrese nombre del autor del libro:");
        String autor = leer.next();
        System.out.println("ingrese el numero de paginas del libro:");
        int nropage = leer.nextInt();
        
        Libro l1 = new Libro(isbn, titulo, autor, nropage);
        l1.mostrarLibro();
    }
}
