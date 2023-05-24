// Crear una matriz de 5 filas y n columnas y en cada posición llenarla con un numero aleatorio

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
          // Declaramos variables
          int  y;
          // Instanciamos la clase Scanner
          Scanner entrada = new Scanner(System.in);
          // Solicitamos las columnas que va a tener la matriz
          System.out.println("Por favor ingrese la cantidad de columnas que desea: ");
          // Capturamos las filas
          y = entrada.nextInt();
           // Declaramos e inicializamos la matriz
          int [] [] num= new int [5] [y];
          for (int nFilas = 0; nFilas < 5; nFilas++) {
            // Creamos otro bucle para recorrer las columnas de la matriz
            for (int nColumnas = 0; nColumnas < y; nColumnas++) {
                
                // Generamos un numero aleatorio en la matriz
                num[nFilas][nColumnas] = (int)(Math.random()*100)+1;    
            }
            }
            // Creamos un bucle para recorrer filas
            for (int i = 0; i < 4; i++) {
                System.out.println();
            // Creamos otro bucle para recorrer las columnas de la matriz
                for (int j = 0; j < 4; j++) {
            //Mostramos los datos de la matriz 
                    System.out.print(num[i][j]+" ");
                }
            }
    // Limpiamos buffer
    entrada.close();
    }
    
}
