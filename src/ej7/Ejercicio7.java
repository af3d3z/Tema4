package ej7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // guardará la temperatura media de cada mes del año
        int[] tempMedia = new int[12];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < tempMedia.length; i++){
            System.out.print("Ingresa la temperatura media del mes " + i + ":");
            tempMedia[i] = sc.nextInt();
        }

        System.out.println("TEMPERATURA MEDIA DEL MES:");
        for(int i = 0; i)
    }
}
