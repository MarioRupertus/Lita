package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.Servicios;

/**
 *
 * @author Marina
 */
public class MainSwing {
    
    Cargando cargando;

    public MainSwing() {
        cargando = new Cargando();
        cargando.setVisible(true);
        Servicios.getInstance();
        cargando.setVisible(false);
        new PanelBusqueda().setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainSwing();
    }
    
    
}
