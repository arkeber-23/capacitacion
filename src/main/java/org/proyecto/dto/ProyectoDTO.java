package org.proyecto.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProyectoDTO {
    
    private Long id_proyecto;
    private String detalle_arrastre;
    private String denominacion;
    private String objetivo;
    private Character estados;
    private BigDecimal costo_proyecto;
    private String descripcion_breve;
    private String tipo;
    private Boolean recurrente;
    private Boolean arrastre;
    private Date fechaInicio;
    private Date fecha_fin;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private String usuario_creacion;
    private String usuario_modificacion;

    private AreaDTO area;
    private PersonaDTO persona;
    private ProcesoDTO proceso;

    public ProyectoDTO() {
    }


    public ProyectoDTO(Long id_proyecto, String detalle_arrastre, String denominacion, String objetivo, Character estados, BigDecimal costo_proyecto, String descripcion_breve, String tipo, Boolean recurrente, Boolean arrastre, Date fechaInicio, Date fecha_fin, Date fecha_creacion, Date fecha_modificacion, String usuario_creacion, String usuario_modificacion, AreaDTO area, PersonaDTO persona, ProcesoDTO proceso) {
        this.id_proyecto = id_proyecto;
        this.detalle_arrastre = detalle_arrastre;
        this.denominacion = denominacion;
        this.objetivo = objetivo;
        this.estados = estados;
        this.costo_proyecto = costo_proyecto;
        this.descripcion_breve = descripcion_breve;
        this.tipo = tipo;
        this.recurrente = recurrente;
        this.arrastre = arrastre;
        this.fechaInicio = fechaInicio;
        this.fecha_fin = fecha_fin;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.usuario_creacion = usuario_creacion;
        this.usuario_modificacion = usuario_modificacion;
        this.area = area;
        this.persona = persona;
        this.proceso = proceso;
    }


    public Long getIdProyecto() {
        return this.id_proyecto;
    }

    public void setIdProyecto(Long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getDetalleArrastre() {
        return this.detalle_arrastre;
    }

    public void setDetalleArrastre(String detalle_arrastre) {
        this.detalle_arrastre = detalle_arrastre;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Character getEstados() {
        return this.estados;
    }

    public void setEstados(Character estados) {
        this.estados = estados;
    }

    public BigDecimal getCostoProyecto() {
        return this.costo_proyecto;
    }

    public void setCostoProyecto(BigDecimal costo_proyecto) {
        this.costo_proyecto = costo_proyecto;
    }

    public String getDescripcionBreve() {
        return this.descripcion_breve;
    }

    public void setDescripcionBreve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean isRecurrente() {
        return this.recurrente;
    }

    public Boolean getRecurrente() {
        return this.recurrente;
    }

    public void setRecurrente(Boolean recurrente) {
        this.recurrente = recurrente;
    }

    public Boolean isArrastre() {
        return this.arrastre;
    }

    public Boolean getArrastre() {
        return this.arrastre;
    }

    public void setArrastre(Boolean arrastre) {
        this.arrastre = arrastre;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fecha_fin;
    }

    public void setFechaFin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Date getFechaCreacion() {
        return this.fecha_creacion;
    }

    public void setFechaCreacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFechaModificacion() {
        return this.fecha_modificacion;
    }

    public void setFechaModificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getUsuarioCreacion() {
        return this.usuario_creacion;
    }

    public void setUsuarioCreacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public String getUsuarioModificacion() {
        return this.usuario_modificacion;
    }

    public void setUsuarioModificacion(String usuario_modificacion) {
        this.usuario_modificacion = usuario_modificacion;
    }

    public AreaDTO getArea() {
        return this.area;
    }

    public void setArea(AreaDTO area) {
        this.area = area;
    }

    public PersonaDTO getPersona() {
        return this.persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    public ProcesoDTO getProceso() {
        return this.proceso;
    }

    public void setProceso(ProcesoDTO proceso) {
        this.proceso = proceso;
    }



}
