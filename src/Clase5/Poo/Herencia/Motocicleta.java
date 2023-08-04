package Clase5.Poo.Herencia;

public class Motocicleta extends MedioTerrestre{
    public String marcaCadena;
public Motocicleta(float peso, float altura, Piloto piloto, String marcaCadena) {
    super(peso, altura, piloto, 2); // ponerle por default que todas las motos tengan 2 llantas
    this.marcaCadena = marcaCadena;
}
}
