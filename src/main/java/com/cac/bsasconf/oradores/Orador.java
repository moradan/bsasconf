/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.bsasconf.oradores;

/**
 *
 * @author Moradan
 */
public class Orador {
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String detalles;
    private final String fechaAlta;

    public Orador(int id, String nombre, String apellido, String detalles, String fecha_alta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.detalles = detalles;
        this.fechaAlta = fecha_alta;
    }
    
    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public int getId() {
        return id;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }   
}
