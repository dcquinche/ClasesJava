package Clase3;

public class EstructurasControl {
    public static void main(String[] args){
        // for
        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        // while
        int contador = 1;
        while (contador <= 5){
            System.out.println("contador = " + contador);
            contador++;
        }

        // do while
        // a diferencia del while, se asegura de ejecutarse mínimo una vez
        int contador2 = 1;
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 <= 5);

        // foreach
        String palabra = "Hola";
        for (char letra: palabra.toCharArray()) {
            System.out.println(letra);
        }

    }
}
