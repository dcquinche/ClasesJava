import Clase7.clasesAbstractas.Circulo;
import Clase7.clasesAbstractas.Rectangulo;
import Clase7.interfaces.implementaciones.animales.Animal;
import Clase7.interfaces.implementaciones.transportes.Automovil;

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

        // Piloto piloto1 = new Piloto("Juan", 34);

        // MedioTerrestre medioT = new MedioTerrestre(1250, 2, piloto1, 4);
        // System.out.println("medioT.altura = " + medioT.altura);
        // System.out.println("medioT.peso = " + medioT.peso);
        // System.out.println("medioT.cantidadLlantas = " + medioT.cantidadLlantas);
        // medioT.encender();
        // medioT.apagar();

        // Motocicleta moto1 = new Motocicleta(150,0.75F, piloto1, "AXS");
        // System.out.println("moto1.altura = " + moto1.altura);
        // System.out.println("moto1.peso = " + moto1.peso);
        // System.out.println("moto1.cantidadLlantas = " + moto1.cantidadLlantas);
        // System.out.println("moto1.marcaCadena = " + moto1.marcaCadena);
        // moto1.apagar();
        // moto1.encender();

        // MedioTransporte tranp1 = new MedioTransporte(100, 4, piloto1);
        // tranp1.encender();
        // tranp1.encender("1234");
        // System.out.println("tranp1.piloto.nombre = " + tranp1.piloto.nombre);

        // final int Constante = 10; // el final no deja cambiar o reasignar el valor de la constante

        // --- Encapsulamiento / Encapsulación ---
        // public, protected private, default

        // Persona persona1 = new Persona("Diana", "115282319", 25);
        // System.out.println("persona1 = " + persona1.nombre);

        // Estudiante estudiante1 = new Estudiante("Juan", "43029122", 19);
        // Estudiante estudiante2 = new Estudiante("Marcela", "5934029", 24);
        // Estudiante estudiante3 = new Estudiante("Sandra", "114839200", 23);

        // System.out.println("estudiante1 = " + estudiante1.nombre + " " + estudiante1.numeroCedula + " " + estudiante1.edad);

        // ModuloInscripcion sistemaInscripcion = new ModuloInscripcion();
        // sistemaInscripcion.inscribirEstudiante(estudiante1);
        // sistemaInscripcion.inscribirEstudiante(estudiante2);
        // sistemaInscripcion.inscribirEstudiante(estudiante3);

        // CON ATRIBUTOS PRIVADOS (Encapsulamiento 3)
        // Persona persona2 = new Persona("Carolina", "69042234", 19);
        // System.out.println("persona2.getNombre() = " + persona2.getNombre());
        // System.out.println("persona2.getNumeroCedula() = " + persona2.getNumeroCedula());
        // System.out.println("persona2.getEdad() = " + persona2.getEdad());

        // CLASES ABSTRACTAS
        Circulo circulo1 = new Circulo(10);
        Rectangulo rectangulo1 = new Rectangulo(10, 20);
        circulo1.MostrarInfo();
        rectangulo1.MostrarInfo();

        // INTERFACES
        Automovil auto1 = new Automovil();
        auto1.desplazarse(50);
        Animal animal1 = new Animal();
        animal1.desplazarse(3);
        System.out.println(animal1.direccion("derecha"));;
        animal1.emitirSonido();
    }
    
}