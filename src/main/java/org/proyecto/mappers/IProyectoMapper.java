package org.proyecto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.proyecto.dto.ProyectoDTO;
import org.proyecto.entitys.Proyecto;

@Mapper(componentModel = "spring", uses={IAreaMapper.class, IProcesoMapper.class, IPersonaMapper.class})
public interface IProyectoMapper {

    ProyectoDTO toProyectoDTO(Proyecto proyecto);
    
    Proyecto toProyecto(ProyectoDTO proyectoDTO);
    
    List<Proyecto> toProyectoList(List<ProyectoDTO> proyectosDTO);
    
    List<ProyectoDTO> toProyectoDTOList(List<Proyecto> proyectos);
    
}
