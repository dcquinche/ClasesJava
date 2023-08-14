package Clase9.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EjemploFecha {
    public EjemploFecha(){
    }

    /** Verificada */
    public void convertirADate(String stringFecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha;
        try {
            fecha = formato.parse(stringFecha);
            System.out.println(fecha);
        } catch (ParseException e) {
            // El tratamiento que se desee a la excepción
            System.out.println("Se generó un error al momento de parsear la fecha " + e);
        }
    }
    /* No verificada */
    public int mostrarLongitudCadena(String cadena) throws NullPointerException, ArithmeticException {
        try {
            return cadena.length();
        } catch (NullPointerException e) {
            System.out.println("La cadena no puede ser nula: " + e);
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        } finally {
            // se ejecuta siempre sin importar si lanza o no error
            System.out.println("Hola soy el finally");
        }
    }
}
