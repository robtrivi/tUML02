/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcodeuml;

/**
 *
 * @author marle
 */
public class Foro {
    private String id;
    private String tematica;
    private int numeroComentarios;
    private Curso cursoAsignado;

    public Foro(String id, String tematica, int numeroComentarios, Curso cursoAsignado) {
        this.id = id;
        this.tematica = tematica;
        this.numeroComentarios = numeroComentarios;
        this.cursoAsignado = cursoAsignado;
    }
    
}
