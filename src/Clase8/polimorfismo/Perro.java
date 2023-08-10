package Clase8.polimorfismo;

import Clase8.polimorfismo.contratos.IAnimal;

public class Perro extends Animal implements IAnimal {
    public Perro(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void sonido(){
        System.out.println("Soy un perro y hago guauu guauuu");
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo");
    }
}
