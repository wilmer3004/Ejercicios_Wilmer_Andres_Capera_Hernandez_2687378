package Prueba;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
    int i = 1, vIps;
    String seleccion = "si";
    Scanner entrada = new Scanner(System.in);
    for (int vTotal = 100000; 0 < vTotal; i++) {
        int vDia = 1000;
        int sumaV = 0;
        do {
            System.out.println("La Cantidad de vacunas disponibles actualmente el dia de hoy es de: " + vDia );
            System.out.println("Por favor digite cuantas vacunas va a distribuir a la IPS, sabiendo que el máximo es 200 por IPS\nDigite: ");
            vIps = entrada.nextInt();
            entrada.nextLine();
            if (vIps<=200 && vTotal>0 && vTotal>200&& sumaV<1000)  {
                System.out.println("Usted distribuyo a la IPS " + vIps + " vacunas. ");
                sumaV = sumaV + vIps;
                vDia = vDia - vIps;
            System.out.println("¿Desea Ingresar otra cantidad de vacunas nuevamente? \nsi \nno \nSeleccione:");
            seleccion = entrada.nextLine(); 
            } else if (vIps > 200 && vTotal>0 && vTotal>200&& sumaV<1000) {
                System.out.println("Usted ingreso un valor mayor a 200, por lo tanto no puede registrar este valor.");
                System.out.println("¿Desea Ingresar otra cantidad de vacunas nuevamente? \nsi \nno \nSeleccione:");
                seleccion = entrada.nextLine();
            } 
            else if (vTotal > 0 && vTotal <200 && sumaV>1000){
                System.out.println("El valor ingresado fue mayor al total de vacunas que quedan en existencia que son: " + vTotal );
                System.out.println("¿Desea Ingresar otra cantidad de vacunas nuevamente? \nsi \nno \nSeleccione:");
            }
        }while (0 < vDia && seleccion.equalsIgnoreCase("si"));
        System.out.println("Usted distribuyo el dia de hoy " + sumaV + " vacunas.");
        vTotal = vTotal - sumaV;
        System.out.println("El valor que hay en existencia de vacunas total es de: " + vTotal + " y se han distribuido " + i + " días.");
    }
    System.out.println("Ya no hay existencia de vacunas");
    entrada.close();
    }
    
}
