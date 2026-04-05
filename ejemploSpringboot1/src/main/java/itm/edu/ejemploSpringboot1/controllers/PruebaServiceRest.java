package itm.edu.ejemploSpringboot1.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import itm.edu.ejemploSpringboot1.ejemplosPasados.ejemplosPOO.Pony;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primerejemplo")
public class PruebaServiceRest {

    @GetMapping("/ping")
    public String ping() {
        return "pong, responde mi rest";
    }

    @GetMapping("/pony")
    public Pony getPony() {
        return new Pony("Albeiro");
    }

    // Crear
    @PostMapping("/crearpony")
    public ResponseEntity<String> crearPony(@RequestBody Pony pony) {
        System.out.println("Datos recibidos " + pony.getNombre() + " tiene " + pony.getNumeroPatas() + " patas"); //Imprime en consola
        return new ResponseEntity<>("Se creo el pony " + pony.getNombre(), HttpStatus.CREATED); //Imprime en API
    }

        @Operation(
                tags = {"Pruebas"},
                summary = "Permite hacer un put con RequestBody",
                description = "Permite hacer un put con RequestBody",
                responses = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "Se ejecuta bien el servicio",
                                content = {
                                        @Content(
                                                mediaType = MediaType.APPLICATION_JSON_VALUE,
                                                schema = @Schema(implementation = String.class))
                                })
                })

    // Actualizar
    @PutMapping("/actualizarpony")
    public ResponseEntity<String> actualizarPony(@RequestBody Pony pony) { //Reques Body
        System.out.println("Datos recibidos " + pony.getNombre() + " tiene " + pony.getNumeroPatas() + " patas");
        return new ResponseEntity<>("Se actualizo el pony " + pony.getNombre(), HttpStatus.ACCEPTED);
    }

    // Eliminar
    @DeleteMapping("/eliminarpony")
    public ResponseEntity<String> eliminarPony(@RequestParam int idPony) {   // Request Param
        return new ResponseEntity<>("Se elimino el pony de pk " + idPony, HttpStatus.OK);
    }

    @Operation(
            tags = {"Pruebas"},
            summary = "Permite hacer un post con parametros",
            description = "Prueba de metodo post con RequestParam y RequestBody",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "Se ejecuta bien el servicio",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = Pony.class))
                            })
            })

    @PostMapping("/crearponyparametros")
    public ResponseEntity<Pony> crearPony(@RequestBody Pony pony, @RequestParam int idPony, @RequestParam String informacionAdicional) { // Mix Request (Param / Body)
        System.out.println("Datos recibidos " + pony.getNombre() + " tiene " + pony.getNumeroPatas()
                + " patas" + " id para el pony " + idPony + " adicional " + informacionAdicional); //Imprime en consola
        return new ResponseEntity<>(pony, HttpStatus.CREATED); //Imprime en API
    }
}

// http://localhost:8090/ejemplo1/swagger-ui/index.html#/
