package Clase4;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void run(){
        ArrayList<Integer> listaEnteros = new ArrayList();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);

        for (Integer entero: listaEnteros){
            System.out.println("entero = " + entero);
        }

        listaEnteros.set(1, 12); // cambiar el valor en esa posición
        System.out.println("listaEnteros = " + listaEnteros);
        listaEnteros.remove(0); // remover elemento de esa posición
        System.out.println("listaEnteros = " + listaEnteros);
    }
}
