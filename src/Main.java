import Clase3.ArrayDemo;
import Clase3.Funciones; // se importa la clase o función
import Clase3.MathDemo;
import Clase3.StringDemo;

public class Main {
    public static void main(String[] args) {
        Funciones.suma(2,5);
        System.out.println("Resultado resta: " + Funciones.resta(9,7));
        MathDemo.run();
        StringDemo.run();
        ArrayDemo.run();
        ArrayDemo.maximo();
    }
}