package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;

public class InfoComercio extends javax.swing.JFrame {

    Comercio c;
    private DefaultListModel<String> dlm = new DefaultListModel<>();

    public InfoComercio(Comercio c) {
        initComponents();
        this.c = c;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        nombreComercio.setText(c.getNombre());

        //SimpleDateFormat hora = new SimpleDateFormat("hh");
        //String horarioAp = hora.format(c.getHorarioApertura());
        //String horarioCi = hora.format(c.getHorarioCierre());
        textoHorario.setText("Horario: De " + c.getHorarioApertura() + " a " + c.getHorarioCierre());
        textoDueño.setText(c.getDuenio());
        textoUbicacion.setText("Dirección: " + c.getUbicacion().getNombre());
        textoCalifPosit.setText("Calificaciones Positivas: " + String.valueOf(c.getCalificacionPositiva()));
        textoCalifNegat.setText("Calificaciones Negativas: " + String.valueOf(c.getCalificacionNegativa()));

//        for (int i = 0; i > c.getListaDeProductos().size(); i++) {
//            dlm.addElement(c.getListaDeProductos().get(i).getNombre());
//        }
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
        jButton1 = new javax.swing.JButton();
        botonPositiva = new javax.swing.JRadioButton();
        botonNegativa = new javax.swing.JRadioButton();
        botonEnviar = new javax.swing.JButton();
        textoCalificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jButton1.setLabel("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonPositiva.setBackground(new java.awt.Color(255, 255, 255));
        calificaciones.add(botonPositiva);
        botonPositiva.setSelected(true);
        botonPositiva.setText("Positiva");
        botonPositiva.setFocusable(false);

        botonNegativa.setBackground(new java.awt.Color(255, 255, 255));
        calificaciones.add(botonNegativa);
        botonNegativa.setText("Negativa");
        botonNegativa.setFocusable(false);

        botonEnviar.setText("Enviar calificación");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        textoCalificacion.setEditable(false);
        textoCalificacion.setBackground(new java.awt.Color(255, 255, 255));
        textoCalificacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCalificacion.setText("Calificacion:");
        textoCalificacion.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoUbicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoHorario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoCalifPosit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreComercio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoCalifNegat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                            .addComponent(textoDueño, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonEnviar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonPositiva, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonNegativa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPositiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNegativa))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCalifPosit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEnviar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCalifNegat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreComercioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_nombreComercioActionPerformed

    private void textoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoHorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed

        if (calificaciones.isSelected(botonPositiva.getModel())) {
            c.sumarVotoPositivo();
            System.out.println("+1");
        } else {
            c.sumarVotoNegativo();
            System.out.println("-1");
        }
        
        InfoComercio f = new InfoComercio(c);
        f.setVisible(true);
        f.botonEnviar.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_botonEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JRadioButton botonNegativa;
    private javax.swing.JRadioButton botonPositiva;
    private javax.swing.ButtonGroup calificaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreComercio;
    private javax.swing.JTextField textoCalifNegat;
    private javax.swing.JTextField textoCalifPosit;
    private javax.swing.JTextField textoCalificacion;
    private javax.swing.JTextField textoDueño;
    private javax.swing.JTextField textoHorario;
    private javax.swing.JTextField textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
