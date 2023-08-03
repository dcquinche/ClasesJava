import Clase3.ArrayDemo;
import Clase3.Funciones; // se importa la clase o función
import Clase3.MathDemo;
import Clase3.StringDemo;
import Clase4.ArrayListDemo;
import Clase4.ColasDemo;
import Clase4.PilasDemo;
import Clase4.Poo.Animal;

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
        Animal animal1 = new Animal("Lisy", 2, "Blanco", 5.8F);
        System.out.println("animal1.nombre = " + animal1.nombre);
        System.out.println("animal1.edad = " + animal1.edad);
        System.out.println("animal1.color = " + animal1.color);
        System.out.println("animal1.peso = " + animal1.peso);
        animal1.correr();

        Animal animal2 = new Animal("Kira", 12, "Blanco", 4.5F);
        System.out.println("animal2.nombre = " + animal2.nombre);
        System.out.println("animal2.edad = " + animal2.edad);
        System.out.println("animal2.color = " + animal2.color);
        System.out.println("animal2.peso = " + animal2.peso);
        animal2.correr();
    }
}