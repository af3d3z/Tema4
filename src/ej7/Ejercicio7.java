package ej7;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void imprimirTabla(int temp) {
		int temperature = (int) Math.ceil(temp / 10);
		
		for(int i = 1; i <= 10; i++) {
        	if(i == 1) {
        		System.out.print("0 ºC [");
        	}
        	
        	if(temperature >= i) {
        		System.out.print("*");
        	}else {
        		System.out.print("-");
        	}
        	
        	if(i == 10) {
        		System.out.print("] 100 ºC");
        	}
        }
		
	}
	
    public static void main(String[] args) {
        // guardará la temperatura media de cada mes del año
        int[] tempMedia = new int[12];
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < tempMedia.length+1; i++){
            System.out.print("Ingresa la temperatura media del mes " + (i) + ": ");
            tempMedia[i-1] = sc.nextInt();
        }

        System.out.println("TEMPERATURA MEDIA DEL MES:");
        for(int i = 1; i < 13; i++) {
        	System.out.print("Mes " + i + ": ");
        	imprimirTabla(tempMedia[i-1]);
        	System.out.println();
        }
        
        sc.close();
    }
}
