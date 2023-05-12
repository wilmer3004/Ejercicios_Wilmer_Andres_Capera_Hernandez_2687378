import java.util.Scanner;
// Importamos la clase Scanner
public class Ejercicio14 {
    public static void main(String[] args) {
        // Declarar variables
        double nota, suma = 0, promedio = 0;
        int resp=1, i = 0;
        // Instanciamos la clase para capturar datos 
        Scanner entrada = new Scanner(System.in);
        while (resp == 1) {
            System.out.println("Digite la calificacion # " + (i + 1));
            nota = entrada.nextDouble();
            suma = suma + nota;
            System.out.println("Su calificacion # " + (i + 1) + " es:" + nota);  
            System.out.println("Desea ingresar otra calificacion\n1.Si\n2.No");
            resp = entrada.nextInt();
            i= i + 1; //i = i + 1
        }
        promedio = (promedio+suma)/i;
        System.out.println("Su promedio es: " + promedio);
        entrada.close();
        }
}
