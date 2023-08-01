package Clase2;

public class Operadores {
    public static void main(String[] args){
        // Clase2.Operadores Lógicos
        // && = and, || = or, ! = lo convierte a lo contrario, investigar tablas de verdad
        boolean esMayor = false;
        boolean esEstudiante = true;

        boolean puedeVotar = esMayor && esEstudiante;
        System.out.println("puedeVotar = " + puedeVotar);
        boolean puedeParticipar = esMayor || esEstudiante;
        System.out.println("puedeParticipar = " + puedeParticipar);

        boolean prueba = (!false || false) && true;
        System.out.println("prueba = " + prueba);

        // Clase2.Operadores de Incremento o Decremento
        int numero = 5;

        // Incrementa o decrementa solo una unidad
        int prefijoNumero = ++numero;
        System.out.println("incrementoPrefijo = " + prefijoNumero);
        System.out.println("decrementoSufijo = " + (--prefijoNumero));

        // Incrementa o decrementa las unidades que se le pongan
        int a = 5;
        a += 4;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);


        int numBase1 = 5;
        int c = ++numBase1;
        System.out.println("c = " + c);
        int numBase2 = 5;
        int b = numBase2++; // este no hace nada
        System.out.println("b = " + b);

    }
}
