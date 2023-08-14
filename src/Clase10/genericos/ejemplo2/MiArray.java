package Clase10.genericos.ejemplo2;

import java.util.ArrayList;
import java.util.Iterator;

public class MiArray<T> implements Iterable<T> {
    private ArrayList<T> elementos;

    public MiArray(){
        elementos = new ArrayList<T>();
    }

    public void agregar(T elemento){
        elementos.add(elemento);
    }
    public T obtener(int indice){
        return elementos.get(indice);
    }

    public int tamano(){
        return elementos.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new MiArrayIterador<>(this);
    }
}
