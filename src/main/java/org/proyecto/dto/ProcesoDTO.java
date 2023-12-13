package org.proyecto.dto;

public class ProcesoDTO {

    private Long id_proceso;
    private String descripcion;

    public ProcesoDTO() {
    }

    public ProcesoDTO(Long id_proceso, String descripcion) {
        this.id_proceso = id_proceso;
        this.descripcion = descripcion;
    }

    public Long getIdProceso() {
        return this.id_proceso;
    }

    public void setIdProceso(Long id_proceso) {
        this.id_proceso = id_proceso;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
