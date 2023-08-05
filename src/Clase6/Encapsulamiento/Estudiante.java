package Clase6.Encapsulamiento;

public class Estudiante extends Persona {
    public static int contadorId = 0;
    protected int id;
    String codigo; // si no se le pone nada es default
    public Estudiante(String nombre, String numeroCedula, int edad){
        super(nombre, numeroCedula, edad);
        this.id = contadorId++; // con los ++ después de la variable, primero asigna el valor 0 y luego si empieza a aumentar
        // this.id = ++contadorId; en este caso empezaría a aumentar desde la primera variable y, por tanto, el valor iniciaría en 1
        this.codigo = this.nombre + this.id;
    }
}
