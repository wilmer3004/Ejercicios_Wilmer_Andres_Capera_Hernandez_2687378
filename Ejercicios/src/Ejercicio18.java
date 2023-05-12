import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio18 {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaramos variables
    int respuesta = 2, intentos = 2;
    int contador = 1;
    // Iniciamos un bucle while
    while (respuesta >= 2 && respuesta <=4 || intentos == 1) {
// Preguntamos en el juego de aguinaldos
    System.out.println("¿Usted es hombre? \n1. Si \n2. No \n3. Tal vez \n4. Esta en lo correcto");
// Capturamos la respuesta
    respuesta = entrada.nextInt();
// Preguntamos en el juego de aguinaldos
System.out.println("¿Entonces es mujer? \n1. Si \n2. No \n3. Tal vez \n4. Acertó");
// Capturamos la respuesta
    respuesta = entrada.nextInt();
// Preguntamos en el juego de aguinaldos
System.out.println("¿Es mayor de edad? \n1. Si \n2. No \n3. Tal vez \n4. De acuerdo");
// Capturamos la respuesta
    respuesta = entrada.nextInt();
// Preguntamos en el juego de aguinaldos
System.out.println("Diga si para ganar \n1. Si \n2. No \n3. Tal vez \n4. Estoy de acuerdo");
// Capturamos la respuesta
    respuesta = entrada.nextInt();
// Preguntamos en el juego de aguinaldos
System.out.println("Felicidades usted gano, ¿quiere volver a jugar? \n1. Si \n2. No");
// Capturamos la respuesta
    intentos = entrada.nextInt();
    contador =+1;

    }
    System.out.println("Usted perdió o deseo no jugar mas, la cantidad de veces que jugo fueron: " + contador);
        entrada.close();
    }
    
}
