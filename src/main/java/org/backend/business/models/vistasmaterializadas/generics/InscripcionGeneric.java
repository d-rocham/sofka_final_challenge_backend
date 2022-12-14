package org.backend.business.models.vistasmaterializadas.generics;

import java.util.Set;

public class InscripcionGeneric {
    private String cursoID;
    private Float promedio;
    private Float avance;
    private Set<EstadoTareaGeneric> estadosTarea;

    public InscripcionGeneric(String cursoID, Float promedio, Float avance, Set<EstadoTareaGeneric> estadosTarea) {
        this.cursoID = cursoID;
        this.promedio = promedio;
        this.avance = avance;
        this.estadosTarea = estadosTarea;
    }

    public String getCursoID() {
        return cursoID;
    }

    public void setCursoID(String cursoID) {
        this.cursoID = cursoID;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public Float getAvance() {
        return avance;
    }

    public void setAvance(Float avance) {
        this.avance = avance;
    }

    public Set<EstadoTareaGeneric> getEstadosTarea() {
        return estadosTarea;
    }

    public void setEstadosTarea(Set<EstadoTareaGeneric> estadosTarea) {
        this.estadosTarea = estadosTarea;
    }
}
