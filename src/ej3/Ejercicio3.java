package ej3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // guardará los 10 números ingresados por teclado
        int[] tabla = new int[10];

        // pedimos al usuario tantos números como índices haya
        for(int i = 0; i < tabla.length; i++){
            System.out.println("Ingresa un número:");
            tabla[i] = sc.nextInt();
        }

        // recorremos el array de forma inversa
        for(int i = tabla.length-1; i >= 0; i--) {
            if(i == 0){
                System.out.print(tabla[i] + "]");
            }else if(i == tabla.length -1) {
                System.out.print("[" + tabla[i] + ", ");
            }else{
                System.out.print(tabla[i] + ", ");
            }
        }

        sc.close();
    }
}
