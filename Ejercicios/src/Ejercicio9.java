import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio9 {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Declarar variables
        double num1, num2, resultado;
        String eleccion;
        // Solicitamos el primer numero
        System.out.println("Por favor ingrese el segundo numero ");
        // capturamos el primer numero
        num1 = entrada.nextDouble();
        // Solicitamos el segundo numero
        System.out.println("Por favor ingrese el segundo numero ");
        // capturamos el segundo numero
        num2 = entrada.nextDouble();
        // Solicitamos la operación que quiere realizar
        System.out.println("Por favor ingrese la operación que va a realizar: \n 1. suma \n 2. resta \n 3. multiplicacion \n 4. division \n 5. potencia \n Elija alguna de las anteriores operaciones");
        // Capturamos la elección de operación 
        eleccion = entrada.nextLine();
        // Utilizamos un switch para poder realizar la operación según la eleccion
        switch (eleccion.toLowerCase()) {
            case "suma":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma de "+ num1 + " + " + num2 + " = " + resultado);
                // mostramos el resultado de la operación
                break;
            case "resta":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta de "+ num1 + " - " + num2 + " = " + resultado);
                // mostramos el resultado de la operación
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion de "+ num1 + " * " + num2 + " = " + resultado);
                // mostramos el resultado de la operación
                break;
            case "division":
                resultado = num1 / num2;
                System.out.println("El resultado de la division de "+ num1 + " / " + num2 + " = " + resultado);
                // mostramos el resultado de la operación
                break;
            case "potencia":
                resultado = Math.pow(num1, num2);
                System.out.println("El resultado de la potencia de "+ num1 + " elevado a " + num2 + " = " + resultado);
                // mostramos el resultado de la operación
                break;
        
            default: System.out.println("Lo sentimos usted no ingreso una operación valida");
                break;
        }


        entrada.close();
    }
}
