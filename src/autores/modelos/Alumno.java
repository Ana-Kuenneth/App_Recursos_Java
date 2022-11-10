/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;
        
/**
 *
 * @author estudiante
 */
public class Alumno {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cx;
    
    //Constructor
    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cx = cx;
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

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    //Metodos
    public void mostrar(){
        System.out.println(this.verDni());
        System.out.println(this.verApellidos());
        System.out.println(this.verNombres());
        System.out.println(this.verClave());
        System.out.println(this.verCx());
        
    }
    
}
