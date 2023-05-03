import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaramos las variables
        String nTarea, descripcion, eleccion, respuesta, correccion = "si";
        int cantIntentos, calificacion;
        // Instanciamos el Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema de calificación y creación de tareas");
        // Solicitamos si el instructor quiere crear una tarea
        System.out.println("Por favor ingrese 'crear' para poder crear la tarea ");
        // Capturamos la variable eleccion
        eleccion = entrada.nextLine();
        // validamos si la eleccion digitada es crear
    if (eleccion.equalsIgnoreCase("crear")) {
        // Solicitamos el nombre de la tarea
    System.out.println("Por favor ingrese el nombre de la tarea");
    // Capturamos nTarea
    nTarea = entrada.nextLine();
    // Solicitamos la descripcion o lo que se tiene que realizar en la tarea 
    System.out.println("Por favor ingrese lo que se tiene que realizar en la tarea");
    // Capturamos la descripcion
    descripcion = entrada.nextLine();
    // Solicitamos la cantidad de intentos de respuesta que tendrá la tarea
    System.out.println("Por favor ingrese la cantidad de intentos, que va a tener la tarea");
    // Capturamos la cantidad de intentos
    cantIntentos = entrada.nextInt();
    System.out.println("La tarea " + nTarea + ". \nTiene una cantidad de intentos de: " + cantIntentos + ". \nDescripción:\n" + descripcion );
    // Validamos que la cantidad de intentos sea mayor a 0
    if (cantIntentos > 0){  
        // Mientras la cantidad de intentos sea mayor a 0 se va a ejecutar
        while (cantIntentos > 0) {
            // Se solicita la respuesta de la tarea
            System.out.println("por favor ingrese su respuesta de la tarea: " + nTarea + "\nUsted posee " + cantIntentos + " intentos.");
            // Capturamos la respuesta del alumno
            respuesta = entrada.nextLine();
            System.out.println("Su respuesta es: " + respuesta);
            // Restamos un intento si escribe alguna respuesta
            cantIntentos-=1;
            // Solicitamos si quiere seguir ingresando alguna correccion de respuesta mas
            System.out.println("Por favor ingrese 'si', si quiere volver a intentarlo, de lo contrario diga 'no' si cree que su respuesta es correcta ");
            // Capturamos la respuesta si quiere realizar alguna correccion a su respuesta
            correccion = entrada.nextLine();
            // Validamos si la cantidad de intentos es <= 0 si se cumple se le dice al alumno que tiene que esperar hasta que su instructor le califique
            if (cantIntentos <= 0) {
                System.out.println("Usted ya perdió todos sus intentos ahora el instructor va a calificar su tarea");
            }
            // Si la respuesta a correccion es no va a restar un numero muy alto a los intentos y por este motivo va a decir que los intentos se acabaron
            if (correccion.equalsIgnoreCase("no")) {
                cantIntentos-=30000;
            }
            // Valida si los intentos son menores o iguales a 0
           if (cantIntentos <= 0) {
            // Solicita la calificacion de la tarea de 0 a 100
            System.out.println("Por favor ingrese la calificacion de la tarea de 0 a 100");
            calificacion = entrada.nextInt();
            // Valida que la calificacion sea menor o igual a 100 pero no sea menor a 80
            if (calificacion <= 100 && calificacion >= 80) {
                System.out.println("Su calificacion es: " + calificacion);
                // Se le asigna una cantidad de estrellas según la nota que haya sacado
                System.out.println("Por lo tanto el alumno tiene una calificacion de 5 estrellas");
                
            }
            // Valida que la calificacion sea menor o igual a 79 pero no sea menor a 60
            else if (calificacion <= 79 && calificacion >= 60) {
                System.out.println("Su calificacion es: " + calificacion);
                // Se le asigna una cantidad de estrellas según la nota que haya sacado
                System.out.println("Por lo tanto el alumno tiene una calificacion de 4 estrellas");
                
            }
            // Valida que la calificacion sea menor o igual a 59 pero no sea menor a 40
            else if (calificacion <= 59 && calificacion >= 40) {
                System.out.println("Su calificacion es: " + calificacion);
                // Se le asigna una cantidad de estrellas según la nota que haya sacado
                System.out.println("Por lo tanto el alumno tiene una calificacion de 3 estrellas");
                
            }
            // Valida que la calificacion sea menor o igual a 39 pero no sea menor  a 20
            else if (calificacion <= 39 && calificacion >= 20) {
                System.out.println("Su calificacion es: " + calificacion);
                // Se le asigna una cantidad de estrellas según la nota que haya sacado
                System.out.println("Por lo tanto el alumno tiene una calificacion de 2 estrellas");

            }
            // Valida que la calificacion sea menor o igual a 19 pero no sea menor  a 0
            else if (calificacion <= 19 && calificacion >= 0) {
                System.out.println("Su calificacion es: " + calificacion);
                // Se le asigna una cantidad de estrellas según la nota que haya sacado
                System.out.println("Por lo tanto el alumno tiene una calificacion de 1 estrellas");
                
            }
           }
        //    Si el valor es otro valor o tipo de dato, va a decir que el valor es invalido
           else { System.out.println("usted ingreso un valor no valido");}
    }
}

    else { 
    //    Si el valor es otro valor o tipo de dato, va a decir que el valor es invalido 
    System.out.println("Ingreso un dato distinto a 'respuesta'");
}
}
//    Si el valor es otro valor o tipo de dato, va a decir que el valor es invalido
  else {
System.out.println("Su respuesta fue diferente a crear");
}  
// Limpiamos el buffer
        entrada.close();
        
    }
}
