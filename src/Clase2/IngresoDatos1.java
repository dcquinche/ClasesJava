package Clase2;

import java.util.Scanner;

public class IngresoDatos1 {
    public static void main(String[] args){
        // Scanner
        Scanner scanner = new Scanner(System.in); // para pedir datos de entrada
        System.out.println("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt(); // para que lea lo que se ingresó
        System.out.println("numeroEntero = " + numeroEntero);
        scanner.close(); // hay que cerrarlo
    }
}
