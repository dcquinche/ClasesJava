package Clase5.Poo.Herencia;

public class MedioTransporte {
    public float peso;
    public float altura;
    public Piloto piloto;

    public MedioTransporte(float peso, float altura, Piloto piloto){
        this.peso = peso;
        this.altura = altura;
        this.piloto = piloto;
    }

    public void encender(){
        System.out.println("El medio de transporte arrancó");
    }
    // sobrecarga: dependiendo de los parámetros necesarios Java sabe que método utilizar asi tengan en mismo nombre
    public void encender(String clave){
        System.out.println("El medio de transporte arrancó con clave");
    }

    public void apagar(){
        System.out.println("El medio de transporte se apagó");
    }
}
