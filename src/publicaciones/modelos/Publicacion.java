/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Profesor;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author anaro
 */
public class Publicacion {
    private LocalDate fechaPublicacion = LocalDate.now();
    private String enlace;
    private String resumen;
    private String titulo;    
    private Idioma idioma;
    private Lugar lugar;
    private Profesor profesor;
    private Tipo tipo;
    private ArrayList<PalabraClave> palabraClave = new ArrayList<>();

    
    //Constructor

    public Publicacion(String enlace, String resumen, String titulo, Idioma idioma, Lugar lugar, Profesor profesor, Tipo tipo) {
        this.enlace = enlace;
        this.resumen = resumen;
        this.titulo = titulo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.profesor = profesor;
        this.tipo = tipo;
    }

    //Metodos get/set
    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Idioma verIdioma() {
        return idioma;
    }

    public void asignarIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Lugar verLugar() {
        return lugar;
    }

    public void asignarLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Profesor verProfesor() {
        return profesor;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Tipo verTipo() {
        return tipo;
    }

    public void asignarTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<PalabraClave> verPalabraClave() {
        return palabraClave;
    }
    
}
