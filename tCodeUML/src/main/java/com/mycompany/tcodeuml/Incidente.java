/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcodeuml;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected Calendar fecha_reportad;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Calendar fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    protected PersonalAcademico beneficiario;
}
