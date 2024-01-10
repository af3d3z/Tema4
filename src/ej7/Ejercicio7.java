package ej7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void imprimirTabla(int temp) {
		int temperature = (int) Math.ceil(temp);
		
		for(int i = 1; i <= 50; i++) {
        	if(i == 1) {
        		System.out.print("\u001B[36m0 ºC [\u001B[0m");
        	}
        	
        	if(temperature >= i) {
        		System.out.print("\u001B[33m*\u001B[0m");
        	}else {
        		System.out.print("-");
        	}
        	
        	if(i == 50) {
        		System.out.print("\u001B[31m] 50 ºC\u001B[0m");
        	}
        }
		
	}
	
    public static void main(String[] args) {
        // guardará la temperatura media de cada mes del año
        int[] tempMedia = new int[12];
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < tempMedia.length+1; i++){
			do{
				System.out.print("Ingresa la temperatura media del mes " + (i) + ": ");
				try{
					tempMedia[i-1] = sc.nextInt();
				}catch(InputMismatchException e) {
					System.err.println("Dato incorrecto. Introduce un número real entre 0 y 50.");
					sc.nextLine();
				}
			}while(!(tempMedia[i-1] >= 0 && tempMedia[i-1] <= 50));
        }

        System.out.println("TEMPERATURA MEDIA DEL MES:");
        for(int i = 1; i < 13; i++) {
        	System.out.print("Mes " + String.format("%02d", i) + ": ");
        	imprimirTabla(tempMedia[i-1]);
        	System.out.println();
        }
        
        sc.close();
    }
}
