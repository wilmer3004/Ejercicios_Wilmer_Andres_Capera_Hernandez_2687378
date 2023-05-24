// Hacer una matriz de 4x4 y llenarla con numeros, sumar una fila, sumar una columna, suma una diagonal

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        // Declaramos e inicializamos la matriz
        int [] [] numeros= new int [4][4];
        // Declaramos variables
        int suma1 = 0, suma2 = 0, suma3 = 0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
         // Creamos un bucle para recorrer filas
         for (int nFilas = 0; nFilas < 4; nFilas++) {
            // Creamos otro bucle para recorrer las columnas de la matriz
            for (int nColumnas = 0; nColumnas < 4; nColumnas++) {
                // Solicitamos el numero
                System.out.println("Por favor ingrese el numero que quiere almacenar en la posición " + nFilas+ "," + nColumnas + ": ");
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
    System.out.println();
        System.out.println("se van a sumar los siguientes numeros de la fila 3: ");
    // Creamos un bucle para recorrer las columnas de la matriz
        for (int l = 0; l < 4; l++) {
    //Mostramos los datos de la matriz 
            System.out.print(numeros[2][l]+" ");
    // Sumamos los datos de la fila
            suma1 = suma1 + numeros[2][l];
        }
        System.out.println();
        System.out.println("La suma total de la fila 3 es: " + suma1);
        System.out.println("se van a sumar los siguientes numeros de la columna 2: ");
        // Creamos un bucle para recorrer las columnas de la matriz
            for (int k = 0; k < 4; k++) {
        //Mostramos los datos de la matriz 
                System.out.print(numeros[k][1]+" ");
        // Sumamos los datos de la columna
                suma2 = suma2 + numeros[k][1];
            }
            System.out.println();
        System.out.println("La suma total de la columna 2 es: " + suma2);
        System.out.println("se van a sumar los siguientes numeros de la diagonal que inicia en la posición 0,0 y termina en la posición 3,3: ");
        // Creamos un bucle para recorrer las columnas de la matriz
        for (int z = 0; z < 4; z++) {
            //Mostramos los datos de la matriz 
                    System.out.print(numeros[z][z]+" ");
            // Sumamos los datos de la diagonal
            suma3 = suma3 + numeros[z][z]; 
                }
                System.out.println();
        System.out.println("La suma total de la diagonal que inicia en la posición 0,0 y termina en la posición 3,3 es de: " + suma3);
    
    // Limpiamos buffer
    entrada.close();
    }
}
