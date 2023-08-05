package Clase6.Encapsulamiento3;

public class Estudiante extends Persona {
    public static int contadorId = 0;
    protected int id;
    String codigo; // si no se le pone nada es default
    private float promedio;
    public Estudiante(String nombre, String numeroCedula, int edad){
        super(nombre, numeroCedula, edad);
        this.id = contadorId++; // con los ++ después de la variable, primero asigna el valor 0 y luego si empieza a aumentar
        // this.id = ++contadorId; en este caso empezaría a aumentar desde la primera variable y, por tanto, el valor iniciaría en 1
        this.codigo = this.getNombre() + this.id;
        this.promedio = 0;
    }

    public float getPromedio(){
        return this.promedio;
    }
    public void setPromedio(float promedio){
        this.promedio = promedio;
    }

    // @Override
    // public String toString(){
    //    return "Estudiante {" +
    //            "Nombre " + this.getNombre() +
    //            "Cédula " + this.getNumeroCedula() +
    //            "Edad " + this.getEdad() +
    //            "Promedio " + this.getPromedio() + "}";
    //}


}
