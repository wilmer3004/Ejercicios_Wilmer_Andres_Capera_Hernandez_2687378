import java.util.Scanner;
    // Importamos la clase Scanner
public class Ejercicio4 {
    public static void main(String[] args) {
        // Declaramos la variable edad
        int edad;
        // Mostramos un mensaje de bienvenida
        System.out.println("Bienvenido a nuestra discoteca.");
        Scanner entrada = new Scanner(System.in);
        // Solicitamos la edad del usuario que va a entrar a la discoteca
        System.out.println("Por favor ingrese su edad.");
        // Realizamos una condicional para permitir el ingreso a la discoteca a mayores de 18 años
        edad = entrada.nextInt();
        if (edad >= 18) {
        // Mostramos un mensaje si se cumple la condición
            System.out.println("Usted puede ingresar a nuestra discoteca.");
        }
        else {
            System.out.println("Lo sentimos usted es menor a 18 años ");
        }
        // Limpiamos el buffer
        entrada.close();
    }
    
}
