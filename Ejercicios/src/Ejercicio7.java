import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio7 {
    public static void main(String[] args) {
    // Declaramos las variables
    String sexo, nombre, colorOjos;
    int nCorbatas;
    Double peso, altura, lCabello;
    // Declaramos la variable Scanner que nos va a servir para solicitar datos
    Scanner entrada = new Scanner (System.in);
    // Solicitamos el nombre de la persona que esta ingresando los datos
    System.out.println("Escriba cual es su nombre:");
    nombre  = entrada.nextLine();
    // Indicamos los tipos de sexo que permite nuestro sistema
    System.out.println("Por favor indique o ingrese cual es su sexo: ");
    System.out.println("Hombre o masculino");
    System.out.println("Mujer o femenino");
    // Capturamos el valor sexo
    sexo = entrada.nextLine();
    // Capturamos el valor sexo
    // Creamos la condicional else if que va a retornar los datos que ingrese el usuario.
    // El equalsIgnoreCase ignora las mayúsculas y minúsculas
    if (sexo.equalsIgnoreCase("Hombre" ) || sexo.equalsIgnoreCase("masculino")) {
        System.out.println("Por favor ingrese el numero de corbatas que usted posee: ");
        // Solicitamos el numero de corbatas
        nCorbatas = entrada.nextInt();
        // Capturamos el numero de corbatas
        System.out.println("Por favor ingrese cual es su altura: ");
        // Solicitamos la atura 
        altura = entrada.nextDouble();
        // Capturamos la altura
        System.out.println("Por favor ingrese cual es su peso: ");
        // Solicitamos el peso
        peso = entrada.nextDouble();
        // Capturamos el peso
        System.out.println("De acuerdo con los datos ingresados usted se llama " + nombre + " y su sexo es " + sexo + 
        ", ademas de esto, usted cuenta con una cantidad de corbatas de " + nCorbatas + ", usted mide " + altura + " metros, y pesa " + peso + "kg."   );
        // Mostramos un mensaje con los datos anteriormente capturados
    }
    else if (sexo.equalsIgnoreCase("Mujer") || sexo.equalsIgnoreCase("femenino")) {
        System.out.println("Por favor ingrese el largo de su cabello: ");
        // Solicitamos el largo del cabello de la persona
        lCabello = entrada.nextDouble();
        // Capturamos el largo del cabello
        System.out.println("Por favor escriba el color de sus ojos: ");
        // Solicitamos el color de los ojos de la persona
        colorOjos = entrada.next();
        // Capturamos el color de los ojos 
        System.out.println("De acuerdo a los datos ingresados usted es " + nombre + " y su sexo es " + sexo + ", el largo de su cabello es de " + lCabello + "cm, y finalmente el color de sus ojos es " + colorOjos + ".");
        // Mostramos un mensaje de acuerdo a los datos ingresados por la persona
    }
    else {
        System.out.println("Usted no escribió ninguno de los tipos de sexo indicados");
        // Mostramos un mensaje en caso de que no se cumplan las condiciones de que no es ninguno de los tipos de sexo
    }
    // Limpiamos el buffer
    entrada.close();
    for (int i = 0; i < args.length; i++) {
        
    }

        
    }
    
}
