package org.proyecto.services;

import java.util.List;


import org.proyecto.dto.ProyectoDTO;
import org.proyecto.mappers.IProyectoMapper;
import org.proyecto.respository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired 
    private IProyectoMapper proyectoMapper;

    public List<ProyectoDTO> getAll() {
        return proyectoMapper.toProyectoDTOList(proyectoRepository.findAll());
    }

    public ProyectoDTO save(ProyectoDTO proyectoDTO) {
        return proyectoMapper.toProyectoDTO(proyectoRepository.save(proyectoMapper.toProyecto(proyectoDTO)));
    }
    
    
}

