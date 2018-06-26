package edu.mil.cet002.Swing;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;

public class InfoComercio extends javax.swing.JFrame {

    private DefaultListModel<String> dlm = new DefaultListModel<>();

    public InfoComercio(Comercio c) {
        initComponents();
//xd
        nombreComercio.setText(c.getNombre());

        SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy");
        String horario = hora.format(c.getHorario());

        textoHorario.setText(horario);
        textoDueño.setText(c.getDuenio());
        textoUbicacion.setText(c.getUbicacion().getNombre());
        textoCalifPosit.setText("Calificaciones Positivas: " + String.valueOf(c.getCalificacionPositiva()));
        textoCalifNegat.setText("Calificaciones Negativas: " + String.valueOf(c.getCalificacionNegativa()));

        for (int i = 0; i > c.getListaDeProductos().size(); i++) {
            dlm.addElement(c.getListaDeProductos().get(i).getNombre());
        }
    }

    private InfoComercio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreComercio = new javax.swing.JTextField();
        textoUbicacion = new javax.swing.JTextField();
        textoDueño = new javax.swing.JTextField();
        textoHorario = new javax.swing.JTextField();
        textoCalifPosit = new javax.swing.JTextField();
        textoCalifNegat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        textoProductos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        listaProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProductos.setFocusable(false);
        jScrollPane1.setViewportView(listaProductos);

        textoProductos.setEditable(false);
        textoProductos.setBackground(new java.awt.Color(255, 255, 255));
        textoProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoProductos.setText("Productos:");
        textoProductos.setBorder(null);
        textoProductos.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoUbicacion)
                    .addComponent(textoDueño)
                    .addComponent(textoHorario)
                    .addComponent(textoCalifPosit)
                    .addComponent(textoCalifNegat)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addComponent(textoProductos))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCalifPosit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCalifNegat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreComercioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreComercioActionPerformed

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
            java.util.logging.Logger.getLogger(InfoComercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoComercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoComercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoComercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoComercio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaProductos;
    private javax.swing.JTextField nombreComercio;
    private javax.swing.JTextField textoCalifNegat;
    private javax.swing.JTextField textoCalifPosit;
    private javax.swing.JTextField textoDueño;
    private javax.swing.JTextField textoHorario;
    private javax.swing.JTextField textoProductos;
    private javax.swing.JTextField textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
