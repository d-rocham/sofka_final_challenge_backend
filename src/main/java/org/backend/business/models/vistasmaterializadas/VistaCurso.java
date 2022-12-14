package org.backend.business.models.vistasmaterializadas;

import org.backend.business.models.vistasmaterializadas.generics.TemaGeneric;

import java.util.Set;

public class VistaCurso {
    private String cursoID;
    private String titulo;
    private Set<TemaGeneric> temas;

    public VistaCurso(String cursoID, String titulo, Set<TemaGeneric> temas) {
        this.cursoID = cursoID;
        this.titulo = titulo;
        this.temas = temas;
    }

    public String getCursoID() {
        return cursoID;
    }

    public String getTitulo() {
        return titulo;
    }

    public Set<TemaGeneric> getTemas() {
        return temas;
    }
}
