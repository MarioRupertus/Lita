package edu.mil.cet002.Swing.original;

import edu.mil.cet002.compraslita.Servicios;

/**
 *
 * @author Marina
 */
public class MainSwing {
    
    public MainSwing() {
        Cargando cargando = new Cargando(); // Crea pantalla
        cargando.setVisible(true); // Muestra pantalla
        Servicios.getInstance(); // Conecta con la base
        cargando.setVisible(false); // Oculta pantalla
        new PanelBusqueda().setVisible(true); // Crea y muestra panel de busqueda
    }
    
    public static void main(String[] args) {
        new MainSwing();
    }
    
    
}
