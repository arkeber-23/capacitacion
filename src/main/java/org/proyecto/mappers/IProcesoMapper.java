package org.proyecto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.proyecto.dto.ProcesoDTO;
import org.proyecto.entitys.Proceso;


@Mapper(componentModel = "spring")
public interface IProcesoMapper {
    
    ProcesoDTO toProcesoDTO(Proceso proceso);
    
    Proceso toProceso(ProcesoDTO procesoDTO);

    List<ProcesoDTO> toProcesoDTOList(List<Proceso> procesos);

    List<Proceso> toProcesoList(List<ProcesoDTO> procesosDTO);
    


}
