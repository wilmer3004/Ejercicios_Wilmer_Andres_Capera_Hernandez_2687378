import java.util.*;
// Importamos todas las clases de util
public class Ejercicio19 {
    public static void main(String[] args) {
//Declarar variables 
int n;     int contador = 0; 
// Declarar array
//     String [] apellido;
// // Vamos a crear el objeto tipo array
//     apellido = new String [6];

// // En una sola linea
//     String [] apellido1 = new String [6];
// // Instanciamos la clase Scanner
    Scanner entrada = new Scanner (System.in);
// Solicitamos el dato n.
System.out.println("Por favor ingrese el valor de cuantos apellido quiere ingresar: ");
// Capturamos n
    n = entrada.nextInt();
// Cambiamos el tipo de dato del buffer
entrada.nextLine();
// Declaramos array
    String [] apellido2 = new String [n];
// // Llenamos el vector apellido
// apellido [0] = "Bulla";
// apellido [1] = "Boadilla";
// apellido [2] = "Briceño";
// apellido [3] = "Cotrina";
// apellido [4] = "Salinas";
// apellido [5] = "Rodriguez";
// // Llenar un vector desde su declaración
// String [] apellido3 = {"Bulla","Boadilla","Briceño","Cotrina","Salinas","Rodriguez"};
// // Creamos bucle
// for (int i = 0; i < apellido1.length; i++) {
// // Solicitamos el apellido 1
//     System.out.println("Por favor ingrese el apellido en la posición " + i);
// // Capturamos el dato
//     apellido1 [i] = entrada.nextLine();
    
// }
// System.out.println("Los apellidos ingresados son: ");
// // Creamos un bucle para mostrar los datos almacenados en el array apellido3
// for (int j = 0; j < apellido3.length; j++) {
//     System.out.println(apellido1[j]);
// }
// System.out.println("Los apellidos existentes son: ");
// // creamos un bucle for each
// for (String dato : apellido) {
//     System.out.println(dato);
// }

for (String dato1 : apellido2) {
    System.out.println("Por favor ingrese un apellido "  );
    // Capturamos el dato
        dato1 = entrada.nextLine();
        apellido2 [contador]  = dato1;
        contador +=1;
        
}
System.out.println("Los apellidos ingresados son:");
for (String dato2 : apellido2) {
    System.out.println(dato2);
}
entrada.close();
    }
    
}
