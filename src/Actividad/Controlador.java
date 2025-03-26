package Actividad;

import Actividad.Vistas.*;
import javax.swing.*;
import java.awt.Frame;

public class Controlador {
    private Vista1 vistaPrincipal;
    
    public Controlador(Vista1 vista) {
        this.vistaPrincipal = vista;
        configurarListeners();
    }
    //comentario x
    private void configurarListeners() {
        // Botón Salir
        vistaPrincipal.Salir.addActionListener(e -> salirAplicacion());
        
        // Configurar botones de vistas
        vistaPrincipal.Vista2.addActionListener(e -> mostrarVista(new Vista2()));
        vistaPrincipal.Vista3.addActionListener(e -> mostrarVista(new Vista3()));
        vistaPrincipal.Vista4.addActionListener(e -> mostrarVista(new Vista4()));
        vistaPrincipal.Vista5.addActionListener(e -> mostrarVista(new Vista5()));
        
        // Vistas modales (AcercaDe, Instructivo, etc.)
        vistaPrincipal.Vista6.addActionListener(e -> 
            mostrarDialogo(new Vista6((Frame)vistaPrincipal, true)));
        
    }
    
    private void mostrarVista(JFrame vista) {
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambio clave aquí
        vista.setLocationRelativeTo(vistaPrincipal);
        vista.setVisible(true);
    }
    
    private void mostrarDialogo(JDialog dialogo) {
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Cambio clave aquí
        dialogo.setLocationRelativeTo(vistaPrincipal);
        dialogo.setVisible(true);
    }
    
    private void salirAplicacion() {
        if (JOptionPane.showConfirmDialog(vistaPrincipal, 
            "¿Desea salir del programa?", "Confirmar", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}