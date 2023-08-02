package Clase3;

public class StringDemo {
    public static void run(){
        String mensaje = "Hola";
        String nombre = "Diana";
        int edad = 25;

        // Concatenación
        String concat = mensaje + " " + nombre;
        System.out.println("Concatenación = " + concat);
        System.out.println("Concatenación 2 = " + mensaje.concat(nombre));

        String concatFormat = String.format("Mi nombre es %s y mi edad es %d", nombre, edad);
        System.out.println(concatFormat);
    }
}
