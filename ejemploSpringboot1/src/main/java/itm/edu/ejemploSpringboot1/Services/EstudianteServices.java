package itm.edu.ejemploSpringboot1.Services;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;
import itm.edu.ejemploSpringboot1.RepositoriesSQL.EstudianteRepositoryInterface;
import itm.edu.ejemploSpringboot1.RepositoriesSQL.EstudianteRepositorySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServices implements EstudianteServicesInterface {
    //forma de inyectar dependencias desde el constructor
    private final EstudianteRepositoryInterface repositorySQL;

    public EstudianteServices(EstudianteRepositorySQL repositorySQL) {
        this.repositorySQL = repositorySQL;
    }

    public List<Estudiante> getEstudiantes(){
        return repositorySQL.getEstudiantes();
    }

    public Estudiante insertarEstudiante(Estudiante estudiante){
        return repositorySQL.insertarEstudiante(estudiante);
    }
}