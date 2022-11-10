/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupos.modelos;

/**
 *
 * @author estudiante
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    
    //Constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Metodos get/set
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Metodos
    public void mostrar(){
        System.out.println(this.verNombre());
        System.out.println(this.verDescripcion());
        
    }
}
