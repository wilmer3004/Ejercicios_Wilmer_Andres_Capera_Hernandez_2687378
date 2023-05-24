import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        // Declaramos variables
        int x , y;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos las filas que va a tener la matriz
        System.out.println("Por favor ingrese la cantidad de filas que desea: ");
        // Capturamos las filas
        x = entrada.nextInt();
        // Solicitamos las columnas que va a tener la matriz
        System.out.println("Por favor ingrese la cantidad de columnas que desea: ");
        // Capturamos las columnas
        y = entrada.nextInt();
        // Declaramos una matriz y la inicializamos
        int [] [] numeros = new int [x][y];
        // rellenamos la matriz numeros con un bucle
        // Creamos un bucle para recorrer filas
        for (int nFilas = 0; nFilas < x; nFilas++) {
        // Creamos otro bucle para recorrer las columnas de la matriz
        for (int nColumnas = 0; nColumnas < y; nColumnas++) {
            // Solicitamos el numero
            System.out.println("Por favor ingrese el numero que quiere almacenar en la posición " + nFilas+ "," + nColumnas);
            //Capturamos el numero en la matriz 
            numeros[nFilas][nColumnas] = entrada.nextInt();     
        }
        }
        // Creamos un bucle para recorrer filas
        for (int i = 0; i < x; i++) {
            System.out.println();
        // Creamos otro bucle para recorrer las columnas de la matriz
            for (int j = 0; j < y; j++) {
        //Mostramos los datos de la matriz 
                System.out.print(numeros[i][j]+" ");
            }
        }
        // Limpiamos buffer
        entrada.close();
    }
    
}
