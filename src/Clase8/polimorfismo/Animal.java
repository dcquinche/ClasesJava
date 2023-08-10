package Clase8.polimorfismo;

public class Animal {
    private String nombre;
    private String raza;

    public Animal(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    public void sonido(){
        System.out.println("Soy animal y hago sonidos");
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
}
