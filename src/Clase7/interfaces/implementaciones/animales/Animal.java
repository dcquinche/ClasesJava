package Clase7.interfaces.implementaciones.animales;

import Clase7.interfaces.contratos.Desplazable;
import Clase7.interfaces.contratos.EmisorSonido;

public class Animal implements Desplazable, EmisorSonido {
    @Override
    public void desplazarse(float metros){
        System.out.println("Soy un animal y me desplazo " + metros + " metros");
    }
    @Override
    public void frenar(){
        System.out.println("Soy un animal y estoy frenando");
    }
    @Override
    public String direccion(String direccion){
        return "Soy un animal y me dirijo a la " + direccion;
    }

    @Override
    public void emitirSonido(){
        System.out.println("Soy un animal y emito sonidos");
    }
}
