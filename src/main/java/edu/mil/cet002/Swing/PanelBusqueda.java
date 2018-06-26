/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;
import edu.mil.cet002.compraslita.*;

/**
 *
 * @author User
 */
public class PanelBusqueda extends javax.swing.JFrame {
    ResultadosBusqueda r=null;
    Carrito carro;
    
    /**
     * Creates new form PanelBusqueda
     */
    
    public PanelBusqueda() {
        initComponents();
        setdefault();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Horario = new javax.swing.ButtonGroup();
        botonBuscar = new javax.swing.JButton();
        PanelProducto = new javax.swing.JPanel();
        titulo = new javax.swing.JTextField();
        campoBusqueda = new javax.swing.JTextField();
        icono = new javax.swing.JLabel();
        PanelHorarios = new javax.swing.JPanel();
        horarioNull = new javax.swing.JRadioButton();
        horarioActual = new javax.swing.JRadioButton();
        horarioEspecifico = new javax.swing.JRadioButton();
        horas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonBuscar.setText("Buscar!");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        PanelProducto.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        titulo.setEditable(false);
        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titulo.setText("Ingrese el producto que busca:");
        titulo.setBorder(null);
        titulo.setFocusable(false);

        campoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductoLayout.createSequentialGroup()
                        .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono))
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icono)
                        .addGap(39, 39, 39))))
        );

        Horario.add(horarioNull);
        horarioNull.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        horarioNull.setText("Cualquier horario");
        horarioNull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioNullActionPerformed(evt);
            }
        });

        Horario.add(horarioActual);
        horarioActual.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        horarioActual.setText("Horario actual");
        horarioActual.setToolTipText("");
        horarioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActualActionPerformed(evt);
            }
        });

        Horario.add(horarioEspecifico);
        horarioEspecifico.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        horarioEspecifico.setText("Horario especifico");
        horarioEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioEspecificoActionPerformed(evt);
            }
        });

        horas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelHorariosLayout = new javax.swing.GroupLayout(PanelHorarios);
        PanelHorarios.setLayout(PanelHorariosLayout);
        PanelHorariosLayout.setHorizontalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioNull)
                    .addComponent(horarioActual)
                    .addComponent(horarioEspecifico)
                    .addGroup(PanelHorariosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHorariosLayout.setVerticalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horarioNull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horarioActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horarioEspecifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(botonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBuscar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public Carrito getCarro() {
        return carro;
    }

    public void agregarAlCarro(Producto p){
        carro.agregarAlCarrito(p);
    }
    
    private void setdefault() {
        horas.setVisible(false);
    }
    private void campoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBusquedaActionPerformed

    private void horarioEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioEspecificoActionPerformed
        horas.setVisible(true);
   // TODO add your handling code here:
    }//GEN-LAST:event_horarioEspecificoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        r = new ResultadosBusqueda(Servicios.getInstance().buscarProducto(campoBusqueda.getText()), this);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasActionPerformed

    private void horarioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActualActionPerformed
        horas.setVisible(false);
      // TODO add your handling code here:
    }//GEN-LAST:event_horarioActualActionPerformed

    private void horarioNullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioNullActionPerformed
        horas.setVisible(false);
      // TODO add your handling code here:
    }//GEN-LAST:event_horarioNullActionPerformed

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
            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Horario;
    private javax.swing.JPanel PanelHorarios;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JRadioButton horarioActual;
    private javax.swing.JRadioButton horarioEspecifico;
    private javax.swing.JRadioButton horarioNull;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel icono;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
