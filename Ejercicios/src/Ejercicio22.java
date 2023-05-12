// 2 crear un vector que capture la letra de una palada y va a organizar al reveza la misma palabra en otro vector

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        // Declaramos variables
        int n, cont=1, contador=0, cont1=0;
        String letra, letra1;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner (System.in);
        // Solicitamos la cantidad de letras que va a ingresar
        System.out.println("Por favor ingrese la cantidad de letras, que tiene la palabra que va a ingresar");
        // Capturamos la cantidad de letras que va a tener la palabra que queremos
        n = entrada.nextInt();
        // Cambiamos el tipo de dato que es capturado por el Scanner
        entrada.nextLine();
        // Declaramos el array que va a almacenar las letras
        String [] letras = new String [n];
        // Se van a solicitar las letras según la cantidad de letras totales solicitadas anteriormente
        for (int i = 0; i < letras.length; i++) {
            // Se solicita la primera letra de la palabra
            System.out.println("Digite la letra de la posición: " + cont );
            // Capturamos en el arreglo letras, cada letra ingresada
            letras [i] = entrada.nextLine();
            cont+=1;
        }
        // Declaramos el arreglo reverso
        String [] reverso = new String [n];
        // Mostramos cual fue la palabra ingresada en el arreglo según las letras ingresadas
        System.out.print("La palabra ingresada fue: ");
        // Creamos un bucle para almacenar cada una de las letras almacenadas en el arreglo letras en el arreglo reverso y mostramos las letras del arreglo letras 
        for (int x = 0; x < letras.length; x++) {
        // Mostramos cada una de las letras almacenadas en el arreglo
            System.out.print(letras[contador]);
        // Vamos a asignarle a la posición contador del arreglo reverso, la letra que esta almacenada en el arreglo letras en la posición reverso
            reverso [contador] = letras[x] ;
            contador = contador + 1;
        }
// Creamos un bucle para que se ejecute mientras se cumpla la condición de j
        for (int j = n-1; j >= 0; j--) {
            // creamos una variable para que se le sume a cont la cantidad n y no se ejecute mas la condición if (j<= (n-1)/2)
            if (j<= (n-1)/2) {
                cont1 = cont1 + n;
            }
            // Utilizamos la siguiente condición para validar el ultimo valor y el valor 0 del arreglo, donde se  acomodara el ultimo en el primero y el primero en el ultimo 
              if (cont1<n-1) {
                // Se les asigna un valor temporal a las variables para asi poderlas acomodar en forma contraria
                letra = reverso [j];
                letra1 = reverso [cont1];
                reverso [j] = letra1;
                reverso [cont1] = letra;
                cont1+=1;
              }
                

            }
            // Imprimimos las letras organizadas alrevez
        System.out.print("\nLa palabra de forma contraria es: ");
        for (String dato1 : reverso) {
            System.out.print(dato1 );
        }
        // Limpiamos buffer
        entrada.close();
    }
}
