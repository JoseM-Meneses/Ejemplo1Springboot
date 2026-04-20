package itm.edu.ejemploSpringboot1.controllers;

import itm.edu.ejemploSpringboot1.IdentidadesSQL.Estudiante;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EstudianteControllerApi {
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
    ResponseEntity<List<Estudiante>> getEstudiantes();

    @PostMapping("/nuevo")
    ResponseEntity<Estudiante> insertarEstudiante(@RequestBody Estudiante estudiante);
}
