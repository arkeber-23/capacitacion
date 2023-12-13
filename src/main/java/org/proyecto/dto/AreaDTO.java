package org.proyecto.dto;

public class AreaDTO  {

    private Long id_area;
    private String descripcion;

    public AreaDTO() {
    }

    public AreaDTO(Long id_area, String descripcion) {
        this.id_area = id_area;
        this.descripcion = descripcion;
    }

    public Long getIdArea() {
        return this.id_area;
    }

    public void setIdArea(Long idArea) {
        this.id_area = idArea;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
