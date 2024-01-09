package ej4;

public class Ejercicio4 {
    public static void main(String[] args) {
        // array que contiene los números
        int[] array = new int[12];

        // asignación de valores
        array[0] = 39;
        array[1] = -2;
        array[4] = 4;
        array[6] = 14;
        array[8] = 5;
        array[9] = 120;

        for(int i = 0; i < array.length; i++) {
            if(i == 0){
                System.out.print("[" + array[i] + ", ");
            }else if(i == array.length -1) {
                System.out.print(array[i] + "]");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
