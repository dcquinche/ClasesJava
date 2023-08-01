package Clase2;

public class EstructurasControl {
    public static void main(String[] args) {
        // Estructuras de control (if, else, else if, switch, for, while, do while, foreach)
        // if, else if, else
        int edad = 18;
        if(edad > 18){
            System.out.println("Es mayor de edad");
        } else if (edad == 18) {
            System.out.println("Tiene exactamente 18 años");
        } else {
            System.out.println("Es menor de edad");
        }

        // Operador Ternario
        String esMayor = (edad > 18) ? "Es mayor de edad" : (edad == 18) ? "Tiene exactamente 18 años" : "Es menor de edad";
        System.out.println("esMayor = " + esMayor);

        // switch (se puede utilizar con short, char e int)
        int dia = 8;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default: // si no cumple ninguno de los casos anteriores
                System.out.println("Es fin de semana");
                break;

        }
    }
}
