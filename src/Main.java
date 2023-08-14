import Clase10.genericos.ejemplo1.Contenedor;
import Clase10.genericos.ejemplo1.Persona;
import Clase10.genericos.ejemplo1.Animal;
import Clase10.genericos.ejemplo2.MiArray;
import Clase7.clasesAbstractas.Circulo;
import Clase7.clasesAbstractas.Rectangulo;
import Clase7.interfaces.implementaciones.transportes.Automovil;
import Clase8.polimorfismo.Gato;
import Clase8.polimorfismo.Perro;
import Clase8.polimorfismo.contratos.IAnimal;

import java.util.ArrayList;

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
        // Circulo circulo1 = new Circulo(10);
        // Rectangulo rectangulo1 = new Rectangulo(10, 20);
        // circulo1.MostrarInfo();
        // rectangulo1.MostrarInfo();

        // INTERFACES
        // Automovil auto1 = new Automovil();
        // auto1.desplazarse(50);
        // Animal animal1 = new Animal();
        // animal1.desplazarse(3);
        // System.out.println(animal1.direccion("derecha"));;
        // animal1.emitirSonido();

        // POLIMORFISMO
        // Es la capacidad que tiene un objeto de ser tratado como uno con una jerarquía superior.

        // Polimorfismo de subtipos -> herencia
        // ArrayList<Animal> animales = new ArrayList<Animal>();

        // El Perro y el Gato se pueden comportar como clase Animal gracias a la herencia.
        // Por eso, con polimorfismo puedo tener diferentes clases en un mismo arraylist,
        // pero se siguen instanciando como lo que son y, por tanto, reconoce la diferencia de los métodos entre perro y gato.

        // Perro perro1 = new Perro("Pinki", "French Poodle");
        // Gato gato1 = new Gato("Michi", "Persa");
        // Animal perro2 = new Perro("Lisy", "Pastor");
        // Animal gato2 = new Gato("Kira", "Persa");
        // animales.add(perro1);
        // animales.add(gato1);
        // animales.add(perro2);
        // animales.add(gato2);

        // for (Animal animal: animales) {
        //    animal.sonido();
        // }

        // Polimorfismo con interfaces
        // ArrayList<IAnimal> animales2 = new ArrayList<>();
        // IAnimal perro3  = new Perro("Iris", "Labrador");
        // IAnimal gato3 = new Gato("Tito", "Persa");
        // animales2.add(perro3);
        // animales2.add(gato3);

        // for (IAnimal animal: animales2){
        //     animal.correr();
        // }

        // EXCEPCIONES
        // ---Verificadas(checked exception)
        // ---No verificadas(unchecked exception - runtime Exception)
        // EjemploUno ejExc1 = new EjemploUno();

        // try {
        // ejExc1.convertirADate("2023-08");
        // } catch (ParseException e) {
        // System.out.println("Se generó un error al momento de parsear la fecha " + e);
        // }

        // System.out.println("Antes");
        // try {
        // ejExc1.mostrarLongitudCadena("");
        // } catch (NullPointerException e) {
        // System.out.println("Error : " + e);
        // }
        // System.out.println("Después");

        // Auto auto1 = new Auto(false);
        // System.out.println("Antes");
        // try {
        // auto1.alquilar();
        // } catch (AutoNoDisponibleException e) {
        // System.out.println("Error: " + e.getMessage());
        // }

        // System.out.println("Después");

        // GENÉRICOS
        // Persona estudiante1 = new Persona("Alberto", "00000000", 25);
         // Animal animal1 = new Animal("Pinki", "Poodle");

        // Contenedor<Persona, Animal> contenedor1 = new Contenedor<>(estudiante1, animal1);
        // System.out.println("Contenido: " + contenedor1.getContenidoT());
        // System.out.println("Contenido: " + contenedor1.getContenidoU());

        // Animal animal2 = new Animal("Juano", "Jack Rusell");
        // Animal animal3 = new Animal("Michi", "Persa");
        // Animal animal4 = new Animal("Pepito", "Bengala");

        // MiArray<Animal> miArray = new MiArray<>();

        // miArray.agregar(animal1);
        // miArray.agregar(animal2);
        // miArray.agregar(animal3);
        // miArray.agregar(animal4);

        // for (Animal animal : miArray) {
        //     System.out.println(animal.getNombre());
        // }

        // VALOR VS REFERENCIA
        // int a = 2;
        // int b = a;
        // int c = 2;

        // b = 5;

        // System.out.println(a);
        // System.out.println(b);
        // Persona persona2 = new Persona("Miguel", "12454515", 26);
        // System.out.println(a == c);

        // Persona persona1 = new Persona("Miguel", "12454515", 26);
        // Persona persona3 = persona1;

        // System.out.println(persona1.getEdad());
        // System.out.println(persona3.getEdad());

        // persona3.setEdad(28);

        // System.out.println(persona1.getEdad());
        // System.out.println(persona3.getEdad());

        // System.out.println(persona1);
        // System.out.println(persona2);
        // System.out.println(persona3);
        // System.out.println(persona1.equals(persona2));
        // System.out.println(persona1.equals(persona3));
    }
}