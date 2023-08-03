package Clase4;

import java.util.Deque;
import java.util.LinkedList;

public class PilasDemo {
    // LIFO (Last In, First Out)
    public static void run(){
        Deque<Integer> pila = new LinkedList<>();
        pila.push(10); // agrega elementos
        pila.push(11);
        pila.push(21);
        System.out.println("pila = " + pila); // salen como [21, 11, 10]
        
        pila.pop(); // elimina el último en entrar
        System.out.println("pila = " + pila);
    }
}
