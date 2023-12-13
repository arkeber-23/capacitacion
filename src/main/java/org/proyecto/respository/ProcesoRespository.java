package org.proyecto.respository;

import org.proyecto.entitys.Proceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcesoRespository  extends JpaRepository<Proceso, Long>{
    
}
