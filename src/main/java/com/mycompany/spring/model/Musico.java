/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.model;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Musico {
    private String nombre;
    private int canciones;
    private Instrumento instrumento;
    private List<Instrumento> instrumentos;

    
    public Musico(int canciones) {
        
        this.canciones= canciones;
    }
    
    public Musico(int canciones, Instrumento instrumento){
    this.canciones = canciones;
    this.instrumento = instrumento;
    
    }
  
    public Musico() {
             
    }
    public void who(){
        System.out.println("SOY UN MUSICO :D");
    }
    public String getNombre() {
        return nombre;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getInstrumentos(){
        return instrumentos;
    }
    
    public void setInstrumentos(List<Instrumento> instrumentos){
        this.instrumentos = instrumentos;
    }
    
}
