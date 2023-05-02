import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio11 {
    public static void main(String[] args) {
        // Declaramos variables
        String confirmar, letra, palabra;
        int vidas = 5;
        // Instanciamos la clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este es un juego de ahorcados, donde usted contara con 5 vidas para descubrir su palabra \nSu palabra a descubrir tendrá la siguiente cantidad de letras \n_ _ _ \n");
        // Solicitamos si quiere participar en nuestro juego
        System.out.println("Por favor diga 'si', si quiere jugar de lo contrario diga 'no'");
        // Capturamos la confirmación
        confirmar = entrada.nextLine();
        // Validamos si la respuesta es si
        switch (confirmar.toLowerCase()) {
        // si la respuesta es si, se va a ejecutar lo siguiente
    case "si":
    System.out.println("\nUsted a seleccionado la respuesta si, a continuación iniciara el juego.\n");
    // Ejecutamos un ciclo while hasta que las vidas lleguen a 0 contando con 5 vidas de inicio
    while (vidas>0) {
        // Solicitamos una letra para compararla si pertenece a una de las letras luz
        System.out.println("Por favor ingrese una de las letras que cree que pueden ser: ");
        letra = entrada.nextLine();
        switch (letra.toLowerCase()) {
            case "l": 
            // Si la letra es igual a "l" vamos a decir que la letra es correcta y cual es su posición
                System.out.println("\nSu letra es correcta y esta en la posición l _ _ ");
                // Si la letra es correcta vamos a solicitar la palabra en caso de que si sea va a ganar el juego de lo contrario va a seguir preguntando
                System.out.println("\nCree que ya tiene la solución, por favor ingrese la palabra que cree que puede ser, de lo contrario diga no: ");
                palabra = entrada.nextLine();
                if (palabra.equalsIgnoreCase("luz")) {
                    vidas =- 5;
                    System.out.println("\nFelicidades usted ha ganado el juego.");
                    
                }
                else{
                    System.out.println("\nContinue intentándolo.");
                }
                break;
            case "u": 
                // Si la letra es igual a "u" vamos a decir que la letra es correcta y cual es su posición
                System.out.println("\nSu letra es correcta y esta en la posición  _ u _ ");
                // Si la letra es correcta vamos a solicitar la palabra en caso de que si sea va a ganar el juego de lo contrario va a seguir preguntando
                System.out.println("\nCree que ya tiene la solución, por favor ingrese la palabra que cree que puede ser, de lo contrario diga no: ");
                palabra = entrada.nextLine();
                if (palabra.equalsIgnoreCase("luz")) {
                    vidas =- 5;
                    System.out.println("\nFelicidades usted ha ganado el juego.");
                    
                }
                else{
                    System.out.println("\nContinue intentándolo.");
                }
                
                break;
            case "z": 
                // Si la letra es igual a "z" vamos a decir que la letra es correcta y cual es su posición
                System.out.println("\nSu letra es correcta y esta en la posición _ _ z ");
                // Si la letra es correcta vamos a solicitar la palabra en caso de que si sea va a ganar el juego de lo contrario va a seguir preguntando
                System.out.println("\nCree que ya tiene la solución, por favor ingrese la palabra que cree que puede ser, de lo contrario diga no: ");
                palabra = entrada.nextLine();
                if (palabra.equalsIgnoreCase("luz")) {
                    vidas =- 5;
                    System.out.println("\nFelicidades usted ha ganado el juego.");
                    
                }
                else{
                    System.out.println("\nContinue intentándolo.");
                }
                break;
                // Si se pierden una de las vidas el juego mostrara cuantas vidas le quedan
            default:System.out.println("\nLo sentimos, usted acaba de perder una vida."); vidas--;
            System.out.println( "\nSus vidas actuales son: " + vidas + "\n");
            // Si se pierden todas las vidas el juego terminara
            if (vidas == 0) {
                System.out.println("\nLo sentimos sus vidas se le agotaron y acaba de perder.");
            }
                break;
            
        }
        
    }
        break;
// Si la eleccion fue no el juego terminara y en su defecto mostrara un mensaje de que no quiso jugar el juego
    default: System.out.println("\nLo sentimos, pero según su eleccion usted no quiso participar en nuestro juego.");
        break;
}
// Limpiamos el buffer
    entrada.close();
    }
    
}
