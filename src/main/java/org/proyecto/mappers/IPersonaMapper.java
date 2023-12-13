package org.proyecto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.proyecto.dto.PersonaDTO;
import org.proyecto.entitys.Persona;

@Mapper(componentModel = "spring")
public interface IPersonaMapper {
  
    PersonaDTO toPersonaDTO(Persona persona);

    Persona toPersona(PersonaDTO personaDTO);

    List<PersonaDTO> toPersonaDTO(List<Persona> personas);

    List<Persona> toPersonas(List<PersonaDTO> personasDTO);


}
