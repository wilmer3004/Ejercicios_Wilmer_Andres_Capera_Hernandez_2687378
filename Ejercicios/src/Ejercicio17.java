import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        String respuesta, comentario;
        int contador = 0, edad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        if (edad>=18) {
            do {
                
                System.out.println("Ingrese un comentario:  ");
                comentario = entrada.nextLine();
                System.out.println("Su comentario es: " + comentario);
                System.out.println("Desea comentar nuevamente si o no: ");
                respuesta = entrada.nextLine();
                contador = contador + 1;
            }while (respuesta.equalsIgnoreCase("si"));
            System.out.println("Usted comento " + contador + " veces.");
        } else {
        System.out.println("Usted es menor de edad por lo tanto no puede comentar ");    
        }
        entrada.close();
    }
}
