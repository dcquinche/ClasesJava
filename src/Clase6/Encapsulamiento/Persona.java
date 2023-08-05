package Clase6.Encapsulamiento;

public class Persona {
    /**
     public --> es accesible desde cualquier clase en cualquier paquete
     protected --> es accesible dentro de la clase, en sus subclases, dentro del paquete aunque no se haga desde una subclase
     default --> solo es accesible desde el mismo paquete
     private --> solo es accesible desde la misma clase
     */

    public String nombre;
    public String numeroCedula;
    public int edad;

    public Persona(String nombre, String numeroCedula, int edad){
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
    }
}
