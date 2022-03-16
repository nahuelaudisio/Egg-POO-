package poo9;
/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
import java.util.Scanner;
import poo9.entidades.Matematica;
import poo9.servicios.ServicioMatematica;

public class POO9 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        ServicioMatematica sm = new ServicioMatematica();
        Matematica m = sm.crearMatematica();
        
        System.out.println("los atributos son: "+m.getNumero1()+" y "+m.getNumero2());
        
        int mayor = sm.devolverMayor(m.getNumero1(), m.getNumero2());
        System.out.println("el mayor de los dos es:"+mayor);
        
        int potencia = sm.calcularPotencia(m.getNumero1(), m.getNumero2());
        System.out.println("la potencia del numero mayor, elevado al numero menor es: "+potencia);
        
        double raiz = sm.calcularRaiz(m.getNumero1(), m.getNumero2());
        System.out.println("la raiz del menor de los numeros es: "+raiz);
    }
}
