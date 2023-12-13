package org.proyecto.services;

import java.util.List;
import org.proyecto.dto.PersonaDTO;
import org.proyecto.mappers.IPersonaMapper;
import org.proyecto.respository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private IPersonaMapper personaMapper;

    public List<PersonaDTO> getAll() {

        /*
         * return personaRepository.findAll()
         * .stream()
         * .map(persona -> new PersonaDTO(persona.getIdPersona(),
         * persona.getIdentificacion(), persona.getNombres(), persona.getApellidos()))
         * .collect(Collectors.toList());
         */

        return personaMapper.toPersonaDTO(personaRepository.findAll());
    }

}
