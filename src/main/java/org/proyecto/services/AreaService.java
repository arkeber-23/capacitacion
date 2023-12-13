
package org.proyecto.services;

import java.util.List;


import org.proyecto.dto.AreaDTO;
import org.proyecto.mappers.IAreaMapper;
import org.proyecto.respository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private IAreaMapper areaMapper;

    public List<AreaDTO> getAll() {
        /*
         * return areaRepository.findAll()
         * .stream()
         * .map(area -> new AreaDTO(area.getIdArea(), area.getDescripcion()))
         * .collect(Collectors.toList());
         */

        return areaMapper.toAreaDTOList(areaRepository.findAll());
    }

}
