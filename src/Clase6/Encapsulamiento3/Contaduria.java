package Clase6.Encapsulamiento3;

import Clase6.Encapsulamiento3.Estudiante;

public class Contaduria {
    public Contaduria(){};

    public float obtenerCostoMatricula(float costroMatricula, Estudiante estudiante, int semestre){
        float descuento = this.calcularPorcentajeCobro(semestre, estudiante);
        return costroMatricula * descuento;
    }

    private float calcularPorcentajeCobro(int semestre, Estudiante estudiante){
        if(semestre < 2 || estudiante.getPromedio() < 4){
            return 1;
        }
        return 0.75F;
    }
}
