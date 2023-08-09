package Clase7.interfaces.implementaciones.transportes;

import Clase7.interfaces.contratos.Desplazable;

public class Automovil implements Desplazable {
    @Override
    public void desplazarse(float metros){
        System.out.println("Soy un automóvil y me desplazo " + metros + " metros");
    }
    @Override
    public void frenar(){
        System.out.println("Soy un automóvil y estoy frenando");
    }

    @Override
    public String direccion(String direccion){
        return "Soy un automóvil y me dirijo a la " + direccion;
    }
}
