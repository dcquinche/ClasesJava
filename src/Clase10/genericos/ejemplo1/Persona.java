package Clase10.genericos.ejemplo1;

public class Persona {
    private String nombre;
    private String numeroCedula;
    private int edad;

    public Persona(String nombre, String numeroCedula, int edad){
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNumeroCedula(){
        return this.numeroCedula;
    }
    public void setNumeroCedula(String numeroCedula){
        this.numeroCedula = numeroCedula;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre= " + this.nombre +
                ", cédula= " + this.numeroCedula +
                ", edad= " + this.edad +
                "}";
    }
}

