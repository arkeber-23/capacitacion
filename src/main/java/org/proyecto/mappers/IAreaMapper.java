package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.AreaDTO;
import org.proyecto.entitys.Area;

@Mapper(componentModel = "spring")
public interface IAreaMapper {

     AreaDTO toAreaDTO(Area area);

     Area toArea(AreaDTO areaDTO);

     List<AreaDTO> toAreaDTOList(List<Area> areas);

     List<Area> toAreaList(List<AreaDTO> areaDTOs);
    
}
