/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import cinet_planet.*;
import Clases.P_cajer;
import Clases.P_cofi;
import Clases.R_Empleados;

import desplazable.Desface;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class registro1 extends javax.swing.JFrame {

   R_Empleados c= new R_Empleados();
   DefaultTableModel modelo;
   DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
   
 int xMouse,yMouse;
    Date fechaVenta =new Date();
     String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);
  Desface desplace;
   P_cajer a = new P_cajer();
   P_cofi b = new P_cofi();
    public registro1() {
    
  this.setUndecorated(true);
this.setSize(634,400);

        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        a.MostrarDatosCajero(TablaRegistro);
           b.MostrarDatosConfitero(TablaRegistro2);
            
              desplace = new Desface();
        
       
   
     
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        PANELmob = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaRegistro2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaRegistro = new javax.swing.JTable();
        registro2 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registro = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        correo1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtcodigo = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Fondo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        registro1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("jCheckBox1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANELmob.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btn-ga.png"))); // NOI18N
        jLabel6.setText("GA");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        PANELmob.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 80, 80));

        TablaRegistro2.setBackground(new java.awt.Color(7, 30, 89));
        TablaRegistro2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        TablaRegistro2.setForeground(new java.awt.Color(255, 255, 255));
        TablaRegistro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaRegistro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRegistro2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaRegistro2);
        if (TablaRegistro2.getColumnModel().getColumnCount() > 0) {
            TablaRegistro2.getColumnModel().getColumn(0).setMinWidth(49);
            TablaRegistro2.getColumnModel().getColumn(0).setPreferredWidth(49);
            TablaRegistro2.getColumnModel().getColumn(0).setMaxWidth(49);
            TablaRegistro2.getColumnModel().getColumn(1).setMinWidth(100);
            TablaRegistro2.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaRegistro2.getColumnModel().getColumn(1).setMaxWidth(100);
            TablaRegistro2.getColumnModel().getColumn(2).setMinWidth(100);
            TablaRegistro2.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaRegistro2.getColumnModel().getColumn(2).setMaxWidth(100);
            TablaRegistro2.getColumnModel().getColumn(3).setMinWidth(180);
            TablaRegistro2.getColumnModel().getColumn(3).setPreferredWidth(180);
            TablaRegistro2.getColumnModel().getColumn(3).setMaxWidth(180);
            TablaRegistro2.getColumnModel().getColumn(4).setMinWidth(100);
            TablaRegistro2.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablaRegistro2.getColumnModel().getColumn(4).setMaxWidth(100);
            TablaRegistro2.getColumnModel().getColumn(5).setMinWidth(100);
            TablaRegistro2.getColumnModel().getColumn(5).setPreferredWidth(100);
            TablaRegistro2.getColumnModel().getColumn(5).setMaxWidth(100);
            TablaRegistro2.getColumnModel().getColumn(6).setMinWidth(100);
            TablaRegistro2.getColumnModel().getColumn(6).setPreferredWidth(100);
            TablaRegistro2.getColumnModel().getColumn(6).setMaxWidth(100);
            TablaRegistro2.getColumnModel().getColumn(7).setMinWidth(40);
            TablaRegistro2.getColumnModel().getColumn(7).setPreferredWidth(40);
            TablaRegistro2.getColumnModel().getColumn(7).setMaxWidth(40);
        }

        PANELmob.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 530, 110));

        TablaRegistro.setBackground(new java.awt.Color(7, 30, 89));
        TablaRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        TablaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRegistroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaRegistro);
        if (TablaRegistro.getColumnModel().getColumnCount() > 0) {
            TablaRegistro.getColumnModel().getColumn(0).setMinWidth(49);
            TablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(49);
            TablaRegistro.getColumnModel().getColumn(0).setMaxWidth(49);
            TablaRegistro.getColumnModel().getColumn(1).setMinWidth(100);
            TablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaRegistro.getColumnModel().getColumn(1).setMaxWidth(100);
            TablaRegistro.getColumnModel().getColumn(2).setMinWidth(100);
            TablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaRegistro.getColumnModel().getColumn(2).setMaxWidth(100);
            TablaRegistro.getColumnModel().getColumn(3).setMinWidth(180);
            TablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(180);
            TablaRegistro.getColumnModel().getColumn(3).setMaxWidth(180);
            TablaRegistro.getColumnModel().getColumn(4).setMinWidth(100);
            TablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablaRegistro.getColumnModel().getColumn(4).setMaxWidth(100);
            TablaRegistro.getColumnModel().getColumn(5).setMinWidth(100);
            TablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(100);
            TablaRegistro.getColumnModel().getColumn(5).setMaxWidth(100);
            TablaRegistro.getColumnModel().getColumn(6).setMinWidth(100);
            TablaRegistro.getColumnModel().getColumn(6).setPreferredWidth(100);
            TablaRegistro.getColumnModel().getColumn(6).setMaxWidth(100);
            TablaRegistro.getColumnModel().getColumn(7).setMinWidth(40);
            TablaRegistro.getColumnModel().getColumn(7).setPreferredWidth(40);
            TablaRegistro.getColumnModel().getColumn(7).setMaxWidth(40);
        }

        PANELmob.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 530, 110));

        registro2.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        registro2.setForeground(new java.awt.Color(255, 255, 255));
        registro2.setText("TABLA CAJERO Y CONFITERO");
        PANELmob.add(registro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 540, 34));

        Fondo2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo2.setOpaque(true);
        PANELmob.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1380, 80));

        jLabel4.setBackground(new java.awt.Color(4, 30, 65));
        jLabel4.setOpaque(true);
        PANELmob.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 400));

        jPanel1.add(PANELmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bo.png"))); // NOI18N
        jLabel5.setText("GA");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 240, 130));

        registro.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("REGISTRO");
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 190, 34));

        texto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setText("<html><body><p style=\"text-align:justify;\"><html><body><p style=\"text-align:justify;\">Ingrese los datos del empleado. </p></body></html></p></body></html>");
        texto.setToolTipText("");
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 50));

        apellido.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setText("USUARIO:");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 40));

        correo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("CODIGO:");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 50));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 250, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cineplanet-logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 240, 310, 160));

        nombre1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("NOMBRE:");
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnatras.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 60, -1));

        guardar.setBackground(new java.awt.Color(210, 1, 118));
        guardar.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("AGREGAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 190, 40));

        txtnombre.setBackground(new java.awt.Color(4, 30, 65));
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(null);
        txtnombre.setOpaque(true);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 250, 20));

        txtusuario.setBackground(new java.awt.Color(4, 30, 65));
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setBorder(null);
        txtusuario.setOpaque(true);
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 250, 20));

        correo1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        correo1.setForeground(new java.awt.Color(255, 255, 255));
        correo1.setText("CONTRASEÑA:");
        jPanel1.add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 50));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOpaque(true);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 250, 1));

        txtcodigo.setBackground(new java.awt.Color(4, 30, 65));
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setBorder(null);
        txtcodigo.setOpaque(true);
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 20));

        txtcontraseña.setBackground(new java.awt.Color(4, 30, 65));
        txtcontraseña.setBorder(null);
        jPanel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 238, 248, 30));

        jRadioButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cajero");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Confitero");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 90));

        X.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });
        jPanel1.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 40));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOpaque(true);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 250, 1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOpaque(true);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 268, 250, 1));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setOpaque(true);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1380, 80));

        Fondo1.setBackground(new java.awt.Color(4, 30, 65));
        Fondo1.setOpaque(true);
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 320));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 30));

        id.setText("id");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        registro1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        registro1.setForeground(new java.awt.Color(255, 255, 255));
        registro1.setText("REGISTRO");
        jPanel1.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 190, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
    
       X.setForeground(new Color(210,1,118));
    }//GEN-LAST:event_XMousePressed

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        
    }//GEN-LAST:event_XMouseEntered

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       int x=evt.getXOnScreen();
              int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
      X.setForeground(Color.white);
    }//GEN-LAST:event_XMouseExited

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
 // String fecha =((JTextField) nacimiento.getDateEditor().getUiComponent()).getText();
if (jRadioButton1.isSelected()) {
             P_cajer a = new P_cajer();
        a.AgregarCajero(txtnombre, txtusuario, txtcontraseña, txtcodigo);
        Limpiar();
        }
       if (jRadioButton2.isSelected()) {
             P_cofi a = new P_cofi();
        a.AgregarConfitero(txtnombre, txtusuario, txtcontraseña, txtcodigo);
        Limpiar();
        } 
      
    }//GEN-LAST:event_guardarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Menu_administrador form =new Menu_administrador();
             form.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void TablaRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistroMouseClicked
     /*  int fila = TablaRegistro.getSelectedRow();
       if (fila == -1){
           JOptionPane.showMessageDialog(null,"Seleccione una fila");
       }else{
           String id = (String) TablaRegistro.getValueAt(fila, 0);
           String nom1=(String) TablaRegistro.getValueAt(fila, 1);
           String ape1=(String) TablaRegistro.getValueAt(fila, 2);
           String correo1=(String) TablaRegistro.getValueAt(fila, 3);
            String dni1=(String) TablaRegistro.getValueAt(fila, 4);
             String celular1=(String) TablaRegistro.getValueAt(fila, 5);
              String date1= (String) TablaRegistro.getValueAt(fila, 6);
               String soc1=(String) TablaRegistro.getValueAt(fila, 7);
               txtid.setText(id);
           txtnom.setText(nom1);
           txtapellido.setText(ape1);
            txtcorreo.setText(correo1);
             txtdni.setText(dni1);
          txtcelular.setText(celular1);
          Fecha_na.setDateFormatString(date1);
          socio_cb.setSelectedItem(soc1);
       }*/
    }//GEN-LAST:event_TablaRegistroMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         if (PANELmob.getX() == 640 ) {
   //desplace.desplazarIzquierda(PMenu, PMenu.getX(), -153, 10, 10);
   desplace.desplazarIzquierda(PANELmob, PANELmob.getX(),0,10, 10);
      
         }
          else {
          desplace.desplazarDerecha(PANELmob, PANELmob.getX(),640,10, 10); 
         }   
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (PANELmob.getX() == 0 ){ desplace.desplazarDerecha(PANELmob, PANELmob.getX(),640,10, 10); }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void TablaRegistro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaRegistro2MouseClicked

    public void Limpiar(){
     
    
     txtnombre.setText("");
    txtusuario.setText("");
    txtcontraseña.setText("");
    txtcodigo.setText("");
  
    
    }
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
            java.util.logging.Logger.getLogger(registro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JPanel PANELmob;
    private javax.swing.JTable TablaRegistro;
    private javax.swing.JTable TablaRegistro2;
    private javax.swing.JLabel X;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel id;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel registro;
    private javax.swing.JLabel registro1;
    private javax.swing.JLabel registro2;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
