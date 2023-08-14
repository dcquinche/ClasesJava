package Clase10.genericos.ejemplo1;

public class Animal {
    private String nombre;
    private String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre= " + this.nombre +
                ", raza= " + this.raza +
                "}";
    }
}
