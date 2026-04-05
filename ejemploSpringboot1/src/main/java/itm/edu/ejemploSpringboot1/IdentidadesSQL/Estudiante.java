package itm.edu.ejemploSpringboot1.IdentidadesSQL;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private Integer idEstudiante;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private String celular;
    private String programa;
    private Date fechaIngreso;
    private Date fechaNacimiento;
}
