package ej6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // guardará los 8 números enteros
        int[] tabla = new int[8];
        Scanner sc = new Scanner(System.in);

        // pedimos tantos números como posiciones tenga la tabla
        for(int i = 0; i < tabla.length; i++){
            System.out.println("Ingresa un número:");
            tabla[i] = sc.nextInt();
        }

        //mostramos cada índice indicando si es par o impar
        for(double number : tabla) {
            System.out.println(number + " " + (number % 2 == 0 ? "par" : "impar"));
        }
        sc.close();
    }
}
