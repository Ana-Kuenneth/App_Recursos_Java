/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import javax.swing.UIManager;
import grupos.vistas.VentanaAMGrupo;
import idiomas.vistas.VentanaAIdioma;
import lugares.vistas.VentanaALugar;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.vistas.VentanaATipo;

public class ControladorPrincipalGUI {
    public static void main(String[] args) {
        asignarLookAndFeel("Nimbus");
        //Grupos
        VentanaAMGrupo ventana = new VentanaAMGrupo(null); //se instancia la ventana
        ventana.setLocationRelativeTo(null); //se centra la ventana
        ventana.setVisible(true); //se hace visible la ventana
        
        //Alumnos
        VentanaAMAlumno ventanaAlumnos = new VentanaAMAlumno(null); //se instancia la ventana
        ventanaAlumnos.setLocationRelativeTo(null); //se centra la ventana
        ventanaAlumnos.setVisible(true); //se hace visible la ventana
        
        //Profesores
        VentanaAMProfesor ventanaProfesores = new VentanaAMProfesor(null); //se instancia la ventana
        ventanaProfesores.setLocationRelativeTo(null); //se centra la ventana
        ventanaProfesores.setVisible(true); //se hace visible la ventana
        
        //Tipos
        VentanaATipo ventanaTipos = new VentanaATipo(null); //se instancia la ventana
        ventanaTipos.setLocationRelativeTo(null); //se centra la ventana
        ventanaTipos.setVisible(true); //se hace visible la ventana
        
        //Lugares
        VentanaALugar ventanaLugares = new VentanaALugar(null); //se instancia la ventana
        ventanaLugares.setLocationRelativeTo(null); //se centra la ventana
        ventanaLugares.setVisible(true); //se hace visible la ventana
        
        //Idiomas
        VentanaAIdioma ventanaIdiomas = new VentanaAIdioma(null); //se instancia la ventana
        ventanaIdiomas.setLocationRelativeTo(null); //se centra la ventana
        ventanaIdiomas.setVisible(true); //se hace visible la ventana
        
        //Palabras claves
        VentanaAPalabraClave ventanaPalabrasClaves = new VentanaAPalabraClave(null); //se instancia la ventana
        ventanaPalabrasClaves.setLocationRelativeTo(null); //se centra la ventana
        ventanaPalabrasClaves.setVisible(true); //se hace visible la ventana
    }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }
    
}
