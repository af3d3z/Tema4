package ej8;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// aquí se guardarán los 100 enteros
		int[] array = new int[100];
		// aquí se guardará el número elegido por el usuario
		int numUsuario = 0;
		// aquí guardaremos las posiciones de las ocurrencias del número elegido por el usuario
		int[] posiciones = new int[30];
		// aqui guardaremos el numero de ocurrencias
		int ocurrencias = 0;
		Scanner sc = new Scanner(System.in);
		
		// rellenamos el array
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*10);
		}
		
		// pedimos el número al usuario
		System.out.println("Elige un número:");
		try {
			do {
				numUsuario = sc.nextInt();
			}while(!(numUsuario >= 0 && numUsuario < 10));
		}catch(InputMismatchException e){
			System.err.println("Dato inválido.");
			sc.nextLine();
		}
		
		System.out.println("Números aleatorios:");
		for(int i = 0; i < array.length; i++) {
			if(array[i] == numUsuario) {
				posiciones[ocurrencias] = i;
				ocurrencias++;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("El número " + numUsuario + " se encuentra en las siguientes posiciones: ");
		for(int pos: posiciones) {
			System.out.print(pos + " ");
		}
		
		sc.close();
	}

}
