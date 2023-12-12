package org.proyecto.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona {
    
    @Id
    @Column(name="id_persona")
    private Long idPersona;
    
    
    private String identifacion;
    
    private String nombres;
    
    private String apellidos;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentifacion() {
        return identifacion;
    }

    public void setIdentifacion(String identifacion) {
        this.identifacion = identifacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
