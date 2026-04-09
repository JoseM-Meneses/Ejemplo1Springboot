package itm.edu.ejemploSpringboot1.RepositoriesSQL;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;

import java.util.List;

public interface EstudianteRepositoryInterface {
    List<Estudiante> getEstudiantes();
    Estudiante insertarEstudiante(Estudiante estudiante);
}
