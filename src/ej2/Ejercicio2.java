package ej2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // scanner para recoger los números
        Scanner sc = new Scanner(System.in);
        // tabla que almacena los números
        int[] tabla = new int[5];

        // pedimos al usuario tantos números como posiciones tenga el array
        for(int i = 0; i < tabla.length; i++){
            System.out.println("Ingresa un número:");
            tabla[i] = sc.nextInt();
        }

        for(int i = 0; i < tabla.length; i++) {
            if(i == 0){
                System.out.print("[" + tabla[i] + ", ");
            }else if(i == tabla.length -1) {
                System.out.print(tabla[i] + "]");
            }else{
                System.out.print(tabla[i] + ", ");
            }
        }
    }
}
