import Clase3.ArrayDemo;
import Clase3.Funciones; // se importa la clase o función
import Clase3.MathDemo;
import Clase3.StringDemo;
import Clase4.ArrayListDemo;
import Clase4.ColasDemo;
import Clase4.PilasDemo;
import Clase4.Poo.Animal;
import Clase5.Poo.Herencia.MedioTerrestre;
import Clase5.Poo.Herencia.MedioTransporte;
import Clase5.Poo.Herencia.Motocicleta;
import Clase5.Poo.Herencia.Piloto;

public class Main {
    public static void main(String[] args) {
        // Funciones.suma(2,5);
        // System.out.println("Resultado resta: " + Funciones.resta(9,7));
        // MathDemo.run();
        // StringDemo.run();
        // ArrayDemo.run();
        // ArrayDemo.maximo();
        // ArrayListDemo.run();
        // PilasDemo.run();
        // ColasDemo.run();

        // Instancias de la clase Animal
        // Animal animal1 = new Animal("Lisy", 2, "Blanco", 5.8F);
        // System.out.println("animal1.nombre = " + animal1.nombre);
        // System.out.println("animal1.edad = " + animal1.edad);
        // System.out.println("animal1.color = " + animal1.color);
        // System.out.println("animal1.peso = " + animal1.peso);
        // animal1.correr();

        // Animal animal2 = new Animal("Kira", 12, "Blanco", 4.5F);
        // System.out.println("animal2.nombre = " + animal2.nombre);
        // System.out.println("animal2.edad = " + animal2.edad);
        // System.out.println("animal2.color = " + animal2.color);
        // System.out.println("animal2.peso = " + animal2.peso);
        // animal2.correr();

        Piloto piloto1 = new Piloto("Juan", 34);

        MedioTerrestre medioT = new MedioTerrestre(1250, 2, piloto1, 4);
        System.out.println("medioT.altura = " + medioT.altura);
        System.out.println("medioT.peso = " + medioT.peso);
        System.out.println("medioT.cantidadLlantas = " + medioT.cantidadLlantas);
        medioT.encender();
        medioT.apagar();

        Motocicleta moto1 = new Motocicleta(150,0.75F, piloto1, "AXS");
        System.out.println("moto1.altura = " + moto1.altura);
        System.out.println("moto1.peso = " + moto1.peso);
        System.out.println("moto1.cantidadLlantas = " + moto1.cantidadLlantas);
        System.out.println("moto1.marcaCadena = " + moto1.marcaCadena);
        moto1.apagar();
        moto1.encender();

        MedioTransporte tranp1 = new MedioTransporte(100, 4, piloto1);
        tranp1.encender();
        tranp1.encender("1234");
        System.out.println("tranp1.piloto.nombre = " + tranp1.piloto.nombre);
    }
    
}