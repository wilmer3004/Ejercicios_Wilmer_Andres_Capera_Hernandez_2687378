import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija el numero, del tipo de llamada Telefonica va a realizar.");
        System.out.println("1. Llamada a fijo.");
        System.out.println("2. Llamada a celular.");
        System.out.println("3. Llamada a larga distancia.");
        System.out.println("4. Llamada internacional.");
        int tipoLlamada = entrada.nextInt ();

        switch (tipoLlamada) {
            case 1:
                Ejercicio3.llamadaTelefonoFijo ();
                break;
            case 2:
                Ejercicio3.llamadaCelular (); 
            break;
            case 3:
                Ejercicio3.llamadaLargaDistancia();
            break;
            case 4:
                Ejercicio3.llamadaInternacional();
            break;
            default: System.out.println("No es ninguno de los valores indicados");
                break;
        }
        entrada.close();
    }
    public static void llamadaTelefonoFijo() {
        int valorMinutoFijo = 200;
        Scanner tiempoDeLlamada = new Scanner(System.in);
        System.out.println("Escriba el tiempo que estuvo en llamada en minutos");
        double tiempo1 =  tiempoDeLlamada.nextInt();
        double costo = tiempo1 * valorMinutoFijo;
        System.out.println("El costo de su llamada al teléfono fijo es de: " + costo);
tiempoDeLlamada.close();
        }

    public static void llamadaCelular() {
        int valorMinutoCelular = 500;
        Scanner tiempoDeLlamada = new Scanner(System.in);
        System.out.println("Escriba el tiempo que estuvo en llamada en minutos");
        double tiempo1 =  tiempoDeLlamada.nextInt();
        double costo = tiempo1 * valorMinutoCelular;
        System.out.println("El costo de su llamada al teléfono celular es de: " + costo);
tiempoDeLlamada.close();
    }

    public static void llamadaLargaDistancia() {
        int valorMinutoLargaDistancia = 1000;
        Scanner tiempoDeLlamada = new Scanner(System.in);
        System.out.println("Escriba el tiempo que estuvo en llamada en minutos");
        double tiempo1 =  tiempoDeLlamada.nextInt();
        double costo = tiempo1 * valorMinutoLargaDistancia;
        System.out.println("El costo de su llamada al teléfono a larga distancia es de: " + costo);
tiempoDeLlamada.close();
    }
    
    public static void llamadaInternacional() {
        int valorMinutoInternacional = 2000;
        Scanner tiempoDeLlamada = new Scanner(System.in);
        System.out.println("Escriba el tiempo que estuvo en llamada en minutos");
        double tiempo1 =  tiempoDeLlamada.nextInt();
        double costo = tiempo1 * valorMinutoInternacional;
        System.out.println("El costo de su llamada internacional es de: " + costo);
tiempoDeLlamada.close();   
    }
    
}
