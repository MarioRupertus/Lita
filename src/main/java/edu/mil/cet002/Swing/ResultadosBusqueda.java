package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
//import java.util.Iterator;
import java.util.List;
//import javax.swing.DefaultListModel;
//import javax.swing.JTextField;
//import javax.swing.table.TableModel;

public class ResultadosBusqueda extends javax.swing.JFrame {

    // DefaultListModel<String> dlm = new DefaultListModel<>();
    List<Producto> resultado;

    PanelBusqueda panelBusqueda;

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
        this.setLocationRelativeTo(null); //Centrado en pantalla

    }

    public ResultadosBusqueda(List<Producto> resultado, PanelBusqueda ppanelBusqueda) {
        this();
        this.resultado = resultado;
        this.panelBusqueda = ppanelBusqueda;
        //iniciar();
        cargarDatosATabla();
        if (panelBusqueda.getCampo().getText().equals("")) {
            b = " ' ' ";
        } else {
            b = " '" + panelBusqueda.getCampo().getText() + "' ";
        }

        textoProducto.setText(b);
        tablaProductos.setRowSelectionInterval(0, 0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

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

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Comercio", "Calificación", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(1).setMinWidth(200);
            tablaProductos.getColumnModel().getColumn(1).setMaxWidth(300);
            tablaProductos.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaProductos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNuevaBusqueda)
                .addGap(374, 374, 374))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoProducto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(botonAgregarCarro)
                                .addGap(18, 18, 18)
                                .addComponent(botonIrCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(botonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInfo)
                    .addComponent(botonAgregarCarro)
                    .addComponent(botonIrCarrito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed

        //Comercio c = new Comercio();
        if (!resultado.isEmpty() & !(tablaProductos.getSelectedRow() >= resultado.size())) {
            Producto p = resultado.get(tablaProductos.getSelectedRow());
            InfoComercio a = new InfoComercio(p.getComercio(), this);
            a.setVisible(true);
            this.setVisible(false);
        }
        //podríamos agregar else con ventana con texto "no se puede realizar esta acción"
        //igual este if soluciona que no reviente cuando no trajo ningún resultado
    }//GEN-LAST:event_botonInfoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCarroActionPerformed
        if (!resultado.isEmpty() & !(tablaProductos.getSelectedRow() >= resultado.size())) {
            Producto producto = resultado.get(tablaProductos.getSelectedRow());
            Servicios.getInstance().agregarProductoCarro(panelBusqueda.getCarro(), producto);
        }
    }//GEN-LAST:event_botonAgregarCarroActionPerformed

    private void botonIrCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrCarritoActionPerformed
        Carro c = new Carro(panelBusqueda.getCarro(), this);
        c.setVisible(true);
    }//GEN-LAST:event_botonIrCarritoActionPerformed

    private void botonNuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaBusquedaActionPerformed
        panelBusqueda.campoBusqueda.setText(null);
        panelBusqueda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonNuevaBusquedaActionPerformed

    private void comboOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenActionPerformed
        int a = comboOrden.getSelectedIndex();
        String criterio = null;
        String orden = null;
        switch (a) {
            case 0:
                criterio = "precio";
                orden = "ASC";
                break;
            case 1:
                criterio = "precio";
                orden = "DESC";
                break;
            case 2:
                criterio = "puntuacion";
                orden = "ASC";
                break;
            case 3:
                criterio = "puntuacion";
                orden = "DESC";
                break;
        }
        int j = -1;
        resultado = Servicios.getInstance().buscarProducto(panelBusqueda.campoBusqueda.getText(),
                panelBusqueda.horario, criterio, orden);
        cargarDatosATabla();
//        dlm.removeAllElements();
//        for (int i = 0; i < resultado.size(); i++) {
//            dlm.addElement(resultado.get(i).getNombre());
//        }

        //listaProductos.setModel(dlm);
    }//GEN-LAST:event_comboOrdenActionPerformed

    private void textoResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoResultadosActionPerformed
//    private void iniciar() {
//        for (int i = 0; i < resultado.size(); i++) {
//            dlm.addElement(resultado.get(i).getNombre());
//        }
//        //listaProductos.setModel(dlm);
//        // = Servicios.getInstance().crearCarrito();
//
//    }

    private void cargarDatosATabla() {

        for (int i = 0; i < resultado.size(); i++) {
            if (i < 100) {
                tablaProductos.setValueAt(resultado.get(i).getNombre(), i, 0);
                tablaProductos.setValueAt(resultado.get(i).getComercio().getNombre(), i, 1);
                tablaProductos.setValueAt(((resultado.get(i).getComercio().getCalificacionPositiva())
                        - (resultado.get(i).getComercio().getCalificacionNegativa())), i, 2);
                tablaProductos.setValueAt(resultado.get(i).getPrecio(), i, 3);
            }
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCarro;
    private javax.swing.JButton botonInfo;
    private javax.swing.JButton botonIrCarrito;
    private javax.swing.JButton botonNuevaBusqueda;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textoOrdenar;
    private javax.swing.JTextField textoProducto;
    private javax.swing.JTextField textoResultados;
    // End of variables declaration//GEN-END:variables
}
