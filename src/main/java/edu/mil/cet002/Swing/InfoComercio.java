package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
import javax.swing.DefaultListModel;

public class InfoComercio extends javax.swing.JFrame {

    ResultadosBusqueda r;
    Comercio c;
    Calificacion ca;
    private DefaultListModel<String> dlm = new DefaultListModel<>();

    public InfoComercio(Comercio c, ResultadosBusqueda r) {
        initComponents();
        this.r = r;
        this.c = c;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        r.setVisible(false);
        this.r.setVisible(false);
        nombreComercio.setText(c.getNombre());
        textoHorario.setText("Horario: De " + c.getHorarioApertura() + " a " + c.getHorarioCierre());
        textoDueño.setText(c.getDuenio());
        textoUbicacion.setText("Dirección: " + c.getUbicacion().getNombre());
        textoCalifPosit.setText("Calificaciones Positivas: " + String.valueOf(c.getCalificacionPositiva()));
        textoCalifNegat.setText("Calificaciones Negativas: " + String.valueOf(c.getCalificacionNegativa()));
        jPanel2.setVisible(false);
        this.setLocationRelativeTo(null); //Centrado en pantalla
    }

    public InfoComercio(Comercio c, Calificacion ca) {
        initComponents();
        this.c = c;
        this.ca = ca;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        nombreComercio.setText(c.getNombre());
        textoHorario.setText("Horario: De " + c.getHorarioApertura() + " a " + c.getHorarioCierre());
        textoDueño.setText(c.getDuenio());
        textoUbicacion.setText("Dirección: " + c.getUbicacion().getNombre());
        textoCalifPosit.setText("Calificaciones Positivas: " + String.valueOf(c.getCalificacionPositiva()));
        textoCalifNegat.setText("Calificaciones Negativas: " + String.valueOf(c.getCalificacionNegativa()));
        this.setLocationRelativeTo(null); //Centrado en pantalla
    }

    public InfoComercio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calificaciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombreComercio = new javax.swing.JTextField();
        textoUbicacion = new javax.swing.JTextField();
        textoDueño = new javax.swing.JTextField();
        textoHorario = new javax.swing.JTextField();
        textoCalifPosit = new javax.swing.JTextField();
        textoCalifNegat = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textoCalificacion = new javax.swing.JTextField();
        botonPositiva = new javax.swing.JRadioButton();
        botonNegativa = new javax.swing.JRadioButton();
        botonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombreComercio.setEditable(false);
        nombreComercio.setBackground(new java.awt.Color(255, 255, 255));
        nombreComercio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nombreComercio.setText("Nombre del Comercio");
        nombreComercio.setBorder(null);
        nombreComercio.setFocusable(false);
        nombreComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreComercioActionPerformed(evt);
            }
        });

        textoUbicacion.setEditable(false);
        textoUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        textoUbicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoUbicacion.setText("Ubicacion");
        textoUbicacion.setBorder(null);
        textoUbicacion.setFocusable(false);

        textoDueño.setEditable(false);
        textoDueño.setBackground(new java.awt.Color(255, 255, 255));
        textoDueño.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoDueño.setText("Dueño");
        textoDueño.setBorder(null);
        textoDueño.setFocusable(false);

        textoHorario.setEditable(false);
        textoHorario.setBackground(new java.awt.Color(255, 255, 255));
        textoHorario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoHorario.setText("Horario");
        textoHorario.setBorder(null);
        textoHorario.setFocusable(false);
        textoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoHorarioActionPerformed(evt);
            }
        });

        textoCalifPosit.setEditable(false);
        textoCalifPosit.setBackground(new java.awt.Color(255, 255, 255));
        textoCalifPosit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCalifPosit.setText("Calificaciones Positivas: ##");
        textoCalifPosit.setBorder(null);
        textoCalifPosit.setFocusable(false);

        textoCalifNegat.setEditable(false);
        textoCalifNegat.setBackground(new java.awt.Color(255, 255, 255));
        textoCalifNegat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCalifNegat.setText("Calificaciones Negativas: ##");
        textoCalifNegat.setBorder(null);
        textoCalifNegat.setFocusable(false);

        botonVolver.setLabel("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textoCalificacion.setEditable(false);
        textoCalificacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCalificacion.setText("Calificacion:");
        textoCalificacion.setBorder(null);

        calificaciones.add(botonPositiva);
        botonPositiva.setSelected(true);
        botonPositiva.setText("Positiva");
        botonPositiva.setFocusable(false);
        botonPositiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPositivaActionPerformed(evt);
            }
        });

        calificaciones.add(botonNegativa);
        botonNegativa.setText("Negativa");
        botonNegativa.setFocusable(false);

        botonEnviar.setText("Enviar calificación");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(textoCalificacion)
                    .addComponent(botonPositiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNegativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPositiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNegativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(botonEnviar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreComercio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textoUbicacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoHorario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoCalifPosit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                        .addComponent(textoDueño))
                                    .addComponent(textoCalifNegat, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCalifPosit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCalifNegat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(botonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreComercioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreComercioActionPerformed

    private void textoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoHorarioActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        if (r != null) {
            r.setVisible(true);
        } else if (ca != null) {
            ca.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        //LitaDB lita = new LitaDB();
        
        if (calificaciones.isSelected(botonPositiva.getModel())) {
            c.sumarVotoPositivo();
            Servicios.getInstance().actualizarComercio(c);
            //lita.actualizarComercio(c);   
        } else {
            c.sumarVotoNegativo();
            Servicios.getInstance().actualizarComercio(c);
            //lita.actualizarComercio(c);
        }
        this.dispose();
        if (r != null) {
            r.setVisible(true);
        } else if (ca != null) {
            ca.setVisible(true);
        }
        //lita.cerrarSesion();
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (r != null) {
            r.setVisible(true);
        } else if (ca != null) {
            ca.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_formWindowClosed

    private void botonPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPositivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPositivaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JRadioButton botonNegativa;
    private javax.swing.JRadioButton botonPositiva;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup calificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreComercio;
    private javax.swing.JTextField textoCalifNegat;
    private javax.swing.JTextField textoCalifPosit;
    private javax.swing.JTextField textoCalificacion;
    private javax.swing.JTextField textoDueño;
    private javax.swing.JTextField textoHorario;
    private javax.swing.JTextField textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
