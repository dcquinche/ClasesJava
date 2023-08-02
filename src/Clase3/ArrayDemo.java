package Clase3;

public class ArrayDemo {
    public static void run(){
        int[] numeros = new int[5]; // crea un arreglo de enteros de 5 elementos, el tamaño inicial no se puede modificar
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // Cambio de sintaxis, pero es lo mismo, solo que de una vez se pasan los valores.
        int[] numeros2 = {1, 2, 3, 4, 5};
        int suma = 0;
        // foreach
        for (int numero: numeros2){
            suma += numero;
        }
        System.out.println("suma = " + suma);
    }

    public static void maximo(){
        int[] numeros = {1, 2, 3, 4, 5};
        int max = numeros[0];

        for (int numero: numeros){
            if(numero > max){
                max = numero;
            }
        }
        System.out.println("Valor Máximo = " + max);
    }
}
