package ej1;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        // creamos un array con 10 índices
        int[] tabla = new int[10];
        Random rand = new Random();

        // iteramos sobre el array asignandole un valor aleatorio de 1-100
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = rand.nextInt(101);
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
