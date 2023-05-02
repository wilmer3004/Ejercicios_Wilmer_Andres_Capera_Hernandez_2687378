package Operaciones;
// Instaciamos la clase Scanner 
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        // Declaramos variables
        int n1, n2, suma=0;
        System.out.println("Bienvenido al programa");
        // Solicitamos el primer numero
        System.out.println("Digite el primer numero");
        Scanner entrada = new Scanner (System.in);
        // Capturamos el primer numero
        n1 = entrada.nextInt();
        // Solicitamos el segundo numero
        System.out.println("Digite el segundo numero");
        // Capturamos el segundo numero
        n2 = entrada.nextInt();
        System.out.println("Los números son: " + n1 + " y " + n2);
        // Realizamos la operación suma
        suma = n1 + n2;
        // Mostramos resultados
        System.out.println("El resultado de la suma es: " + suma);
        // Limpiamos buffer
        entrada.close();
        
    }
}
