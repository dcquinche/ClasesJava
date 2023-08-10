package Clase8.polimorfismo;

import Clase8.polimorfismo.contratos.IAnimal;

public class Gato extends Animal implements IAnimal {
    public Gato(String nombre, String raza){
        super(nombre, raza);
    }

    @Override
    public void sonido(){
        System.out.println("Soy un gato y hago miauu miauuu");
    }

    @Override
    public void correr() {
        System.out.println("El gato está corriendo");
    }
}
