package itm.edu.ejemploSpringboot1.RepositoriesSQL;

import org.springframework.stereotype.Service;

@Service
public class EstudianteRepositoryHelper {
    public String listarEstudiantes(){
        return " Select idEstudiante, nombres, apellidos, cedula, celular, email, direccion, programa, fecha_nacimiento, fecha_ingreso from estudiante ";
    }

    public String insertarEstudiante(){
        return " insert into estudiante (idEstudiante, nombres, apellidos, cedula, email, celular) values (?, ?, ?, ?, ?, ?) ";
    }
}