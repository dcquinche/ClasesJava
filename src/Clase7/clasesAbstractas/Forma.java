package Clase7.clasesAbstractas;

abstract public class Forma {
    private String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularArea(); // sin cuerpo

    public void MostrarInfo(){
        System.out.println("Nombre = " + this.nombre);
        System.out.println("Área = " + this.calcularArea());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
