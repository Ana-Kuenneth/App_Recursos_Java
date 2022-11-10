/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
     
        //Creación de objetos
        Alumno alumno1 = new Alumno(1, "Perez", "Ana", "clave", "123");
        Alumno alumno2 = new Alumno(2, "Perez", "Beatriz", "clave", "123");
        Alumno alumno3 = new Alumno(3, "Perez", "Carolina", "clave", "123");
        Alumno alumno4 = new Alumno(4, "Perez", "Diana", "clave", "123");
        Alumno alumno5 = new Alumno(5, "Perez", "Esther", "clave", "123");
        
        Profesor profesor1 = new Profesor(1, "Sanchez", "Fernanda", "clave", "123");
        Profesor profesor2 = new Profesor(2, "Sanchez", "Gabriela", "clave", "123");
        Profesor profesor3 = new Profesor(3, "Sanchez", "Helena", "clave", "123");
        Profesor profesor4 = new Profesor(4, "Sanchez", "Irina", "clave", "123");
        Profesor profesor5 = new Profesor(5, "Sanchez", "Josefina", "clave", "123");
        
        Grupo grupo1 = new Grupo("Grupo1","DescripcionG1");
        Grupo grupo2 = new Grupo("Grupo2","DescripcionG2");
        Grupo grupo3 = new Grupo("Grupo3","DescripcionG3");
        Grupo grupo4 = new Grupo("Grupo4","DescripcionG4");
        Grupo grupo5 = new Grupo("Grupo5","DescripcionG5");
        
        Idioma idioma1 = new Idioma("Español");
        Idioma idioma2 = new Idioma("Inglés");
        Idioma idioma3 = new Idioma("Portugués");
        Idioma idioma4 = new Idioma("Alemán");
        Idioma idioma5 = new Idioma("Latín");
        
        Lugar lugar1 = new Lugar("Lugar1");
        Lugar lugar2 = new Lugar("Lugar2");
        Lugar lugar3 = new Lugar("Lugar3");
        Lugar lugar4 = new Lugar("Lugar4");
        Lugar lugar5 = new Lugar("Lugar5");
        
        PalabraClave palabraClave1 = new PalabraClave("Palabra_clave1");
        PalabraClave palabraClave2 = new PalabraClave("Palabra_clave2");
        PalabraClave palabraClave3 = new PalabraClave("Palabra_clave3");
        PalabraClave palabraClave4 = new PalabraClave("Palabra_clave4");
        PalabraClave palabraClave5 = new PalabraClave("Palabra_clave5");
        
        Tipo tipo1 = new Tipo("Tipo1");
        Tipo tipo2 = new Tipo("Tipo2");
        Tipo tipo3 = new Tipo("Tipo3");
        Tipo tipo4 = new Tipo("Tipo4");
        Tipo tipo5 = new Tipo("Tipo5");
        
        //Guardar objetos
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        profesores.add(profesor4);
        profesores.add(profesor5);
        
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
        grupos.add(grupo5);
        
        idiomas.add(idioma1);
        idiomas.add(idioma2);
        idiomas.add(idioma3);
        idiomas.add(idioma4);
        idiomas.add(idioma5);
        
        lugares.add(lugar1);
        lugares.add(lugar2);
        lugares.add(lugar3);
        lugares.add(lugar4);
        lugares.add(lugar5);
        
        palabrasClaves.add(palabraClave1);
        palabrasClaves.add(palabraClave2);
        palabrasClaves.add(palabraClave3);
        palabrasClaves.add(palabraClave4);
        palabrasClaves.add(palabraClave5);
        
        tipos.add(tipo1);
        tipos.add(tipo2);
        tipos.add(tipo3);
        tipos.add(tipo4);
        tipos.add(tipo5);
        
        //Mostrar ArrayLists
        for(Alumno alumno : alumnos){
            alumno.mostrar();
        }
        
        for(Profesor profesor : profesores){
            profesor.mostrar();
        }
        
        for(Grupo grupo : grupos){
            grupo.mostrar();
        }
        
        for(Idioma idioma : idiomas){
            idioma.mostrar();
        }
        
        for(Lugar lugar : lugares){
            lugar.mostrar();
        }
        
        for(PalabraClave palabraC : palabrasClaves){
            palabraC.mostrar();
        }
        
        for(Tipo tipo : tipos){
            tipo.mostrar();
        }
    }
}
