/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.Servicios;
import edu.mil.cet002.compraslita.Carrito;
import edu.mil.cet002.compraslita.Producto;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ButtonModel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class PanelBusqueda extends javax.swing.JFrame {

    ResultadosBusqueda r = null;
    Carrito carro = new Carrito();
    int horario;

    /**
     * Creates new form PanelBusqueda
     */
    public PanelBusqueda() {
        initComponents();
        inic();
        setdefault();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); //Centrado en pantalla

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
        jLabel1 = new javax.swing.JLabel();
        PanelHorarios = new javax.swing.JPanel();
        horarioNull = new javax.swing.JRadioButton();
        horarioActual = new javax.swing.JRadioButton();
        horarioEspecifico = new javax.swing.JRadioButton();
        horas = new javax.swing.JComboBox<>();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        botonBuscar.setText("Buscar!");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        botonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonBuscarKeyPressed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductoLayout.createSequentialGroup()
                        .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icono)
                            .addComponent(jLabel1)))
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
                        .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(icono))
                        .addGap(39, 39, 39))))
        );

        Horario.add(horarioNull);
        horarioNull.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        horarioNull.setSelected(true);
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

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/logo3.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelHorariosLayout.setVerticalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHorariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelHorariosLayout.createSequentialGroup()
                        .addComponent(horarioNull)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horarioEspecifico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    public void agregarAlCarro(Producto p) {
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

    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasActionPerformed
    private void inic() {
        KeyListen(horarioActual);
        KeyListen(horarioEspecifico);
        KeyListen(horarioNull);
        KeyListen(horas);
        KeyListen(campoBusqueda);
    }

    private void KeyListen(Component o) {
        o.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                //Aqui no funcionara
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Busqueda();
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }

            public void keyReleased(KeyEvent e) {
                //Aqui tambien puedes insertar el codigo
            }
        });
    }
    private void horarioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActualActionPerformed
        horas.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioActualActionPerformed

    private void horarioNullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioNullActionPerformed
        horas.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioNullActionPerformed

    private void botonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonBuscarKeyPressed

    }//GEN-LAST:event_botonBuscarKeyPressed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Busqueda();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Busqueda();
        }
    }//GEN-LAST:event_formKeyPressed

    private void Busqueda() {
        String precio = "precio";
        String ASC = "ASC";

        if (Horario.getSelection() == horarioNull.getModel()) {
            horario = -1;
        } else {
            if (Horario.getSelection() == horarioActual.getModel()) {
                Calendar calendario = new GregorianCalendar();
                horario = calendario.get(Calendar.HOUR_OF_DAY);
            } else {
                horario = horas.getSelectedIndex() + 7;
            }
        }

        r = new ResultadosBusqueda(Servicios.getInstance().
                buscarProducto(campoBusqueda.getText(), horario, precio, ASC), this);
        r.setVisible(true);
        this.setVisible(false);
    }

    public ResultadosBusqueda getFrameResultados() {
        return r;
    }

    public JTextField getCampo() {
        return campoBusqueda;
    }

    /**
     * @param args the command line arguments
     */
// MAIN NO SE UTILZA MAS PORQUE AHORA SE INGRESA POR MAINSWING.JAVA
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PanelBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PanelBusqueda().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Horario;
    private javax.swing.JPanel PanelHorarios;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JButton botonBuscar;
    public javax.swing.JTextField campoBusqueda;
    private javax.swing.JRadioButton horarioActual;
    private javax.swing.JRadioButton horarioEspecifico;
    private javax.swing.JRadioButton horarioNull;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
