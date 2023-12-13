package org.proyecto.resource;

import org.proyecto.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaResource {
    
    @Autowired
    private PersonaService personaService;


    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(personaService.getAll(), HttpStatus.OK);
    }


}
