import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("1.Circulo");
        System.out.println("2.Trapecio");
        Scanner entrada = new Scanner (System.in);
        System.out.println("Indique a que figura le quiere calcular el area y el perímetro:");
        int figura = entrada.nextInt () ;
        
        switch (figura) {
            case 1: Ejercicio2.circulo();
                
                break;
                case 2: Ejercicio2.trapecio();
                
                break;
            default: System.out.println("No es ninguno de los valores indicados");
                break;
        }
        entrada.close();
    }
     public static void circulo() {
        double pi = 3.1416 ;
        System.out.println("Vamos a calcular el area del circulo");
        Scanner num = new Scanner(System.in);
        System.out.println("Escriba el radio de su circulo");
        int radio = num.nextInt();
        double resultado = pi * (radio * radio) ;
        System.out.println("El area de su circulo es: " + resultado);
        double resultado2 = (2 * pi) * radio;
        System.out.println("Ahora vamos a calcular el perímetro de su circulo");
        System.out.println("El perímetro de su circulo es: " + resultado2);
        num.close();
        }
        public static void trapecio() {
        System.out.println("Vamos a calcular el area del trapecio");
        Scanner num1 = new Scanner(System.in);
        System.out.println("Escriba la base menor de su trapecio");
        int baseMenor = num1.nextInt();
        System.out.println("Escriba la base Mayor de su trapecio");
        int baseMayor = num1.nextInt();
        System.out.println("Escriba la altura de su trapecio");
        int altura = num1.nextInt();
        double resultado =   (0.5 * (baseMayor + baseMenor)) * altura ;
        System.out.println("El area de su trapecio es: " + resultado);
        System.out.println("Ahora para calcular el perímetro de su trapecio llene los siguientes datos solicitados");
        System.out.println("Escriba el lado a de su trapecio");
        int a = num1.nextInt();
        System.out.println("Escriba el lado b de su trapecio");
        int b = num1.nextInt();
        System.out.println("Escriba el lado c de su trapecio");
        int c = num1.nextInt();
        System.out.println("Escriba el lado d de su trapecio");
        int d = num1.nextInt();
        double resultado2 = a + b + c + d;
        System.out.println("El perímetro de su trapecio es: " + resultado2);
        num1.close();
        }
    
    
}
