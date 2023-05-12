package Prueba;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        int num, residuo = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" por favor ingrese algún numero, el programa dirá si es par o impar");
        num = entrada.nextInt();
        System.out.println("El numero es: " + num);
        residuo = num%2;
        if (residuo ==0) {
            System.out.println("El numero es par");
        } else if (residuo > 0) {
            System.out.println("El numero es impar");
        }
        entrada.close();
    }    
}
