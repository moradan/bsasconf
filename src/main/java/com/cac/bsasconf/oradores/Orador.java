package com.cac.bsasconf.oradores;

import java.io.Serializable;

public class Orador implements Serializable {
    private String id;
    private String nombre;
    private String apellido;
    private String charla;
    private String fechaAlta;

    public Orador() {
    }

    public Orador(String id, String nombre, String apellido, String charla, String fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.charla = charla;
        this.fechaAlta = fechaAlta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCharla() {
        return charla;
    }

    public void setCharla(String charla) {
        this.charla = charla;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
