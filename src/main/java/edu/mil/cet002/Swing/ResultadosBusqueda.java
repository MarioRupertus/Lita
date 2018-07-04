package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

public class ResultadosBusqueda extends javax.swing.JFrame {

    DefaultListModel<String> dlm = new DefaultListModel<>();
    List<Producto> resultado;
    PanelBusqueda p;
    String b;
    // private Carrito carro;

    /**
     * Creates new form NewJFrame
     *
     * @param resultado
     */
    public ResultadosBusqueda() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    public ResultadosBusqueda(List<Producto> resultado, PanelBusqueda p) {
        this();
        this.resultado = resultado;
        this.p = p;
        iniciar();
        b = " '" + p.getCampo().getText() + "' ";
        textoProducto.setText(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoResultados = new javax.swing.JTextField();
        textoProducto = new javax.swing.JTextField();
        textoOrdenar = new javax.swing.JTextField();
        comboOrden = new javax.swing.JComboBox<>();
        botonNuevaBusqueda = new javax.swing.JButton();
        botonIrCarrito = new javax.swing.JButton();
        botonAgregarCarro = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonInfo = new javax.swing.JButton();
        panelItems = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        listaProductos.setModel(dlm);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados de la búsqueda");
        setBackground(new java.awt.Color(51, 51, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        textoResultados.setEditable(false);
        textoResultados.setBackground(new java.awt.Color(234, 234, 234));
        textoResultados.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoResultados.setText("Resultados de la búsqueda:");
        textoResultados.setBorder(null);
        textoResultados.setCaretColor(new java.awt.Color(255, 255, 255));
        textoResultados.setFocusable(false);
        textoResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoResultadosActionPerformed(evt);
            }
        });

        textoProducto.setEditable(false);
        textoProducto.setBackground(new java.awt.Color(234, 234, 234));
        textoProducto.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        textoProducto.setText("\"(búsqueda...)\"");
        textoProducto.setBorder(null);
        textoProducto.setFocusable(false);

        textoOrdenar.setEditable(false);
        textoOrdenar.setBackground(new java.awt.Color(234, 234, 234));
        textoOrdenar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textoOrdenar.setText("Ordenar por:");
        textoOrdenar.setBorder(null);
        textoOrdenar.setFocusable(false);

        comboOrden.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio (Menor a mayor)", "Precio (Mayor a menor)", "Puntuación (Menor a mayor)", "Puntuación (Mayor a menor)" }));
        comboOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenActionPerformed(evt);
            }
        });

        botonNuevaBusqueda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonNuevaBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/buscar png.png"))); // NOI18N
        botonNuevaBusqueda.setText("Nueva Búsqueda");
        botonNuevaBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonNuevaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaBusquedaActionPerformed(evt);
            }
        });

        botonIrCarrito.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonIrCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/carrito png.png"))); // NOI18N
        botonIrCarrito.setText("Ir al carrito");
        botonIrCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIrCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrCarritoActionPerformed(evt);
            }
        });

        botonAgregarCarro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonAgregarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/agregar al carrito.png"))); // NOI18N
        botonAgregarCarro.setText("Agregar producto al carro");
        botonAgregarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCarroActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/salir png.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonInfo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/info.png"))); // NOI18N
        botonInfo.setText("Ver informacion del comercio");
        botonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInfoActionPerformed(evt);
            }
        });

        panelItems.setToolTipText("");

        listaProductos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaProductos.setSelectionBackground(new java.awt.Color(51, 102, 255));
        listaProductos.setVisibleRowCount(5);
        panelItems.setViewportView(listaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoProducto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonNuevaBusqueda))
                            .addComponent(panelItems, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonIrCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botonAgregarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNuevaBusqueda)
                    .addComponent(textoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIrCarrito)
                    .addComponent(botonSalir))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botonInfo)
                        .addGap(28, 28, 28)
                        .addComponent(botonAgregarCarro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelItems.getAccessibleContext().setAccessibleParent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void iniciar() {
        for (int i = 0; i < resultado.size(); i++) {
            dlm.addElement(resultado.get(i).getNombre());
        }
        listaProductos.setModel(dlm);
        // = Servicios.getInstance().crearCarrito();
    }
    private void textoResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoResultadosActionPerformed

    private void botonIrCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrCarritoActionPerformed
        Carro c = new Carro(p.getCarro());
        c.setVisible(true);

    }//GEN-LAST:event_botonIrCarritoActionPerformed

    private void botonNuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaBusquedaActionPerformed
        p.campoBusqueda.setText(null);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonNuevaBusquedaActionPerformed

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed

//        Comercio c = new Comercio();
//        c = resultado.get(listaProductos.getSelectedIndex()).getComercio();
//        InfoComercio iF = new InfoComercio();
//        iF.setVisible(true);
//System.out.println(resultado.get(listaProductos.getSelectedIndex()).getComercio().getNombre());

        InfoComercio a = new InfoComercio(resultado.get(listaProductos.getSelectedIndex()).getComercio());
//                .getNombre(),
//                resultado.get(listaProductos.getSelectedIndex()).getComercio().getUbicacion().getNombre(),
//                resultado.get(listaProductos.getSelectedIndex()).getComercio().getDuenio());
        a.setVisible(true);

    }//GEN-LAST:event_botonInfoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCarroActionPerformed

        Producto producto = null;
        producto = resultado.get(listaProductos.getSelectedIndex());
        Servicios.getInstance().agregarProductoCarro(p.getCarro(), producto);
        //this.setVisible(false);
    }//GEN-LAST:event_botonAgregarCarroActionPerformed

    private void comboOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenActionPerformed
        System.out.println("Si");
        int a = comboOrden.getSelectedIndex();
        String criterio = null;
        String orden = null;
        switch (a) {
            case 0:
                System.out.println("0");
                criterio = "precio";
                orden = "ASC";
                break;
            case 1:
                System.out.println("1");
                criterio = "precio";
                orden = "DESC";
                break;
            case 2:
                System.out.println("2");
                criterio = "puntuacion";
                orden = "ASC";
                break;
            case 3:
                System.out.println("3");
                criterio = "puntuacion";
                orden = "DESC";
                break;
        }
        int j = -1;//si le pasamos acá o en el constructor el horario (que no entiendo de donde lo puedo buscar) quedaría bien. Ahora el horario es 1. Mariela
        resultado = Servicios.getInstance().buscarProducto(p.campoBusqueda.getText(), j, criterio, orden);
        dlm.removeAllElements();
        for (int i = 0; i < resultado.size(); i++) {
            dlm.addElement(resultado.get(i).getNombre());
        }
        listaProductos.setModel(dlm);

    }//GEN-LAST:event_comboOrdenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultadosBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadosBusqueda().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCarro;
    private javax.swing.JButton botonInfo;
    private javax.swing.JButton botonIrCarrito;
    private javax.swing.JButton botonNuevaBusqueda;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listaProductos;
    private javax.swing.JScrollPane panelItems;
    private javax.swing.JTextField textoOrdenar;
    private javax.swing.JTextField textoProducto;
    private javax.swing.JTextField textoResultados;
    // End of variables declaration//GEN-END:variables
}
