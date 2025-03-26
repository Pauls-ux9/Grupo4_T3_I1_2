package Actividad;

import Actividad.Vistas.Vista1;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        // Crear la vista principal (Vista1)
        Vista1 vistaPrincipal = new Vista1();
        
        // Configurar el cierre de la aplicación
        vistaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Centrar la ventana principal
        vistaPrincipal.setLocationRelativeTo(null);
        
        // Crear el controlador
        new Controlador(vistaPrincipal);
        
        // Hacer visible la ventana principal
        vistaPrincipal.setVisible(true);
    }
}