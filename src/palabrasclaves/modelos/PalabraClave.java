/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrasclaves.modelos;

/**
 *
 * @author estudiante
 */
public class PalabraClave {
    private String nombre;

    //Constructor
    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }

    //Metodos get/set
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    //toString
}
