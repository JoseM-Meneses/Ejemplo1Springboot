package itm.edu.ejemploSpringboot1.Services;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;

import java.util.List;

public interface EstudianteServicesInterface {
    List<Estudiante> getEstudiantes();
    Estudiante insertarEstudiante(Estudiante estudiante);

}
