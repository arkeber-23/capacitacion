package org.proyecto.resource;


import org.proyecto.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areas")
public class AreaResource {

    @Autowired
    private AreaService areaService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(areaService.getAll(), HttpStatus.OK);
    }

}
