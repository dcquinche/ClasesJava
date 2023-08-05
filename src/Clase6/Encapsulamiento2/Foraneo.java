package Clase6.Encapsulamiento2;

import Clase6.Encapsulamiento.Estudiante;

public class Foraneo extends Estudiante {
    public Foraneo(String nombre, String numeroCedula, int edad){
        super(nombre, numeroCedula, edad);
    }

    public void testAccesoProtected(){
        System.out.println("this.id = " + this.id);
    }

    public void testAccesoDefault(){
        // System.out.println("this.codigo = " + this.codigo); // saca error porque codigo se dejó como default y no se puede acceder desde otro paquete
    }
}
