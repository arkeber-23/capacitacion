package org.proyecto.resource;

import org.proyecto.services.ProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/procesos")
public class ProcesoResource {
    
    @Autowired
    private ProcesoService procesoService;

    @GetMapping
    public ResponseEntity<?> getAll(){
         return new ResponseEntity<>(procesoService.getAll(), HttpStatus.OK);
    }
}
