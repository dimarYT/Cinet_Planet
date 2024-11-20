/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Compra;

import desplazable.Desface;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Juan
 */
public class compra_entradas extends javax.swing.JFrame {
Desface desplace;
 Compra a = new Compra();
    public compra_entradas() {
        this.setUndecorated(true);
this.setSize(634,380);

        initComponents();
        desplace = new Desface();
        this.setLocationRelativeTo(null);

        setResizable(false);
      lblprecio.setText("S/ 0.00");
      lbltotal.setText("S/ 0.00");
       a.listar(cbpelicula);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbpelicula = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        spcantidad = new javax.swing.JSpinner();
        volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PELICULAS", "CANTIDAD", "PRECIO", "HORARIO"
            }
        ));
        jScrollPane2.setViewportView(TablaVenta);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 530, 270));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btn-ga.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 70, -1));

        jLabel8.setBackground(new java.awt.Color(0, 74, 138));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 74, 138));
        jLabel8.setText("TABLA - COMPRAS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/linea.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 260));

        jLabel7.setBackground(new java.awt.Color(4, 30, 65));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 140));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bo.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 160, 160, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 640, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 235, 0));
        jLabel1.setText("CANTIDAD:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 235, 0));
        jLabel2.setText("TOTAL:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 30));

        eliminar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 140, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(253, 235, 0));
        jLabel15.setText("PRECIO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 130, 30));

        cbpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpeliculaActionPerformed(evt);
            }
        });
        jPanel1.add(cbpelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(253, 235, 0));
        jLabel10.setText("PELICULAS:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        spcantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        spcantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spcantidadStateChanged(evt);
            }
        });
        jPanel1.add(spcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 30));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ga.png"))); // NOI18N
        volver.setContentAreaFilled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnatras.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        comprar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        comprar.setText("COMPRAR");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel1.add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/linea.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 30));

        lblprecio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jPanel1.add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 100, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cineplanet-logo2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        lbltotal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jPanel1.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/peliculas.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 320, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 260));

        jLabel5.setBackground(new java.awt.Color(4, 30, 65));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpeliculaActionPerformed
    a.BuscarPel(cbpelicula, lblprecio,lblid);
    }//GEN-LAST:event_cbpeliculaActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu_cajero form = new Menu_cajero();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        a.insertar(lblid, spcantidad, lbltotal);
        a.MostrarDatos(TablaVenta);
    }//GEN-LAST:event_comprarActionPerformed

    private void spcantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spcantidadStateChanged
      a.CalcularTotal(spcantidad, lbltotal, lblprecio);
    }//GEN-LAST:event_spcantidadStateChanged

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        a.EliminarPel(TablaVenta);
        a.MostrarDatos(TablaVenta);
    }//GEN-LAST:event_eliminarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       if (jPanel2.getX() == 640 ) {
   //desplace.desplazarIzquierda(PMenu, PMenu.getX(), -153, 10, 10);
   desplace.desplazarIzquierda(jPanel2, jPanel2.getX(),0,10, 10);

         }
          else {
          desplace.desplazarDerecha(jPanel2, jPanel2.getX(),640,10, 10); 
         }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if (jPanel2.getX() == 0 ){ desplace.desplazarDerecha(jPanel2, jPanel2.getX(),640,10, 10); }
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(compra_entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compra_entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compra_entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compra_entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compra_entradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVenta;
    private javax.swing.JComboBox<String> cbpelicula;
    private javax.swing.JButton comprar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JSpinner spcantidad;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
