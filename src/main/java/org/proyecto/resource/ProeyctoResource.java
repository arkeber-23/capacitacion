package org.proyecto.resource;

import org.proyecto.dto.ProyectoDTO;
import org.proyecto.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/proyectos")
public class ProeyctoResource {

    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(proyectoService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProyectoDTO proyectoDTO) {
        return new ResponseEntity<>(proyectoService.save(proyectoDTO), HttpStatus.CREATED);
    }

}
