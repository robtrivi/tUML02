/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcodeuml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marle
 */
public class Curso {
    private  String id;
    private String nombre;
    private boolean estadoDisponible;
    
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList();
    private List<Estudiante> estudiantesInscritos = new ArrayList();
    private List<Foro> foros = new ArrayList();
    
    private List<ActividadSumativa> actividadesSumativas = new ArrayList(); 
}
