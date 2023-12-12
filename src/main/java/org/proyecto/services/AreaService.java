
package org.proyecto.services;

import java.util.List;
import org.proyecto.entitys.Area;
import org.proyecto.respository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;
    
    
    public List<Area> getAll(){
        return (List<Area>) areaRepository.findAll();
    }
    
    
}
