/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

/**
 *
 * @author estudiante
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cargo;
    
    //Constructor
    public Profesor(int dni, String apellidos, String nombres, String clave, String cargo){    
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
        
    }

    //Metodos get/set
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCargo() {
        return cargo;
    }

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Metodos
    public void mostrar() {
        System.out.println(this.verDni());
        System.out.println(this.verApellidos());
        System.out.println(this.verNombres());
        System.out.println(this.verClave());
        System.out.println(this.verCargo());
    }
}
