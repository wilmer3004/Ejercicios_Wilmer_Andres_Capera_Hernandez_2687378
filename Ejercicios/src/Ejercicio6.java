import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio6 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a usar
        String color;
        // Declaramos la variable Scanner que nos va a servir para solicitar datos
        Scanner entrada = new Scanner (System.in); 
        // Imprimimos las posibles frutas que se pueden llamar según el color
        System.out.println("Por favor ingrese el color: \n verde \n rojo \n morado \n| amarillo :");
        // Capturamos la variable edad
        color = entrada.nextLine();
        // Creamos la condicional else if que va a retornar las frutas según su color.
        // El equalsIgnoreCase ignora las mayúsculas y minúsculas
        if (color.equalsIgnoreCase("verde")) {
        // Se indica a que color va estar asociado este if como en los siguientes
            System.out.println("Manzana");
        // Se muestra un mensaje indicando la fruta que esta asociada a este color
        }
        else if (color.equalsIgnoreCase("rojo")){
            System.out.println("Fresa");
        }
        else if (color.equalsIgnoreCase("morado")) {
            System.out.println("Mora");
        }
        else if (color.equalsIgnoreCase("amarillo")){
            System.out.println("Banano");
        }
        else {
            System.out.println("No a escrito ninguno de los colores indicados, por lo tanto no le podemos mostrar ninguna fruta asociada a este color: " + color);
        }

        // Limpiamos el buffer
        entrada.close();

    }
    
}
