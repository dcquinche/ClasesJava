package Clase6.Encapsulamiento;

import java.util.ArrayList;

public class ModuloInscripcion {
    ArrayList<Estudiante> estudiantes;

    public ModuloInscripcion(){
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);

        // aunque esta clase no se este extendiendo de Estudiante puede tomar las propiedades de esta porque están public o protected
        System.out.println("El estudiante con el id " + estudiante.id + " fue inscrito correctamente");
    }
}
