package Clase5.Poo.Herencia;

public class MedioTerrestre extends MedioTransporte {
    public int cantidadLlantas;
    public MedioTerrestre(float peso, float altura, Piloto piloto, int cantidadLlantas){
        super(peso, altura, piloto); // atributos que trae del padre
        this.cantidadLlantas = cantidadLlantas;
    }

    @Override // para sobreescribir un método del padre
    public void encender(){
        System.out.println("El medio de transporte TERRESTRE arrancó");
    }
    public void rodar(){
        System.out.println("El medio de transporte terrestre está rodando");
    }
}
