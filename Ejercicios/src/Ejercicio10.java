import java.util.Scanner;
// Importamos la clase scanner
public class Ejercicio10 {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner (System.in);
        // Declaramos las variables
        String letra1, letra2, letra3, respuesta, confirmar;
        // Indicamos cuantas letras va a tener la palabra del juego ahorcado
        System.out.println("La palabra va a tener una cantidad de letras de: \n _ _ _  \n");
        // Solicitamos la primera letra
        System.out.println("Por favor ingrese alguna letra que usted cree que pueda ser: \n");
        // Capturamos el valor letra 1
        letra1 = entrada.nextLine();
        // Utilizamos la condicional switch para evaluar si se cumple alguna condición.
        switch (letra1.toLowerCase()) {
            case "l":
            // En el caso de que sea l imprimimos un mensaje que dice que la letra es correcta
                System.out.println("Es correcto la letra es l ya tiene una de las letras l _ _");
                break;
            case "u":
                System.out.println("Es correcto la letra es u ya tiene una de las letras _ u _");
                // En el caso de que sea u imprimimos un mensaje que dice que la letra es correcta
                break;
            case "z":
                System.out.println("Es correcto la letra es z ya tiene una de las letras _ _ z");
                // En el caso de que sea z imprimimos un mensaje que dice que la letra es correcta
                break;

        // Si la letra no es ninguna de las anteriores se dice que esta letra es incorrecta
            default: System.out.println("Lo sentimos la letra "+ letra1 +" no es correcta");
                break;
        }

        // Solicitamos otra letra letra
        System.out.println("Por favor ingrese alguna letra que usted cree que pueda ser: \n");
        // Capturamos el valor letra 2
        letra2 = entrada.nextLine();
        // Utilizamos la condicional switch para evaluar si se cumple alguna condición.
        switch (letra2.toLowerCase()) {
            case "l":
            // En el caso de que sea l imprimimos un mensaje que dice que la letra es correcta
                System.out.println("Es correcto la letra es l ya tiene una de las letras l _ _");
                break;
            case "u":
                System.out.println("Es correcto la letra es u ya tiene una de las letras _ u _");
                // En el caso de que sea u imprimimos un mensaje que dice que la letra es correcta
                break;
            case "z":
                System.out.println("Es correcto la letra es z ya tiene una de las letras _ _ z");
                // En el caso de que sea z imprimimos un mensaje que dice que la letra es correcta
                break;

        // Si la letra no es ninguna de las anteriores se dice que esta letra es incorrecta
            default: System.out.println("Lo sentimos la letra "+ letra2 +" no es correcta");
                break;
        }
        // Solicitamos otra letra letra
        System.out.println("Por favor ingrese alguna letra que usted cree que pueda ser: \n");
        // Capturamos el valor letra 3
        letra3 = entrada.nextLine();
        // Utilizamos la condicional switch para evaluar si se cumple alguna condición.
        switch (letra3.toLowerCase()) {
            case "l":
            // En el caso de que sea l imprimimos un mensaje que dice que la letra es correcta
                System.out.println("Es correcto la letra es l ya tiene una de las letras l _ _");
                break;
            case "u":
                System.out.println("Es correcto la letra es u ya tiene una de las letras _ u _");
                // En el caso de que sea u imprimimos un mensaje que dice que la letra es correcta
                break;
            case "z":
                System.out.println("Es correcto la letra es z ya tiene una de las letras _ _ z");
                // En el caso de que sea z imprimimos un mensaje que dice que la letra es correcta
                break;


        // Si la letra no es ninguna de las anteriores se dice que esta letra es incorrecta
            default: System.out.println("Lo sentimos la letra "+ letra3 +" no es correcta");
                break;
        }


System.out.println("Escriba si siente que ya tiene la respuesta, si escribe no  u otra respuesta perderá");
confirmar = entrada.nextLine();
if (confirmar.equalsIgnoreCase("si")) {
    System.out.println("Por favor ingrese la palabra que cree que es correcta de acuerdo con \n _ _ _ \n  ");
    respuesta = entrada.nextLine();
    if (respuesta.equalsIgnoreCase("luz")) {
    System.out.println("Felicidades a logrado completar el juego del ahorcado");
        
    }
    else { System.out.println("Lo sentimos esta no era la palabra \n Game Over");}

}
else {
    System.out.println("Su respuesta a sido incorrecta, por lo tanto perdió el juego");
}



        entrada.close();
    }
    
}
