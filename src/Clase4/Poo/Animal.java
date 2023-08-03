package Clase4.Poo;

public class Animal {
    public String nombre;
    public int edad;
    public String color;
    public float peso;

    // Método Constructor - nos va a inicializar todo lo que queramos del animal
    public Animal(String nombre, int edad, String color, float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    public void correr(){
        System.out.println(this.nombre + " está corriendo...");
    }
}
