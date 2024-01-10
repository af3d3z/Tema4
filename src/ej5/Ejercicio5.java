package ej5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // almacenará los números introducidos por teclado
        double[] numeros = new double[10];
        // almacena el mayor número
        double mayor = 0;
        // almacena el menor número
        double menor = 0;
        // almacena la suma de todos los números en el array
        double suma = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            // pedimos un número al usurio y lo almacenamos en el array
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextDouble();

            // sumamos el índice al resto
            suma += numeros[i];

            // comprobamos si es menor o mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor || menor == 0) {
                menor = numeros[i];
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
