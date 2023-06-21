/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcodeuml;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportad;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    protected PersonalAcademico beneficiario;

    public Incidente(int id, LocalDateTime fecha_reportad, String titulo, String descripcion, List<String> log_actualizaciones, LocalDateTime fecha_cerrado, String tipo, Usuario responsable, PersonalAcademico beneficiario) {
        this.id = id;
        this.fecha_reportad = fecha_reportad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.responsable = responsable;
        this.beneficiario = beneficiario;
    }
    
}
