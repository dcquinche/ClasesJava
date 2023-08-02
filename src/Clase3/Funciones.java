package Clase3;

public class Funciones { // Se están importando y utilizando en Main
    public static void suma(int a, int b){
        int suma = a + b;
        System.out.println("Resultado suma: " + suma);
    }
    public static int resta(int a, int b){ // esta no es void, si devuelve algo
        return a - b;
    }
}
