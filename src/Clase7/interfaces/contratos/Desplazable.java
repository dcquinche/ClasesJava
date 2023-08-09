package Clase7.interfaces.contratos;

public interface Desplazable {
    // En una interfaz todos los métodos son abstractos (son como firmas) y las clases que la implementen deben utilizar todos los métodos propuestos.
    abstract void desplazarse(float metros);
    abstract void frenar();
    abstract String direccion(String direccion);
}
