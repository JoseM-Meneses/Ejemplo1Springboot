package itm.edu.ejemploSpringboot1.controllers;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;
import itm.edu.ejemploSpringboot1.Services.EstudianteServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import itm.edu.ejemploSpringboot1.Services.EstudianteServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiantes")
public class EstudianteController implements EstudianteControllerApi {

    @Autowired
    private EstudianteServices services;

    @Operation(
            tags = {"Estudiantes"},
            summary = "trae la lista de estudiantes desde la base de datos",
            description = "permite consultar los estudiantes y los devuelve como json",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "se ejecuta bien el servicio",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = Estudiante.class))
                            })
            }
    )
    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        return new ResponseEntity<>(services.getEstudiantes(),HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Estudiante> insertarEstudiante(@RequestBody Estudiante estudiante){
        if(ObjectUtils.isEmpty(estudiante) || ObjectUtils.isEmpty(estudiante.getNombres())){
            return new ResponseEntity<>(estudiante, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>( services.insertarEstudiante(estudiante), HttpStatus.ACCEPTED);
    }
}