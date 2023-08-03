package Clase4;

import java.util.LinkedList;
import java.util.Queue;

public class ColasDemo {
    // FIFO (First In, First Out)
    public static void run(){
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1); // agrega elementos
        cola.offer(2);
        cola.offer(3);
        System.out.println("cola = " + cola);

        System.out.println(cola.peek()); // retorna el primer elemento en entrar, pero no le hace nada
        System.out.println("cola = " + cola);
        cola.poll(); // elimina el primer elemento de la cola
        System.out.println("cola = " + cola);

    }
}
