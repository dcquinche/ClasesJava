package Clase7.clasesAbstractas;

public class Circulo extends Forma {
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
