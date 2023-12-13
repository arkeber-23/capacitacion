package org.proyecto.services;

import java.util.List;

import java.util.stream.Collectors;

import org.proyecto.dto.ProcesoDTO;
import org.proyecto.mappers.IProcesoMapper;
import org.proyecto.respository.ProcesoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcesoService {

    @Autowired
    private ProcesoRespository procesoRepository;

    @Autowired
    private IProcesoMapper procesoMapper;

    public List<ProcesoDTO> getAll() {
        /*
         * return procesoRepository.findAll()
         * .stream()
         * .map(proceso -> new ProcesoDTO(proceso.getIdProceso(),
         * proceso.getDescripcion()))
         * .collect(Collectors.toList());
         */
        return procesoMapper.toProcesoDTOList(procesoRepository.findAll());
    }

}
