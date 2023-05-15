import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
    //   Declarar variables
    int n, cont = 0;
    // Instanciamos la clase Scanner
    Scanner entrada = new Scanner (System.in);       
    // Solicitamos la cantidad de números que va a ingresar el usuario
    System.out.println("Por favor digite la cantidad de números que va a ingresar: ");
    // Capturamos n
    n = entrada.nextInt();
    // Creamos el array que va a almacenar primeramente los números
    int [] numeros = new int [n];
    // Creamos un array donde se va a definir según la posición, el numero de veces que se repite el numero de esa posición
    int [] nRepetidos = new int [n];
    // Creamos un bucle para capturar los datos que va a almacenar el array
    for (int i = 0; i < numeros.length; i++) {
    // Solicitamos al usuario que ingrese un numero
    System.out.println("Por favor ingrese un numero que va a estar en la posición "+i+": ");
    // Capturamos los numeros
    numeros [i] = entrada.nextInt();
    }
    // Creamos un bucle para contar cuantas veces se repite cada numero 
    for (int x = 0 ; x < numeros.length; x++) {
        // Inicializamos nuevamente en 0 cont para que empiece a sumar desde cero nuevamente
        cont = 0;
        // Creamos un bucle para que evalué el primer numero con el siguiente y asi sucesivamente
        for (int j = 1; j < n - 1; j++) {
            // Le asignamos a la posición x del arreglo nRepetidos, el valor de cont
            nRepetidos [x] = cont;
            // Creamos una condición que se ejecute siempre y cuando el numero de la posición x sea igual a de la posición j
            if (numeros [x] == numeros [j]) {
                // Le asignamos a la posición x del arreglo nRepetidos, el valor de cont
                nRepetidos [x] = cont+=1;
            }
        }
        
    }
    // Creamos un bucle que imprima el numero y la cantidad de veces que se repite
    for (int k = 0; k < nRepetidos.length; k++) {
        if (nRepetidos[k] >0) {
            System.out.println("El numero " + numeros[k] + " esta repetido: " + nRepetidos[k] + " veces.");
        } else {
            System.out.println("El numero " + numeros[k] + " no esta repetido.");
        }
    }
    // Limpiamos el buffer

entrada.close();
    }
    
}
