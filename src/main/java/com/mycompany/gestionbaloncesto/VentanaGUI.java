/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionbaloncesto;

import java.awt.event.ComponentEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Javier Moreno
 */
public class VentanaGUI extends javax.swing.JFrame {

    public VentanaGUI() {
        initComponents();
        sesionFactoria=NewHibernateUtil.getSessionFactory();
        sesionCreada = sesionFactoria.openSession(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPestanyaPrincipal = new javax.swing.JTabbedPane();
        pestanaMenuPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pestanaEquipos = new javax.swing.JPanel();
        panelEquiposListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquiposListadoEquipos = new javax.swing.JTable();
        botonEquipoInsertar = new javax.swing.JButton();
        botonEquipoModificar = new javax.swing.JButton();
        botonEquipoEliminar = new javax.swing.JButton();
        panelEquiposInformacion = new javax.swing.JPanel();
        etiquetaEquiposNombre = new javax.swing.JLabel();
        equiposNombre = new javax.swing.JTextField();
        etiquetaEquiposCiudad = new javax.swing.JLabel();
        equiposCiudad = new javax.swing.JTextField();
        etiquetaEquiposConferencia = new javax.swing.JLabel();
        equiposConferencia = new javax.swing.JComboBox<>();
        etiquetaEquiposDivision = new javax.swing.JLabel();
        equiposDivisionCombo = new javax.swing.JComboBox<>();
        panelEquiposDerecho = new javax.swing.JPanel();
        botonEquiposAceptar = new javax.swing.JButton();
        botonEquiposCancelar = new javax.swing.JButton();
        panelEquiposBotones = new javax.swing.JPanel();
        jPanelJugadores = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();
        jButtonInsertarJugadores = new javax.swing.JButton();
        jButtonModificarJugadores = new javax.swing.JButton();
        jButtonBorrarJugadores = new javax.swing.JButton();
        Derecho = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldUniversidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerAltura = new javax.swing.JSpinner();
        jSpinnerPeso = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxPosicion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxEquipo = new javax.swing.JComboBox<>();
        botonJugadoresAceptar = new javax.swing.JButton();
        botonJugadoresCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ir a Equipos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pestanaMenuPrincipalLayout = new javax.swing.GroupLayout(pestanaMenuPrincipal);
        pestanaMenuPrincipal.setLayout(pestanaMenuPrincipalLayout);
        pestanaMenuPrincipalLayout.setHorizontalGroup(
            pestanaMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        pestanaMenuPrincipalLayout.setVerticalGroup(
            pestanaMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaMenuPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        panelPestanyaPrincipal.addTab("Menú Principal", pestanaMenuPrincipal);

        pestanaEquipos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pestanaEquiposComponentShown(evt);
            }
        });

        panelEquiposListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Equipos"));

        tablaEquiposListadoEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Ciudad", "Conferencia", "Division "
            }
        ));
        tablaEquiposListadoEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquiposListadoEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquiposListadoEquipos);

        botonEquipoInsertar.setText("Insertar");
        botonEquipoInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquipoInsertarActionPerformed(evt);
            }
        });

        botonEquipoModificar.setText("Modificar");
        botonEquipoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquipoModificarActionPerformed(evt);
            }
        });

        botonEquipoEliminar.setText("Eliminar");
        botonEquipoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquipoEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEquiposListadoLayout = new javax.swing.GroupLayout(panelEquiposListado);
        panelEquiposListado.setLayout(panelEquiposListadoLayout);
        panelEquiposListadoLayout.setHorizontalGroup(
            panelEquiposListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposListadoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelEquiposListadoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(botonEquipoModificar)
                .addGap(18, 18, 18)
                .addComponent(botonEquipoInsertar)
                .addGap(18, 18, 18)
                .addComponent(botonEquipoEliminar)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelEquiposListadoLayout.setVerticalGroup(
            panelEquiposListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposListadoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEquiposListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEquipoInsertar)
                    .addComponent(botonEquipoModificar)
                    .addComponent(botonEquipoEliminar))
                .addGap(41, 41, 41))
        );

        panelEquiposInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Equipo"));

        etiquetaEquiposNombre.setText("Nombre: ");

        equiposNombre.setText("jTextField1");

        etiquetaEquiposCiudad.setText("Ciudad:");

        equiposCiudad.setText("jTextField1");

        etiquetaEquiposConferencia.setText("Conferencia: ");

        equiposConferencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Este", "Oeste" }));
        equiposConferencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                equiposConferenciaItemStateChanged(evt);
            }
        });

        etiquetaEquiposDivision.setText("División:");

        equiposDivisionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atlántico", "Sureste", "Central" }));

        botonEquiposAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/checked.png"))); // NOI18N
        botonEquiposAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquiposAceptarActionPerformed(evt);
            }
        });

        botonEquiposCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/gestionbaloncesto/cancel.png"))); // NOI18N
        botonEquiposCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquiposCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEquiposDerechoLayout = new javax.swing.GroupLayout(panelEquiposDerecho);
        panelEquiposDerecho.setLayout(panelEquiposDerechoLayout);
        panelEquiposDerechoLayout.setHorizontalGroup(
            panelEquiposDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposDerechoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(botonEquiposAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEquiposCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelEquiposDerechoLayout.setVerticalGroup(
            panelEquiposDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquiposDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEquiposAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEquiposCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEquiposInformacionLayout = new javax.swing.GroupLayout(panelEquiposInformacion);
        panelEquiposInformacion.setLayout(panelEquiposInformacionLayout);
        panelEquiposInformacionLayout.setHorizontalGroup(
            panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposInformacionLayout.createSequentialGroup()
                .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquiposInformacionLayout.createSequentialGroup()
                        .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaEquiposNombre)
                            .addComponent(etiquetaEquiposCiudad))
                        .addGap(30, 30, 30)
                        .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiposNombre)
                            .addComponent(equiposCiudad)))
                    .addGroup(panelEquiposInformacionLayout.createSequentialGroup()
                        .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaEquiposConferencia)
                            .addComponent(etiquetaEquiposDivision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiposConferencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(equiposDivisionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(panelEquiposDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEquiposInformacionLayout.setVerticalGroup(
            panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposInformacionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEquiposNombre)
                    .addComponent(equiposNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEquiposCiudad)
                    .addComponent(equiposCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEquiposConferencia)
                    .addComponent(equiposConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelEquiposInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEquiposDivision)
                    .addComponent(equiposDivisionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panelEquiposDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelEquiposBotonesLayout = new javax.swing.GroupLayout(panelEquiposBotones);
        panelEquiposBotones.setLayout(panelEquiposBotonesLayout);
        panelEquiposBotonesLayout.setHorizontalGroup(
            panelEquiposBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelEquiposBotonesLayout.setVerticalGroup(
            panelEquiposBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pestanaEquiposLayout = new javax.swing.GroupLayout(pestanaEquipos);
        pestanaEquipos.setLayout(pestanaEquiposLayout);
        pestanaEquiposLayout.setHorizontalGroup(
            pestanaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pestanaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEquiposBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pestanaEquiposLayout.createSequentialGroup()
                        .addComponent(panelEquiposListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEquiposInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pestanaEquiposLayout.setVerticalGroup(
            pestanaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pestanaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEquiposListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pestanaEquiposLayout.createSequentialGroup()
                        .addComponent(panelEquiposInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEquiposBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        panelEquiposInformacion.getAccessibleContext().setAccessibleName("Información adicional del equipo");

        panelPestanyaPrincipal.addTab("Equipos", pestanaEquipos);

        jPanelJugadores.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelJugadoresComponentShown(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJugadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableJugadores);

        jButtonInsertarJugadores.setText("Insertar");
        jButtonInsertarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarJugadoresActionPerformed(evt);
            }
        });

        jButtonModificarJugadores.setText("Modificar");

        jButtonBorrarJugadores.setText("Borrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButtonInsertarJugadores)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificarJugadores)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrarJugadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertarJugadores)
                    .addComponent(jButtonModificarJugadores)
                    .addComponent(jButtonBorrarJugadores))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        Derecho.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("id");

        jTextFieldID.setText("jTextField1");

        jLabel7.setText("Nombre");

        jTextFieldNombre.setText("jTextField2");

        jLabel8.setText("Universidad");

        jTextFieldUniversidad.setText("jTextField3");

        jLabel9.setText("Altura(pies)");

        jLabel10.setText("Peso(lbs)");

        jLabel11.setText("Posicion");

        jComboBoxPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Base", "Escolta", "Alero", "Ala", "Pivot", " " }));

        jLabel12.setText("Equipo");

        botonJugadoresAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/checked.png"))); // NOI18N
        botonJugadoresAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresAceptarActionPerformed(evt);
            }
        });

        botonJugadoresCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/gestionbaloncesto/cancel.png"))); // NOI18N
        botonJugadoresCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerechoLayout = new javax.swing.GroupLayout(Derecho);
        Derecho.setLayout(DerechoLayout);
        DerechoLayout.setHorizontalGroup(
            DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechoLayout.createSequentialGroup()
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(23, 23, 23)
                        .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldUniversidad)
                            .addComponent(jSpinnerAltura)
                            .addComponent(jSpinnerPeso)
                            .addComponent(jComboBoxPosicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DerechoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botonJugadoresAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonJugadoresCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        DerechoLayout.setVerticalGroup(
            DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinnerAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinnerPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonJugadoresAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonJugadoresCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelJugadoresLayout = new javax.swing.GroupLayout(jPanelJugadores);
        jPanelJugadores.setLayout(jPanelJugadoresLayout);
        jPanelJugadoresLayout.setHorizontalGroup(
            jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJugadoresLayout.setVerticalGroup(
            jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelPestanyaPrincipal.addTab("Jugadores", jPanelJugadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPestanyaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPestanyaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEquiposAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquiposAceptarActionPerformed
        
        Equipos equipo = null;
        Transaction transaccion = null;
        switch (opcion)
        {
            case 1: //insertar
                tablaEquiposListadoEquipos.clearSelection();
                tablaEquiposListadoEquipos.setEnabled(false);
                equipo = new Equipos(equiposNombre.getText(), equiposCiudad.getText(), equiposConferencia.getSelectedItem().toString(), equiposDivisionCombo.getSelectedItem().toString(), null, null, null);
                transaccion = sesionCreada.beginTransaction();
                sesionCreada.save(equipo);//save para nuevo
                transaccion.commit();
                pestanaEquiposComponentShown(new ComponentEvent(this, 0));//resfresco la pestaña
                habilitarbotonesequipos();
                
                break;
               
            case 2://borrar
                equipo = (Equipos)sesionCreada.load(Equipos.class, (String)equiposNombre.getText());
                transaccion = sesionCreada.beginTransaction();
                sesionCreada.delete(equipo);//update para modifica  //delete pa borrar
                transaccion.commit();
                pestanaEquiposComponentShown(new ComponentEvent(this, 0));//resfresco la pestañ
                habilitarbotonesequipos();
                break;
                
            case 3://Modificar
                equipo = (Equipos)sesionCreada.load(Equipos.class, (String)equiposNombre.getText());
                transaccion = sesionCreada.beginTransaction();
                
                equipo.setNombre(equiposNombre.getText());
                equipo.setCiudad(equiposCiudad.getText());
                equipo.setConferencia(equiposConferencia.getSelectedItem().toString());
                equipo.setDivision(equiposDivisionCombo.getSelectedItem().toString());
                sesionCreada.update(equipo);//update para modificar
                transaccion.commit();
                pestanaEquiposComponentShown(new ComponentEvent(this, 0));//resfresco la pestañ
                habilitarbotonesequipos();
                break;
        }
    }//GEN-LAST:event_botonEquiposAceptarActionPerformed

    private void botonEquiposCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquiposCancelarActionPerformed
        
        pestanaEquiposComponentShown(new ComponentEvent(this, 0));
        desactivarCamposEquipos();
        habilitarbotonesequipos();
    }//GEN-LAST:event_botonEquiposCancelarActionPerformed

    private void botonEquipoInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquipoInsertarActionPerformed
        opcion=1;
        botonEquipoEliminar.setEnabled(false);
        botonEquipoModificar.setEnabled(false);
        activarCamposEquipos();
    }//GEN-LAST:event_botonEquipoInsertarActionPerformed

    private void equiposConferenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_equiposConferenciaItemStateChanged

       switch(equiposConferencia.getSelectedItem().toString())
       {
           case "Este": 
               DefaultComboBoxModel modeloDivisionEste = new DefaultComboBoxModel(divisionEste);
               equiposDivisionCombo.setModel(modeloDivisionEste);
               break;
           case "Oeste": 
               DefaultComboBoxModel modeloDivisionOeste = new DefaultComboBoxModel(divisionOeste);
               equiposDivisionCombo.setModel(modeloDivisionOeste);
               break;
       }
    }//GEN-LAST:event_equiposConferenciaItemStateChanged

    private void tablaEquiposListadoEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposListadoEquiposMouseClicked
        
        Query q = sesionCreada.createQuery("from Equipos as e where e.nombre = :nombreEquipo");
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEquiposListadoEquipos.getModel();
        int filaSeleccionada = tablaEquiposListadoEquipos.getSelectedRow();
        String nombreEquipo = (String) modeloTabla.getValueAt(filaSeleccionada,0);
        q.setParameter("nombreEquipo", nombreEquipo);
        Equipos equipo = (Equipos) q.uniqueResult();
        equiposNombre.setText(equipo.getNombre());
        equiposCiudad.setText(equipo.getCiudad());
        equiposConferencia.setSelectedItem(equipo.getConferencia());
        if (equipo.getConferencia().equals("Este"))
        {
            equiposDivisionCombo.setModel(new DefaultComboBoxModel<>(divisionEste));
            equiposDivisionCombo.setSelectedItem(equipo.getDivision());
        }
        else
        {
            equiposDivisionCombo.setModel(new DefaultComboBoxModel<>(divisionOeste));
            equiposDivisionCombo.setSelectedItem(equipo.getDivision());
        }
    }//GEN-LAST:event_tablaEquiposListadoEquiposMouseClicked

    private void pestanaEquiposComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pestanaEquiposComponentShown
        
        camposDefectoEquipos();
        desactivarCamposEquipos();
        Query q = sesionCreada.createQuery("from Equipos");
        List<Equipos> listaEquipos = q.list();
        Iterator iteradorEquipos = listaEquipos.iterator();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEquiposListadoEquipos.getModel();
        modeloTabla.setRowCount(listaEquipos.size()); 
        int i = 0;
        while (iteradorEquipos.hasNext())
        {
            Equipos equipo = (Equipos) iteradorEquipos.next();
            modeloTabla.setValueAt(equipo.getNombre(), i, 0);
            modeloTabla.setValueAt(equipo.getCiudad(), i, 1);
            modeloTabla.setValueAt(equipo.getConferencia(), i, 2);
            modeloTabla.setValueAt(equipo.getDivision(), i, 3);
            i++;
        }
        tablaEquiposListadoEquipos.setModel(modeloTabla);
    }//GEN-LAST:event_pestanaEquiposComponentShown

    private void jPanelJugadoresComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelJugadoresComponentShown
        Query q = sesionCreada.createQuery("from Jugadores");
        List<Jugadores> listaJugadores = q.list();
        Iterator iteradorJugadores = listaJugadores.iterator();
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableJugadores.getModel();
        modeloTabla.setRowCount(listaJugadores.size());
        int i = 0;
        while (iteradorJugadores.hasNext())
        {
            Jugadores jugador = (Jugadores) iteradorJugadores.next();
            modeloTabla.setValueAt(jugador.getCodigo(),i,0);
            modeloTabla.setValueAt(jugador.getNombre(), i, 1);
            modeloTabla.setValueAt(jugador.getProcedencia(), i, 2);
            modeloTabla.setValueAt(jugador.getPosicion(), i, 3);
            i++;
        }
        jTableJugadores.setModel(modeloTabla);
        Query qequipos = sesionCreada.createQuery("from Equipos");
        List<Equipos> listaequipos = qequipos.list();
        Iterator iteradorequipos = listaequipos.iterator();
        DefaultComboBoxModel combobox = (DefaultComboBoxModel)jComboBoxEquipo.getModel();
        while (iteradorequipos.hasNext())
        {
            Equipos equipo = (Equipos) iteradorequipos.next();
            combobox.addElement(equipo.getNombre());
        }
        jComboBoxEquipo.setModel(combobox);
        jugadoresDefecto();
        
    }//GEN-LAST:event_jPanelJugadoresComponentShown

    private void botonEquipoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquipoEliminarActionPerformed
        opcion = 2;
        botonEquipoInsertar.setEnabled(false);
        botonEquipoModificar.setEnabled(false);
    }//GEN-LAST:event_botonEquipoEliminarActionPerformed

    private void botonEquipoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquipoModificarActionPerformed
        opcion = 3;
        botonEquipoInsertar.setEnabled(false);
        botonEquipoEliminar.setEnabled(false);
        equiposNombre.setEnabled(false);
        equiposCiudad.setEditable(true);
    }//GEN-LAST:event_botonEquipoModificarActionPerformed

    private void jTableJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJugadoresMouseClicked
       
        Query q = sesionCreada.createQuery("from Jugadores as e where e.codigo = :codigoJugador");
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableJugadores.getModel();
        int filaSeleccionada = jTableJugadores.getSelectedRow();
        int codigoJugador = (int) modeloTabla.getValueAt(filaSeleccionada,0);
        q.setParameter("codigoJugador", codigoJugador);
        Jugadores jugador = (Jugadores) q.uniqueResult();
        jTextFieldID.setText(Integer.toString(jugador.getCodigo()));
        jTextFieldNombre.setText(jugador.getNombre());
        jTextFieldUniversidad.setText(jugador.getProcedencia());
        jSpinnerAltura.setValue(jugador.getAltura());
        jSpinnerPeso.setValue(jugador.getPeso());
        jComboBoxEquipo.setSelectedItem(jugador.getEquipos().getNombre());
        //TODO: METER LA POSI Y TO ESO
    }//GEN-LAST:event_jTableJugadoresMouseClicked

    private void botonJugadoresAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresAceptarActionPerformed
       
        Jugadores jugador = null;
        Transaction transaccion = null;
        Equipos equipo = null;
        switch(opcion){
        
            case 1: //insertar
                equipo = (Equipos)sesionCreada.load(Equipos.class, jComboBoxEquipo.getSelectedItem().toString());
                
                
                jugador = new Jugadores(Integer.parseInt(jTextFieldID.getText()),equipo, jTextFieldNombre.getText(), jTextFieldUniversidad.getText(), Float.parseFloat(jSpinnerAltura.getValue().toString()),Integer.parseInt(jSpinnerPeso.getValue().toString()),jComboBoxPosicion.getSelectedItem().toString(), null);
                transaccion = sesionCreada.beginTransaction();
                sesionCreada.save(jugador);//save para nuevo
                transaccion.commit();
                jPanelJugadoresComponentShown(new ComponentEvent(this, 0));//resfresco la pestaña
                
                
                break;
            
        }
    }//GEN-LAST:event_botonJugadoresAceptarActionPerformed

    private void botonJugadoresCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJugadoresCancelarActionPerformed

    private void jButtonInsertarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarJugadoresActionPerformed
        opcion=1;
        jugadoresDefecto();
        jButtonModificarJugadores.setEnabled(false);
        jButtonBorrarJugadores.setEnabled(false);
        
    }//GEN-LAST:event_jButtonInsertarJugadoresActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Derecho;
    private javax.swing.JButton botonEquipoEliminar;
    private javax.swing.JButton botonEquipoInsertar;
    private javax.swing.JButton botonEquipoModificar;
    private javax.swing.JButton botonEquiposAceptar;
    private javax.swing.JButton botonEquiposCancelar;
    private javax.swing.JButton botonJugadoresAceptar;
    private javax.swing.JButton botonJugadoresCancelar;
    private javax.swing.JTextField equiposCiudad;
    private javax.swing.JComboBox<String> equiposConferencia;
    private javax.swing.JComboBox<String> equiposDivisionCombo;
    private javax.swing.JTextField equiposNombre;
    private javax.swing.JLabel etiquetaEquiposCiudad;
    private javax.swing.JLabel etiquetaEquiposConferencia;
    private javax.swing.JLabel etiquetaEquiposDivision;
    private javax.swing.JLabel etiquetaEquiposNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBorrarJugadores;
    private javax.swing.JButton jButtonInsertarJugadores;
    private javax.swing.JButton jButtonModificarJugadores;
    private javax.swing.JComboBox<String> jComboBoxEquipo;
    private javax.swing.JComboBox<String> jComboBoxPosicion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelJugadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAltura;
    private javax.swing.JSpinner jSpinnerPeso;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUniversidad;
    private javax.swing.JPanel panelEquiposBotones;
    private javax.swing.JPanel panelEquiposDerecho;
    private javax.swing.JPanel panelEquiposInformacion;
    private javax.swing.JPanel panelEquiposListado;
    private javax.swing.JTabbedPane panelPestanyaPrincipal;
    private javax.swing.JPanel pestanaEquipos;
    private javax.swing.JPanel pestanaMenuPrincipal;
    private javax.swing.JTable tablaEquiposListadoEquipos;
    // End of variables declaration//GEN-END:variables
    private SessionFactory sesionFactoria = null;
    private Session sesionCreada = null;
    private int opcion = 0;
    private String[] divisionEste = {"Atlantico","Sureste","Central"};
    private String[] divisionOeste = {"NoroEste","Suroeste","Pacifico"};
    
    private void desactivarCamposEquipos()
    {
        equiposCiudad.setEnabled(true);
        equiposNombre.setEnabled(true);
        equiposConferencia.setEnabled(true);
        equiposDivisionCombo.setEnabled(true);
        panelEquiposDerecho.setVisible(true);
        equiposCiudad.setEditable(false);
        equiposNombre.setEditable(false);
        equiposConferencia.setEditable(false);
        equiposDivisionCombo.setEditable(false);
    }
    private void habilitarbotonesequipos(){
        botonEquipoEliminar.setEnabled(true);
        botonEquipoInsertar.setEnabled(true);
        botonEquipoModificar.setEnabled(true);
    }
    
    private void activarCamposEquipos()
    {
        equiposCiudad.setEditable(true);
        equiposNombre.setEditable(true);
        equiposConferencia.setEditable(true);
        equiposDivisionCombo.setEditable(true);
        panelEquiposDerecho.setVisible(true);
    }
    
    private void camposDefectoEquipos()
    {
        equiposCiudad.setText("");
        equiposNombre.setText("");
        equiposConferencia.setSelectedIndex(0);
        equiposDivisionCombo.setModel(new DefaultComboBoxModel(divisionEste));
    }
    private void jugadoresDefecto(){
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldUniversidad.setText("");
    }
}
