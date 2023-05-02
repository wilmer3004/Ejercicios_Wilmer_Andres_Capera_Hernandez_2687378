import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        String nTarea, descripcion, eleccion, calificacion;
        int cantIntentos, cantTareas = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema de calificación y creación de tareas");
        System.out.println("Por favor ingrese 'crear' para poder crear la tarea ");
        eleccion = entrada.nextLine();
        
if (eleccion.equalsIgnoreCase("crear")) {
    System.out.println("Por favor ingrese el nombre de la tarea");
    nTarea = entrada.nextLine(); 
    System.out.println("El nombre de la tarea es: " + nTarea);
    System.out.println("Por favor ingrese la cantidad de intentos, que va a tener la tarea");
    cantIntentos = entrada.nextInt(); 
    System.out.println();
}
else {
System.out.println("Su respuesta fue diferente a crear");
}
 

        
        entrada.close();
        
    }
    
}
