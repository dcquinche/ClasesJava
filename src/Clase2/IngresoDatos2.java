package Clase2;

import javax.swing.*;

public class IngresoDatos2 {
    public static void main(String[] args){
        // JOptionPane - este siempre va a devolver strings
        String input = JOptionPane.showInputDialog("Ingresa un número entero: ");
        int suma = Integer.parseInt(input) + 2; // parseo, conversión de tipo de variable con objetos
        JOptionPane.showMessageDialog(null, suma);
    }
}
