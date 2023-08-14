package Clase10.genericos.ejemplo1;

public class Contenedor<T, U> {
    // Se puede colocar cualquier letra
    private T contenidoT;
    private U contenidoU;

    public Contenedor(T contenidoT, U contenidoU){
        this.contenidoT = contenidoT;
        this.contenidoU = contenidoU;
    }

    public T getContenidoT() {
        return contenidoT;
    }
    public void setContenidoT(T contenidoT) {
        this.contenidoT = contenidoT;
    }
    public U getContenidoU() {
        return contenidoU;
    }
    public void setContenidoU(U contenidoU) {
        this.contenidoU = contenidoU;
    }
}
