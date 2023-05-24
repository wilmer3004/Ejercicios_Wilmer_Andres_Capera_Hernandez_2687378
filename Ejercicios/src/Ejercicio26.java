// Crear una matriz de 4 x 4 y llenarlos con los numeros del 1 al 16

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaramos e inicializamos la matriz
        int [] [] numeros= new int [4][4];
        
         // Creamos un bucle para recorrer filas
         for (int nFilas = 0; nFilas < 4; nFilas++) {
            // Creamos otro bucle para recorrer las columnas de la matriz
            for (int nColumnas = 0; nColumnas < 4; nColumnas++) {
                // Solicitamos el numero
                System.out.println("Por favor ingrese el numero que quiere almacenar en la posición " + nFilas+ "," + nColumnas + " del 1 al 16: ");
                //Capturamos el numero en la matriz 
                numeros[nFilas][nColumnas] = entrada.nextInt();     
            }
    }
     // Creamos un bucle para recorrer filas
     for (int i = 0; i < 4; i++) {
        System.out.println();
    // Creamos otro bucle para recorrer las columnas de la matriz
        for (int j = 0; j < 4; j++) {
    //Mostramos los datos de la matriz 
            System.out.print(numeros[i][j]+" ");
        }
    }
    // Limpiamos buffer
    entrada.close();    
}
}

