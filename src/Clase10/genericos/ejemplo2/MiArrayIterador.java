package Clase10.genericos.ejemplo2;

import java.util.Iterator;

public class MiArrayIterador<T> implements Iterator<T> {
    private MiArray<T> miArray;
    private int indiceActual;

    public MiArrayIterador(MiArray<T> miArray){
        this.miArray = miArray;
    }

    @Override
    public boolean hasNext() {
        return indiceActual < miArray.tamano();
    }
    @Override
    public T next() {
        return miArray.obtener(indiceActual++);
    }
}
