import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio13 {
    public static void main(String[] args) {
    // Declarar variables
    double nota, suma = 0, promedio = 0;
    int n;
    // Instanciamos la clase para capturar datos 
    Scanner entrada = new Scanner(System.in);
    // Solicitar la cantidad de notas
    System.out.println("Ingrese la cantidad de notas que va a registrar");
    n = entrada.nextInt();
    // Crear bucle
    for (int i = 0; i < n; i++) {
        System.out.println("Digite la calificacion # " + (i + 1));
        nota = entrada.nextDouble();
        suma = suma + nota;
        System.out.println("Su calificacion # " + (i + 1) + " es:" + nota);
    }
    promedio = (promedio+suma)/n;
    System.out.println("Su promedio es: " + promedio);
    entrada.close();
    }


    
}

