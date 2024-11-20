/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import cinet_planet.*;
import Clases.C_Cajero;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Juan
 */
public class Cajero_Asientos extends javax.swing.JFrame {
C_Cajero b = new C_Cajero();
 C_Cajero a = new C_Cajero();
 int xMouse,yMouse;
    public Cajero_Asientos() {
        this.setUndecorated(true);
        this.setSize(641,370);


        initComponents();   
        this.setLocationRelativeTo(null);
        
    // setSize(634,380);
   
        setResizable(false);
      
    buscar();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        volver = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PELICULAS", "CANTIDAD", "PRECIO", "HORARIO"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 570, 270));

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

        jRadioButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton1.setText("A1");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 60, -1));

        jRadioButton2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton2.setText("A2");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton3.setText("A3");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton4.setText("B1");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, 30));

        jRadioButton5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton5.setText("B2");
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, 30));

        jRadioButton6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton6.setText("B3");
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 30));

        jRadioButton7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton7.setText("C1");
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jRadioButton8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton8.setText("C2");
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 286, -1, 30));

        jRadioButton9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton9.setText("C3");
        jPanel1.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jRadioButton10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton10.setText("D1");
        jPanel1.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jRadioButton11.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton11.setText("D2");
        jPanel1.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 30));

        jRadioButton12.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(204, 153, 0));
        jRadioButton12.setText("D3");
        jPanel1.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(4, 30, 65));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA 1", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 40));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ga.png"))); // NOI18N
        volver.setContentAreaFilled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 80, 80));

        comprar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        comprar.setText("COMPRAR");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel1.add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/linea.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cineplanet-logo2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 30, 65));
        jLabel1.setText("Asientos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 270));

        jLabel5.setBackground(new java.awt.Color(4, 30, 65));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 640, 110));

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu_cajero form = new Menu_cajero();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
Registrar();
    }//GEN-LAST:event_comprarActionPerformed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
     
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse=evt.getX();
       yMouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
       int x=evt.getXOnScreen();
              int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

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
            java.util.logging.Logger.getLogger(Cajero_Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero_Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero_Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero_Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero_Asientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

public void Registrar(){
     if(jRadioButton1.isSelected()){b.Guardar1(jComboBox1, jRadioButton1); jRadioButton1.setSelected(false); jRadioButton1.setEnabled(false); }
 if(jRadioButton2.isSelected()){b.Guardar1(jComboBox1, jRadioButton2);jRadioButton2.setSelected(false); jRadioButton2.setEnabled(false);} 
 if(jRadioButton3.isSelected()){b.Guardar1(jComboBox1, jRadioButton3);jRadioButton3.setSelected(false); jRadioButton3.setEnabled(false);} 
 if(jRadioButton4.isSelected()){b.Guardar1(jComboBox1, jRadioButton4);jRadioButton4.setSelected(false); jRadioButton4.setEnabled(false);} 
 if(jRadioButton5.isSelected()){b.Guardar1(jComboBox1, jRadioButton5);jRadioButton5.setSelected(false); jRadioButton5.setEnabled(false);} 
 if(jRadioButton6.isSelected()){b.Guardar1(jComboBox1, jRadioButton6);jRadioButton6.setSelected(false); jRadioButton6.setEnabled(false);} 
 if(jRadioButton7.isSelected()){b.Guardar1(jComboBox1, jRadioButton7);jRadioButton7.setSelected(false); jRadioButton7.setEnabled(false);} 
 if(jRadioButton8.isSelected()){b.Guardar1(jComboBox1, jRadioButton8);jRadioButton8.setSelected(false); jRadioButton8.setEnabled(false);} 
 if(jRadioButton9.isSelected()){b.Guardar1(jComboBox1, jRadioButton9);jRadioButton9.setSelected(false); jRadioButton9.setEnabled(false);} 
 if(jRadioButton10.isSelected()){b.Guardar1(jComboBox1, jRadioButton10);jRadioButton10.setSelected(false); jRadioButton10.setEnabled(false);} 
 if(jRadioButton11.isSelected()){b.Guardar1(jComboBox1, jRadioButton11);jRadioButton11.setSelected(false); jRadioButton11.setEnabled(false);} 
   if(jRadioButton12.isSelected()){b.Guardar1(jComboBox1, jRadioButton12);jRadioButton12.setSelected(false); jRadioButton12.setEnabled(false);} 
    
} public void buscar(){
   
    b.BuscarAsientos(jRadioButton1, jComboBox1);
    b.BuscarAsientos(jRadioButton2, jComboBox1);
    b.BuscarAsientos(jRadioButton3, jComboBox1);
    b.BuscarAsientos(jRadioButton4, jComboBox1);
    b.BuscarAsientos(jRadioButton5, jComboBox1);
    b.BuscarAsientos(jRadioButton6, jComboBox1);
    b.BuscarAsientos(jRadioButton7, jComboBox1);
    b.BuscarAsientos(jRadioButton8, jComboBox1);
    b.BuscarAsientos(jRadioButton9, jComboBox1);
    b.BuscarAsientos(jRadioButton10, jComboBox1);
    b.BuscarAsientos(jRadioButton11, jComboBox1);
    b.BuscarAsientos(jRadioButton12, jComboBox1);



}
}
