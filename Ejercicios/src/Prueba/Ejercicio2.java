package Prueba;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Double p1, p2, p3, gTotal = 0.0, gPartido1 = 0.0, gPartido2 = 0.0, gPartido3 = 0.0,rTotal;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Bienvenido señor directivo de millonarios");
        System.out.println("Por favor digite el recaudo del partido 1: ");
        p1 = entrada.nextDouble();
        gPartido1 = p1 * 0.2;
        System.out.println("La ganancia de su partido es de: " + gPartido1);
        System.out.println("Por favor digite el recaudo del partido 2: ");
        p2 = entrada.nextDouble();
        gPartido2 = p2 * 0.3;
        System.out.println("La ganancia de su partido es de: " + gPartido2);
        System.out.println("Por favor digite el recaudo del partido 3: ");
        p3 = entrada.nextDouble();
        gPartido3 = p3 * 0.4;
        System.out.println("La ganancia de su partido es de: " + gPartido3);
        rTotal = p1 +p2+p3;
        gTotal = gPartido1 + gPartido2 + gPartido3;
        System.out.println("El recaudo total en los 3 partidos fueron de: " + rTotal + " y la ganancia total es de: " + gTotal);
        entrada.close();
    }

}
