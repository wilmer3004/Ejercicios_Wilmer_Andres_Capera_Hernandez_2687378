import java.util.Scanner;
    // Importamos la clase Scanner
public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos la variable edad
        int edad;
        // Mostramos un mensaje de bienvenida
        System.out.println("Bienvenido a nuestra discoteca.");
        // Declaramos la variable Scanner que nos va a servir para solicitar datos
        Scanner entrada = new Scanner(System.in);
        // Solicitamos la edad del usuario que va a entrar a la discoteca
        System.out.println("Por favor ingrese su edad: ");
        // Capturamos el valor edad
        // Realizamos una condicional para permitir el ingreso a la discoteca a mayores de 18 años
        edad = entrada.nextInt();
        if (edad >= 18) {
        // Mostramos un mensaje si se cumple la condición de ser mayor a 18 años.
            System.out.println("Usted puede ingresar a nuestra discoteca.");
        }
        else if (edad < 18 && edad > 0 ) {
            System.out.println("Lo sentimos usted es menor a 18 años por lo cual usted no puede ingresar a nuestra discoteca ");
        // Mostramos un mensaje si se cumple la condición de ser menor a 18 años por lo cual la persona no podrá ingresar a la discoteca.
        }
       else if (edad<=0) {
            // Si la edad es menor a cero se mostrara un mensaje de que la edad es invalida
            System.out.println("Su edad es invalida" );

        }
        else {
            
        }
        // Limpiamos el buffer
        entrada.close();
    }
    
}
