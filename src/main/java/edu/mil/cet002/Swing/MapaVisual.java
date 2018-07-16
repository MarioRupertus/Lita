/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.Swing;

import edu.mil.cet002.compraslita.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 *
 * @author Mariela Toscano
 */
public class MapaVisual extends javax.swing.JFrame {

    List<JButton> botones;
    Color defaultCol;
    Recorrido r;
    Carrito c;
    InfoNodo info;
    int iteracion = 0;
    String medio;
    DefaultListModel destinos = new DefaultListModel();
    DefaultListModel recorrido = new DefaultListModel();
    int ant = -1; // auxiliar utilizado en metodo recorrerMapa();

    /**
     * Creates new form MapaVisual
     */
    public MapaVisual() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public MapaVisual(Recorrido r, Carrito carro) {
        this();
        this.r = r;
        medio = (r.getAuto() == 0 ? "Caminando" : "Automovil"); // utilizado por label de medio de transporte
        this.c = carro;
        initComponents();
        iniciarBotones();
        //iniciarRecorrido();
        iniciarDestinos(); // utilizado por jList de lugares a vistiar 
        iniciarRecorridoList(); // utilizado por jList de recorrido completo
        recorrerMapa();// arranca en el constructor para marcar el primer punto
        this.setLocationRelativeTo(null); //Centrado en pantalla
    }

    private void recorrerMapa() {

        if (iteracion < r.getRecorridoCompleto().size()) { // El boton siguiente invoca este metodo, si todas las iteracion estan realizadas no hace nada. Si faltan lugares por recorrer va a pintar la siguiente.

            boolean encontrado = false; //condicional para iterar while
            int i = 0; //indice para recorrer lista de botones
            Nodo nodoActual = r.getRecorridoCompleto().get(iteracion); // nodo a recorrer

            while (!encontrado) {
                try { // Este try intenta cambiar el color del boton anterior. Se hace la excepcion porque el primer lugar no tiene antecesor y se romperia.
                    botones.get(ant).setBackground(new Color(255, 209, 148)); // amarillo
                } catch (Exception e) {
                }

                // SE RESTABLECE COLOR DE ORIGEN, DESTINOS Y FINAL
                for (Nodo d : r.getDestinoIntermedio()) { // pinta destinos intermedios
                    botones.get(d.getIdnodo() - 1).setBackground(new Color(255, 0, 0)); //rojo
                }
                botones.get(r.getOrigen().getIdnodo() - 1).setBackground(new Color(147, 222, 255)); // pinta celeste destino inicial
                botones.get(r.getDestinoFinal().getIdnodo() - 1).setBackground(new Color(147, 222, 255)); // pinta celeste destino final
                // FIN SETEO COLOR

                if (botones.get(i).getText().equals(nodoActual.getIdnodo().toString())) { // Busca que boton es el que representa el nodo actual. Comparar el texto del boton con el id (String) del nodo.
                    botones.get(i).setBackground(new Color(0, 128, 0)); // verde
                    if (ant != -1) { // dibuja flechas
                        drawArrow(botones.get(ant).getX(), botones.get(ant).getY(),
                                botones.get(i).getX(), botones.get(i).getY());
                    }
                    if (iteracion + 1 == r.getRecorridoCompleto().size()) { // para la ultima iteracion pinta de negro y letras blancas
                        botones.get(i).setBackground(new Color(0, 0, 0)); // fondo negro
                        botones.get(i).setForeground(new Color(255, 255, 255)); // letra blanca
                        siguienteBoton.setContentAreaFilled(false); // anula boton siguiente
                        botonCalificar.setEnabled(true);
                    }
                    ant = i; // guarda el boton visitado para utilizarlo luego como antecesor del siguiente
                    encontrado = true;
                    iteracion++;
                } else {
                    i++; // ver excepcion si no lo encuentra y sigue aumentando la i --> NULL POINTER EXCEPTION
                }
                //botones.get(r.getOrigen().getIdnodo() - 1).setBackground(new Color(147, 222, 255)); // pinta celeste destino inicial
                //botones.get(r.getDestinoFinal().getIdnodo() - 1).setBackground(new Color(147, 222, 255)); // pinta celeste destino final
            }

        } else {

        }

    }

    private void iniciarBotones() {
        botones = new ArrayList();
        botones.add(jButton1);
        botones.add(jButton2);
        botones.add(jButton3);
        botones.add(jButton4);
        botones.add(jButton5);
        botones.add(jButton6);
        botones.add(jButton7);
        botones.add(jButton8);
        botones.add(jButton9);
        botones.add(jButton10);
        botones.add(jButton11);
        botones.add(jButton12);
        botones.add(jButton13);
        botones.add(jButton14);
        botones.add(jButton15);
        botones.add(jButton16);
        botones.add(jButton17);
        botones.add(jButton18);
        botones.add(jButton19);
        botones.add(jButton20);
        botones.add(jButton21);
        botones.add(jButton22);
        botones.add(jButton23);
        botones.add(jButton24);
        botones.add(jButton25);
        botones.add(jButton26);
        botones.add(jButton27);
        botones.add(jButton28);
        botones.add(jButton29);
        botones.add(jButton30);
        botones.add(jButton31);
        botones.add(jButton32);
        botones.add(jButton33);
        botones.add(jButton34);
        botones.add(jButton35);
        botones.add(jButton36);
        botones.add(jButton37);
        for (int i = 0; i < botones.size(); i++) {
            botones.get(i).addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    verInfoNodo(evt);
                }
            });
        }
        defaultCol = jButton1.getBackground();
    }

    /**
     * private void iniciarRecorrido() { ubicarNodo(0); siguienteLugar(); }
     */
    /**
     * private void limpiarBotones() { for (int a = 0; a < botones.size(); a++)
     * { botones.get(a).setBackground(defaultCol); } }
     */
    /**
     * private void siguienteLugar() {
     * sigLugar.setText(r.getRecorridoCompleto().get(iteracion +
     * 1).getIdnodo().toString()); }
     */
    /**
     * private void ubicarNodo(int i) { boolean com = false;//Booleano para
     * ubicar si hay un comercio en ese nodo for (int a = 0; a < botones.size();
     * a++) { if (r.getRecorridoCompleto().get(i).getIdnodo() ==
     * Integer.parseInt(botones.get(a).getText())) { for (int b = 0; b <
     * c.getListaDeProductos().size(); b++) { if
     * (c.getListaDeProductos().get(b).getComercio().getUbicacion().getIdnodo()
     * == Integer.parseInt(botones.get(a).getText())) {
     * System.out.println(c.getListaDeProductos().get(b).getComercio().getUbicacion().getIdnodo());
     * botones.get(i).setBackground(new Color(0, 128, 0)); com = true; } } if
     * (!com) { botones.get(i).setBackground(new Color(255, 0, 0)); } } } }
     */
    private void iniciarDestinos() {
        for (Nodo d : r.getDestinoIntermedio()) {
            if (!destinos.contains("#" + d.getIdnodo() + " " + d.getNombre())) {
                destinos.addElement("#" + d.getIdnodo() + " " + d.getNombre());
            }
            for (Producto p : c.getListaDeProductos()) {
                if (p.getComercio().getUbicacion().getIdnodo().equals(d.getIdnodo())) {
                    String nombreComercio = p.getComercio().getNombre();
                    if (!destinos.contains(p.getComercio().getNombre())) {
                        destinos.addElement(nombreComercio);
                    }
                }
            }
        }
        destinosList.setModel(destinos);
    }

    private void iniciarRecorridoList() {
        int i = 1;
        for (Nodo r : r.getRecorridoCompleto()) {
            recorrido.addElement(i + " --> " + "#" + r.getIdnodo() + " " + r.getNombre());
            i++;
        }
        recorridoList.setModel(recorrido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        siguienteBoton = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonCalificar = new javax.swing.JButton();
        origen = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        medioTransporte = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        destinosList = new javax.swing.JList<>();
        lugVisitar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        recorridoList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mapa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 10, 20, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton2);
        jButton2.setBounds(100, 10, 20, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton3);
        jButton3.setBounds(170, 10, 20, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton4);
        jButton4.setBounds(240, 10, 20, 20);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton5);
        jButton5.setBounds(330, 10, 20, 20);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton6);
        jButton6.setBounds(330, 100, 20, 20);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton7);
        jButton7.setBounds(250, 100, 20, 20);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton8);
        jButton8.setBounds(220, 100, 20, 20);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton9);
        jButton9.setBounds(170, 100, 20, 20);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setText("10");
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton10);
        jButton10.setBounds(100, 100, 20, 20);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("11");
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton11);
        jButton11.setBounds(10, 100, 20, 20);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton12.setText("12");
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.setPreferredSize(new java.awt.Dimension(25, 13));
        jPanel2.add(jButton12);
        jButton12.setBounds(10, 190, 20, 20);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setText("13");
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton13);
        jButton13.setBounds(100, 190, 20, 20);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setText("14");
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton14);
        jButton14.setBounds(160, 190, 20, 20);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("15");
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.setPreferredSize(new java.awt.Dimension(13, 19));
        jPanel2.add(jButton15);
        jButton15.setBounds(190, 190, 20, 20);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setText("16");
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton16);
        jButton16.setBounds(250, 190, 20, 20);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("17");
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton17);
        jButton17.setBounds(330, 190, 20, 20);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("18");
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton18);
        jButton18.setBounds(330, 280, 20, 20);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setText("19");
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(250, 280, 20, 20);

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("20");
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton20);
        jButton20.setBounds(160, 280, 20, 20);

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setText("21");
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton21);
        jButton21.setBounds(100, 280, 20, 20);

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setText("22");
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton22);
        jButton22.setBounds(10, 280, 20, 20);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setText("23");
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton23);
        jButton23.setBounds(10, 370, 20, 20);

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton24.setText("24");
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton24);
        jButton24.setBounds(100, 370, 20, 20);

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton25.setText("25");
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton25);
        jButton25.setBounds(140, 370, 20, 20);

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton26.setText("26");
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton26);
        jButton26.setBounds(190, 370, 20, 20);

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton27.setText("27");
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton27);
        jButton27.setBounds(250, 370, 20, 20);

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton28.setText("28");
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton28);
        jButton28.setBounds(330, 370, 20, 20);

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton29.setText("29");
        jButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton29);
        jButton29.setBounds(330, 460, 20, 20);

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton30.setText("30");
        jButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton30);
        jButton30.setBounds(250, 460, 20, 20);

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton31.setText("31");
        jButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton31);
        jButton31.setBounds(180, 460, 20, 20);

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton32.setText("32");
        jButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton32);
        jButton32.setBounds(100, 460, 20, 20);

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton33.setText("33");
        jButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton33);
        jButton33.setBounds(10, 460, 20, 20);

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton34.setText("34");
        jButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton34);
        jButton34.setBounds(180, 540, 20, 20);

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton35.setText("35");
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton35);
        jButton35.setBounds(280, 540, 20, 20);

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton36.setText("36");
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton36);
        jButton36.setBounds(330, 540, 20, 20);

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton37.setText("37");
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel2.add(jButton37);
        jButton37.setBounds(170, 240, 20, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoswing/imagenes/Mapa.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 380, 580);

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        siguienteBoton.setText("Siguiente lugar");
        siguienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigRecorrerMapa(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonCalificar.setText("Calificar");
        botonCalificar.setEnabled(false);
        botonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siguienteBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(siguienteBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCalificar)
                    .addComponent(botonSalir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        origen.setText("Origen: #" + r.getOrigen().getIdnodo() + " " + r.getOrigen().getNombre());

        destino.setText("Final: #" + r.getDestinoFinal().getIdnodo() + " " + r.getDestinoFinal().getNombre());

        costo.setText(String.valueOf("Distancia total (mts): " + r.getCostoTotal()));

        medioTransporte.setText("Medio de transporte: " + medio);

        destinosList.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane3.setViewportView(destinosList);

        lugVisitar.setText("Lugares a visitar:");

        jLabel1.setText("Recorrido:");

        recorridoList.setBackground(new java.awt.Color(240, 240, 240));
        recorridoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(recorridoList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lugVisitar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(origen)
                            .addComponent(medioTransporte)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(costo)
                            .addComponent(destino)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane4))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medioTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(origen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lugVisitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.out.println(iteracion);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void sigRecorrerMapa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigRecorrerMapa
        recorrerMapa();
    }//GEN-LAST:event_sigRecorrerMapa

    private void botonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalificarActionPerformed
        Calificacion n = new Calificacion(Servicios.getInstance().convertirProductosAComercios(c.getListaDeProductos()));
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCalificarActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed
    private void verInfoNodo(int i) {
        info = new InfoNodo(r.getMapa().getMapa().get(i - 1));
        info.setVisible(true);
    }

    private void verInfoNodo(java.awt.event.ActionEvent evt) {
        JButton a = (JButton) evt.getSource();
        verInfoNodo(Integer.parseInt(a.getText()));
    }
    /**
     * @param args the command line arguments 1
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel destino;
    private javax.swing.JList<String> destinosList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lugVisitar;
    private javax.swing.JLabel medioTransporte;
    private javax.swing.JLabel origen;
    private javax.swing.JList<String> recorridoList;
    private javax.swing.JButton siguienteBoton;
    // End of variables declaration//GEN-END:variables
public void drawArrow(int x0, int y0, int x1, int y1) {
        Graphics g = getGraphics();
        g.create();
        double alfa = Math.atan2(y1 - y0, x1 - x0);
        x0 = x0 + 20;
        x1 = x1 + 20;
        y0 = y0 + 40;
        y1 = y1 + 40;
        g.drawLine(x0, y0, x1, y1);
        int k = 5;
        int mediox = x0 + (int) ((x1 - x0) / 2);
        int medioy = y0 + (int) ((y1 - y0) / 2);
        int xa = (int) (mediox - k * Math.cos(alfa + 1));
        int ya = (int) (medioy - k * Math.sin(alfa + 1));

// Se dibuja un extremo de la dirección de la flecha.
        g.drawLine(xa, ya, mediox, medioy);
        xa = (int) (mediox - k * Math.cos(alfa - 1));
        ya = (int) (medioy - k * Math.sin(alfa - 1));
// Se dibuja el otro extremo de la dirección de la flecha.

        g.drawLine(xa, ya, mediox, medioy);
    }
}
