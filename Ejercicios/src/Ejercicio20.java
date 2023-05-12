

import java.util.Scanner;

public class Ejercicio20 {
    // Un programa que le permita al usuario ingresar n numeros según la cantidad que desee el usuario y que al final se muestren los numeros y la suma
    public static void main(String[] args) {
        // Declaramos variables 
        int n, suma=0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos la cantidad de numeros que va ingresar
        System.out.println("Digite la cantidad de numeros que va a ingresar");
        // Capturamos n
        n = entrada.nextInt();
        // Declaramos arrays
        int [] num = new int[n];
        // Creamos un bucle para solicitar los numeros
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite un numero en la posición: " + i);
            num [i] = entrada.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        System.out.print("Los numeros que usted ingreso fueron: ");
        for (int dato : num) {
            System.out.print(dato + " ");
        }
        System.out.println();
        System.out.println("La suma total de estos numeros es de: " + suma);
        entrada.close();
    }
    
}
