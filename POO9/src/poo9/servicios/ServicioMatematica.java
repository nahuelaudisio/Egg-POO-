package poo9.servicios;
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

public class ServicioMatematica {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Matematica crearMatematica() {
        
        Matematica m = new Matematica();
        
        int numero1 = ( (int)(Math.random()*10) );//para obtener un numero entero random.
        m.setNumero1(numero1);
        
        int numero2 = ( (int)(Math.random()*10) );//para obtener un numero entero random.
        m.setNumero2(numero2);
        
        return m;
    }
    
    public int devolverMayor(int numero1, int numero2) {
        
        if(numero1 > numero2)
            return numero1;
        else
            return numero2;
    }
    
    public int calcularPotencia(int numero1, int numero2) {
        
        int base,potencia;
        
        if(numero1>numero2)//el mayor es el numero1 entonces ese va a ser la base.
            base=numero1;
        else
            base=numero2;//el mayor es el numero2 entonces ese va a ser la base.
        
        potencia=numero1;
        
        for(int i=1; i<numero2; i++)//potenciacion
            potencia=potencia*numero1;
        
        return potencia;//resultado.
    }
    
    public double calcularRaiz(int numero1, int numero2) {
        
        int menor;
        double raiz;
        
        if(numero1<numero2)
            menor = numero1;
        else
            menor = numero2;
        
        menor=Math.abs(menor);
        
        raiz = Math.sqrt(menor);
        
        return  Math.sqrt(menor);
    }
}
