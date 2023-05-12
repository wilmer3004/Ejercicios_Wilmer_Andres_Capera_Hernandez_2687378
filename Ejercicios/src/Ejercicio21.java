// 1 Hacer un programa que nos permita capturar n números y de esos n números organizarlos de mayor a menor en otro vector

import java.util.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        int n, contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de números que va a ingresar");
        n=entrada.nextInt();
        int [] num = new int [n];
        // Creamos un bucle para solicitar los números
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite un numero en la posición: " + i);
            num [i] = entrada.nextInt();
        }
        int [] maxMin = new int [n];
         // Creamos un bucle para mostrar los números que se ingresaron y estos asignarlos a un nuevo arreglo donde vamos a organizarlos de mayor a menor
        System.out.print("Los números que usted ingreso fueron: ");
        for (int x = 0; x < maxMin.length; x++) {
            System.out.print(num[contador] + " ");
            maxMin [contador] = num[x] ;
            contador = contador + 1;
        }
        // Organizamos los números de mayor a menor
        // Creamos un bucle para evaluar el bucle para organizarlos de mayor a menor según el total de números ingresados 
        
        for (int i = 0; i < n; i++) {
        // Declaramos las variables dentro del bucle para que vuelvan a 0 y 1 una vez que se haya ejecutado el siguiente bucle
            int  nu = 0;
            int cont = 1;
        // Creamos un bucle para que se evalúen todos los números que fueron definidos en el arreglo maxmin según  la cantidad de números ingresados
            for (int j = 0; j < (n-1); j++) {
                // Verificamos si el numero siguiente a la posición 0 es mayor al de la posición 0 y asi sucesivamente mientras la posición j sea menos a la cantidad total de números ingresados menos 1, ademas validamos que cont no sea mayor a la cantidad total de números ingresados
                if (maxMin [cont] > maxMin [j] && cont<= n) {
                    // Almacenamos temporalmente dentro de una variable el numero que estaba en la posición j para asi no perder el valor que estaba en esta posición dentro del arreglo
                    nu = maxMin [j];
                    // Asignamos el valor del arreglo maxmin de la posición j a el de la posición cont de acuerdo a si se cumple la condición
                    maxMin [j] = maxMin [cont];
                    // Reasignamos a la posición cont el valor almacenado en la variable nu
                    maxMin [cont] = nu;
                
                }
            cont = cont + 1;   
            }
        }
        // Imprimimos los números organizados de mayor a menor
        System.out.print("\nlos números de mayor a menor son: ");
        for (int dato1 : maxMin) {
            System.out.print(dato1 + " ");
        }
        // Limpiamos buffer
        entrada.close();
    }
    
}