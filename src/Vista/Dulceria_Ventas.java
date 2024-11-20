/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import cinet_planet.*;
import Animacion.Animacion;
import Clases.C_Cajero;
import Clases.Dulceria;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan
 */
public class Dulceria_Ventas extends javax.swing.JFrame {
int Contador;
int Contador2;
int Contador3;
int Contador4;
int Contador5;
int Contador6;
int Contador7;
int Contador8;
int Contador9;
int Contador10;
int precio;


 C_Cajero a = new C_Cajero();
 Dulceria b = new Dulceria();
    public Dulceria_Ventas() {
              this.setUndecorated(true);
this.setSize(1027,680);

        initComponents();   
        this.setLocationRelativeTo(null);
    // setSize(634,380);
    //Línea 1
       
        setResizable(false);
     
        
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dos = new javax.swing.JSeparator();
        comprar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        uno = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        Pago = new javax.swing.JInternalFrame();
        Canchita2 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Cancha = new javax.swing.JInternalFrame();
        Canchita = new javax.swing.JPanel();
        Panel_Producto1 = new javax.swing.JPanel();
        nombrep1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        preciop1 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        mas = new javax.swing.JLabel();
        menos = new javax.swing.JLabel();
        cantidadp1 = new javax.swing.JLabel();
        Panel_Producto2 = new javax.swing.JPanel();
        nombrep2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        preciop2 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        mas1 = new javax.swing.JLabel();
        menos1 = new javax.swing.JLabel();
        cantidadp2 = new javax.swing.JLabel();
        Panel_Producto3 = new javax.swing.JPanel();
        nombrep3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        preciop3 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        mas2 = new javax.swing.JLabel();
        menos2 = new javax.swing.JLabel();
        cantidadp3 = new javax.swing.JLabel();
        Panel_Producto4 = new javax.swing.JPanel();
        nombrep4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        preciop4 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        mas5 = new javax.swing.JLabel();
        menos5 = new javax.swing.JLabel();
        cantidadp4 = new javax.swing.JLabel();
        Panel_Producto5 = new javax.swing.JPanel();
        nombrep5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        preciop5 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        mas8 = new javax.swing.JLabel();
        menos8 = new javax.swing.JLabel();
        cantidadp5 = new javax.swing.JLabel();
        Panel_Producto6 = new javax.swing.JPanel();
        nombrep6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        preciop6 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        mas6 = new javax.swing.JLabel();
        menos6 = new javax.swing.JLabel();
        cantidadp6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BebidasyOtros = new javax.swing.JInternalFrame();
        Canchita1 = new javax.swing.JPanel();
        Panel_Producto10 = new javax.swing.JPanel();
        nombrep10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        preciop10 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        mas9 = new javax.swing.JLabel();
        menos9 = new javax.swing.JLabel();
        cantidadp10 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        Panel_Producto9 = new javax.swing.JPanel();
        nombrep9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        preciop9 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        mas7 = new javax.swing.JLabel();
        menos7 = new javax.swing.JLabel();
        cantidadp9 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        Panel_Producto8 = new javax.swing.JPanel();
        nombrep8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        preciop8 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        mas4 = new javax.swing.JLabel();
        menos4 = new javax.swing.JLabel();
        cantidadp8 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        Panel_Producto7 = new javax.swing.JPanel();
        nombrep7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        preciop7 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        mas3 = new javax.swing.JLabel();
        menos3 = new javax.swing.JLabel();
        cantidadp7 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(229, 2, 70));
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 1040, 5));

        jLabel19.setBackground(new java.awt.Color(229, 2, 70));
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1040, 5));

        jSeparator1.setForeground(new java.awt.Color(4, 30, 65));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 220, 20));

        dos.setForeground(new java.awt.Color(214, 215, 218));
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 464, 220, 20));

        comprar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/continuar_.png"))); // NOI18N
        comprar.setBorder(null);
        comprar.setBorderPainted(false);
        comprar.setContentAreaFilled(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel1.add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 597, 160, 100));

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 50, 50));

        jSeparator3.setForeground(new java.awt.Color(4, 30, 65));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 20));

        uno.setForeground(new java.awt.Color(214, 215, 218));
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 374, 220, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bebidas y otros");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 40));

        jLabel5.setBackground(new java.awt.Color(4, 30, 90));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 1050, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cineplanet-logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 80, 330, 190));

        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dulceria.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 490, 80));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Canchita");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 40));

        jLabel16.setBackground(new java.awt.Color(0, 74, 140));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 73));

        jLabel4.setBackground(new java.awt.Color(246, 246, 246));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 260, 560));

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pago.setBackground(new java.awt.Color(153, 153, 153));
        Pago.setVisible(true);
        Pago.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Canchita2.setBackground(new java.awt.Color(102, 102, 102));
        Canchita2.setOpaque(false);
        Canchita2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pago3.png"))); // NOI18N
        Canchita2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 620, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Canchita2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 400, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btn_2.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        Canchita2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtcod.setBackground(new java.awt.Color(231, 236, 240));
        txtcod.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtcod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcod.setBorder(null);
        Canchita2.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 400, 30));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(4, 30, 65));
        jLabel21.setText("Ingrese su codigo de caja - Dulceria");
        Canchita2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel59.setBackground(new java.awt.Color(231, 236, 240));
        jLabel59.setForeground(new java.awt.Color(255, 51, 51));
        jLabel59.setOpaque(true);
        Canchita2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, 550));

        Pago.getContentPane().add(Canchita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 550));

        jDesktopPane2.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 790, 580));

        Cancha.setBackground(new java.awt.Color(153, 153, 153));
        Cancha.setVisible(true);
        Cancha.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Canchita.setBackground(new java.awt.Color(102, 102, 102));
        Canchita.setOpaque(false);
        Canchita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Producto1.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep1.setForeground(new java.awt.Color(51, 51, 51));
        nombrep1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep1.setText("Canchita Gigante Mix");
        Panel_Producto1.add(nombrep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 30, 65));
        jLabel1.setText("S/.");
        Panel_Producto1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/producto-1.png"))); // NOI18N
        Panel_Producto1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -10, 160, 160));

        preciop1.setBackground(new java.awt.Color(4, 30, 65));
        preciop1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop1.setForeground(new java.awt.Color(4, 30, 65));
        preciop1.setText("25");
        Panel_Producto1.add(preciop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel101.setBackground(new java.awt.Color(214, 215, 218));
        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setOpaque(true);
        Panel_Producto1.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMouseClicked(evt);
            }
        });
        mas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                masKeyPressed(evt);
            }
        });
        Panel_Producto1.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosMouseClicked(evt);
            }
        });
        Panel_Producto1.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp1.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp1.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp1.setText("0");
        Panel_Producto1.add(cantidadp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, 190));

        Panel_Producto2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep2.setForeground(new java.awt.Color(51, 51, 51));
        nombrep2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep2.setText("Canchita Gigante Dulce");
        Panel_Producto2.add(nombrep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 30, 65));
        jLabel8.setText("S/.");
        Panel_Producto2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/WhatsApp Image 2022-07-15 at 9.51.55 PM.jpeg"))); // NOI18N
        Panel_Producto2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, -10, 130, 160));

        preciop2.setBackground(new java.awt.Color(4, 30, 65));
        preciop2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop2.setForeground(new java.awt.Color(4, 30, 65));
        preciop2.setText("20");
        Panel_Producto2.add(preciop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel107.setBackground(new java.awt.Color(214, 215, 218));
        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setOpaque(true);
        Panel_Producto2.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas1MouseClicked(evt);
            }
        });
        mas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas1KeyPressed(evt);
            }
        });
        Panel_Producto2.add(mas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos1MouseClicked(evt);
            }
        });
        Panel_Producto2.add(menos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp2.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp2.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp2.setText("0");
        Panel_Producto2.add(cantidadp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 160, 190));

        Panel_Producto3.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep3.setForeground(new java.awt.Color(51, 51, 51));
        nombrep3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep3.setText("Canchita Gigante ");
        Panel_Producto3.add(nombrep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 30, 65));
        jLabel10.setText("S/.");
        Panel_Producto3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto3.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/canchitasalada.jpeg"))); // NOI18N
        Panel_Producto3.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -10, 160, 160));

        preciop3.setBackground(new java.awt.Color(4, 30, 65));
        preciop3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop3.setForeground(new java.awt.Color(4, 30, 65));
        preciop3.setText("16");
        Panel_Producto3.add(preciop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel110.setBackground(new java.awt.Color(214, 215, 218));
        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setOpaque(true);
        Panel_Producto3.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas2MouseClicked(evt);
            }
        });
        mas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas2KeyPressed(evt);
            }
        });
        Panel_Producto3.add(mas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos2MouseClicked(evt);
            }
        });
        Panel_Producto3.add(menos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp3.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp3.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp3.setText("0");
        Panel_Producto3.add(cantidadp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 160, 190));

        Panel_Producto4.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep4.setForeground(new java.awt.Color(51, 51, 51));
        nombrep4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep4.setText("Canchita Grande");
        Panel_Producto4.add(nombrep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 30, 65));
        jLabel11.setText("S/.");
        Panel_Producto4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/csalada.jpeg"))); // NOI18N
        Panel_Producto4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 150, 150));

        preciop4.setBackground(new java.awt.Color(4, 30, 65));
        preciop4.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop4.setForeground(new java.awt.Color(4, 30, 65));
        preciop4.setText("12");
        Panel_Producto4.add(preciop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel113.setBackground(new java.awt.Color(214, 215, 218));
        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setOpaque(true);
        Panel_Producto4.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas5MouseClicked(evt);
            }
        });
        mas5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas5KeyPressed(evt);
            }
        });
        Panel_Producto4.add(mas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos5MouseClicked(evt);
            }
        });
        Panel_Producto4.add(menos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp4.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp4.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp4.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp4.setText("0");
        Panel_Producto4.add(cantidadp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 190));

        Panel_Producto5.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep5.setForeground(new java.awt.Color(51, 51, 51));
        nombrep5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep5.setText("Canchita Mediana");
        Panel_Producto5.add(nombrep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 30, 65));
        jLabel2.setText("S/.");
        Panel_Producto5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto5.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/canchita-2.jpeg"))); // NOI18N
        Panel_Producto5.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 150, 140));

        preciop5.setBackground(new java.awt.Color(4, 30, 65));
        preciop5.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop5.setForeground(new java.awt.Color(4, 30, 65));
        preciop5.setText("11");
        Panel_Producto5.add(preciop5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel104.setBackground(new java.awt.Color(214, 215, 218));
        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setOpaque(true);
        Panel_Producto5.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas8MouseClicked(evt);
            }
        });
        mas8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas8KeyPressed(evt);
            }
        });
        Panel_Producto5.add(mas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos8MouseClicked(evt);
            }
        });
        Panel_Producto5.add(menos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp5.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp5.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp5.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp5.setText("0");
        Panel_Producto5.add(cantidadp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 160, 190));

        Panel_Producto6.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep6.setForeground(new java.awt.Color(51, 51, 51));
        nombrep6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep6.setText("Canchita Mediana Dulce");
        Panel_Producto6.add(nombrep6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(4, 30, 65));
        jLabel12.setText("S/.");
        Panel_Producto6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto6.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/canchita-mediana.jpeg"))); // NOI18N
        Panel_Producto6.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -10, 150, 160));

        preciop6.setBackground(new java.awt.Color(4, 30, 65));
        preciop6.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop6.setForeground(new java.awt.Color(4, 30, 65));
        preciop6.setText("12");
        Panel_Producto6.add(preciop6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel116.setBackground(new java.awt.Color(214, 215, 218));
        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setOpaque(true);
        Panel_Producto6.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas6MouseClicked(evt);
            }
        });
        mas6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas6KeyPressed(evt);
            }
        });
        Panel_Producto6.add(mas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos6MouseClicked(evt);
            }
        });
        Panel_Producto6.add(menos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp6.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp6.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp6.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp6.setText("0");
        Panel_Producto6.add(cantidadp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        Canchita.add(Panel_Producto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 160, 190));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/log-canchita.png"))); // NOI18N
        Canchita.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 680, 90));

        jLabel18.setBackground(new java.awt.Color(231, 236, 240));
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setOpaque(true);
        Canchita.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));

        Cancha.getContentPane().add(Canchita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        jDesktopPane2.setLayer(Cancha, 550);
        jDesktopPane2.add(Cancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 790, 580));

        BebidasyOtros.setBackground(new java.awt.Color(153, 153, 153));
        BebidasyOtros.setVisible(true);
        BebidasyOtros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Canchita1.setBackground(new java.awt.Color(102, 102, 102));
        Canchita1.setOpaque(false);
        Canchita1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Producto10.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep10.setForeground(new java.awt.Color(51, 51, 51));
        nombrep10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep10.setText("Hot Dog Jumbo");
        Panel_Producto10.add(nombrep10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 30, 65));
        jLabel17.setText("S/.");
        Panel_Producto10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto10.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        preciop10.setBackground(new java.awt.Color(4, 30, 65));
        preciop10.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop10.setForeground(new java.awt.Color(4, 30, 65));
        preciop10.setText("12");
        Panel_Producto10.add(preciop10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel143.setBackground(new java.awt.Color(214, 215, 218));
        jLabel143.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setOpaque(true);
        Panel_Producto10.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas9MouseClicked(evt);
            }
        });
        mas9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas9KeyPressed(evt);
            }
        });
        Panel_Producto10.add(mas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos9MouseClicked(evt);
            }
        });
        Panel_Producto10.add(menos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp10.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp10.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp10.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp10.setText("0");
        Panel_Producto10.add(cantidadp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Salchicha.jpeg"))); // NOI18N
        Panel_Producto10.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -10, 150, 160));

        Canchita1.add(Panel_Producto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 160, 190));

        Panel_Producto9.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep9.setForeground(new java.awt.Color(51, 51, 51));
        nombrep9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep9.setText("Nachos");
        Panel_Producto9.add(nombrep9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 30, 65));
        jLabel15.setText("S/.");
        Panel_Producto9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto9.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        preciop9.setBackground(new java.awt.Color(4, 30, 65));
        preciop9.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop9.setForeground(new java.awt.Color(4, 30, 65));
        preciop9.setText("12");
        Panel_Producto9.add(preciop9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel140.setBackground(new java.awt.Color(214, 215, 218));
        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setOpaque(true);
        Panel_Producto9.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas7MouseClicked(evt);
            }
        });
        mas7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas7KeyPressed(evt);
            }
        });
        Panel_Producto9.add(mas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos7MouseClicked(evt);
            }
        });
        Panel_Producto9.add(menos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp9.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp9.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp9.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp9.setText("0");
        Panel_Producto9.add(cantidadp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nachos.jpeg"))); // NOI18N
        Panel_Producto9.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -10, 150, 160));

        Canchita1.add(Panel_Producto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 190));

        Panel_Producto8.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep8.setForeground(new java.awt.Color(51, 51, 51));
        nombrep8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep8.setText("CCBebida Mediana OL");
        Panel_Producto8.add(nombrep8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 30, 65));
        jLabel14.setText("S/.");
        Panel_Producto8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto8.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        preciop8.setBackground(new java.awt.Color(4, 30, 65));
        preciop8.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop8.setForeground(new java.awt.Color(4, 30, 65));
        preciop8.setText("9");
        Panel_Producto8.add(preciop8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel125.setBackground(new java.awt.Color(214, 215, 218));
        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setOpaque(true);
        Panel_Producto8.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas4MouseClicked(evt);
            }
        });
        mas4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas4KeyPressed(evt);
            }
        });
        Panel_Producto8.add(mas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos4MouseClicked(evt);
            }
        });
        Panel_Producto8.add(menos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp8.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp8.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp8.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp8.setText("0");
        Panel_Producto8.add(cantidadp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/template (1).png"))); // NOI18N
        Panel_Producto8.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 130));

        Canchita1.add(Panel_Producto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 160, 190));

        Panel_Producto7.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Producto7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrep7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombrep7.setForeground(new java.awt.Color(51, 51, 51));
        nombrep7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrep7.setText("CCBebida Grande OL");
        Panel_Producto7.add(nombrep7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(4, 30, 65));
        jLabel13.setText("S/.");
        Panel_Producto7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 20, 30));
        Panel_Producto7.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        preciop7.setBackground(new java.awt.Color(4, 30, 65));
        preciop7.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        preciop7.setForeground(new java.awt.Color(4, 30, 65));
        preciop7.setText("10");
        Panel_Producto7.add(preciop7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        jLabel123.setBackground(new java.awt.Color(214, 215, 218));
        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setOpaque(true);
        Panel_Producto7.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, 1));

        mas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mas.png"))); // NOI18N
        mas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mas3MouseClicked(evt);
            }
        });
        mas3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mas3KeyPressed(evt);
            }
        });
        Panel_Producto7.add(mas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, -1, 40));

        menos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menos.png"))); // NOI18N
        menos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menos3MouseClicked(evt);
            }
        });
        Panel_Producto7.add(menos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 40, -1));

        cantidadp7.setBackground(new java.awt.Color(4, 30, 65));
        cantidadp7.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        cantidadp7.setForeground(new java.awt.Color(4, 30, 65));
        cantidadp7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadp7.setText("0");
        Panel_Producto7.add(cantidadp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 40, 40));

        jLabel122.setBackground(new java.awt.Color(255, 255, 255));
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bebida.png"))); // NOI18N
        jLabel122.setOpaque(true);
        Panel_Producto7.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 140));

        Canchita1.add(Panel_Producto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 190));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/log-canchita.png"))); // NOI18N
        Canchita1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 670, 90));

        jLabel57.setBackground(new java.awt.Color(231, 236, 240));
        jLabel57.setForeground(new java.awt.Color(255, 51, 51));
        jLabel57.setOpaque(true);
        Canchita1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 550));

        BebidasyOtros.getContentPane().add(Canchita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 780, 550));

        jDesktopPane2.add(BebidasyOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 790, 580));

        jPanel1.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 74, 770, 536));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
   Cancha.setVisible(false);
   BebidasyOtros.setVisible(false);
      
 Pago.setVisible(true);

    }//GEN-LAST:event_comprarActionPerformed

    private void masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMouseClicked
        Contador++;
     
        String numero = String.valueOf(Contador);
        cantidadp1.setText(numero);
        int a = Integer.parseInt(cantidadp1.getText());
        
      int total = ((a*20)*100)/100;
        preciop1.setText(""+total);
         if (a==0) {
            int precio=20;
             preciop1.setText(""+precio);  
        }
    }//GEN-LAST:event_masMouseClicked

    private void masKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_masKeyPressed
      
    }//GEN-LAST:event_masKeyPressed

    private void menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosMouseClicked
        if(Contador>0){
            Contador--;
        
        String numero = String.valueOf(Contador);
        cantidadp1.setText(numero);
          int a = Integer.parseInt(cantidadp1.getText());
       int total = ((a*25)*100)/100;
        preciop1.setText(""+total);
        if (a==0) {
            int precio=25;
             preciop1.setText(""+precio);   
        }}else{
            JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menosMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Cancha.setVisible(true);
        Pago.setVisible(false);
        BebidasyOtros.setVisible(false);
        uno.setBackground(new Color(211,1,118));
        dos.setBackground(new Color(214,215,218));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         BebidasyOtros.setVisible(true);
        Cancha.setVisible(false);
         Pago.setVisible(false);
        uno.setBackground(new Color(214,215,218));
        dos.setBackground(new Color(211,1,118));
    }//GEN-LAST:event_jLabel7MouseClicked

    private void mas8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas8MouseClicked
         Contador5++;
     
        String numero = String.valueOf(Contador5);
        cantidadp5.setText(numero);
        int a = Integer.parseInt(cantidadp5.getText());
        int total = ((a*11)*100)/100;
        preciop5.setText(""+total);
        if (a==0) {
        int precio=11;
        preciop5.setText(""+precio);  
        }
    }//GEN-LAST:event_mas8MouseClicked

    private void mas8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas8KeyPressed

    private void menos8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos8MouseClicked
               if(Contador5>0){
        Contador5--;
        
        String numero = String.valueOf(Contador5);
        cantidadp5.setText(numero);
        int a = Integer.parseInt(cantidadp5.getText());
        int total = ((a*11)*100)/100;
        preciop5.setText(""+total);
        if (a==0) {
        int precio=11;
        preciop5.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos8MouseClicked

    private void mas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas1MouseClicked
        Contador2++;
     
        String numero = String.valueOf(Contador2);
        cantidadp2.setText(numero);
        int a = Integer.parseInt(cantidadp2.getText());
        
        int total = ((a*25)*100)/100;
        preciop2.setText(""+total);
        if (a==0) {
        int precio=25;
        preciop2.setText(""+precio);  
        }
    }//GEN-LAST:event_mas1MouseClicked

    private void mas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas1KeyPressed
  
    }//GEN-LAST:event_mas1KeyPressed

    private void menos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos1MouseClicked
        if(Contador2>0){
        Contador2--;
        
        String numero = String.valueOf(Contador2);
        cantidadp2.setText(numero);
        int a = Integer.parseInt(cantidadp2.getText());
        int total = ((a*20)*100)/100;
        preciop2.setText(""+total);
        if (a==0) {
        int precio=20;
        preciop2.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos1MouseClicked

    private void mas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas2MouseClicked
               Contador3++;
     
        String numero = String.valueOf(Contador3);
        cantidadp3.setText(numero);
        int a = Integer.parseInt(cantidadp3.getText());
        
        int total = ((a*16)*100)/100;
        preciop3.setText(""+total);
        if (a==0) {
        int precio=16;
        preciop3.setText(""+precio);  
        }
    }//GEN-LAST:event_mas2MouseClicked

    private void mas2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas2KeyPressed
        
    }//GEN-LAST:event_mas2KeyPressed

    private void menos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos2MouseClicked
         if(Contador3>0){
        Contador3--;
        
        String numero = String.valueOf(Contador3);
        cantidadp3.setText(numero);
        int a = Integer.parseInt(cantidadp3.getText());
        int total = ((a*16)*100)/100;
        preciop3.setText(""+total);
        if (a==0) {
        int precio=16;
        preciop3.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos2MouseClicked

    private void mas5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas5MouseClicked
             Contador4++;
     
        String numero = String.valueOf(Contador4);
        cantidadp4.setText(numero);
        int a = Integer.parseInt(cantidadp4.getText());
        
        int total = ((a*12)*100)/100;
        preciop4.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop4.setText(""+precio);  
        }
    }//GEN-LAST:event_mas5MouseClicked

    private void mas5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas5KeyPressed

    private void menos5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos5MouseClicked
              if(Contador4>0){
        Contador4--;
        
        String numero = String.valueOf(Contador4);
        cantidadp4.setText(numero);
        int a = Integer.parseInt(cantidadp4.getText());
        int total = ((a*12)*100)/100;
        preciop4.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop4.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos5MouseClicked

    private void mas6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas6MouseClicked
        Contador6++;
     
        String numero = String.valueOf(Contador6);
        cantidadp6.setText(numero);
        int a = Integer.parseInt(cantidadp6.getText());
        
        int total = ((a*12)*100)/100;
        preciop6.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop6.setText(""+precio);  
        }
    }//GEN-LAST:event_mas6MouseClicked

    private void mas6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas6KeyPressed

    private void menos6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos6MouseClicked
               if(Contador6>0){
        Contador6--;
        
        String numero = String.valueOf(Contador6);
        cantidadp6.setText(numero);
        int a = Integer.parseInt(cantidadp6.getText());
        int total = ((a*12)*100)/100;
        preciop6.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop6.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos6MouseClicked

    private void mas3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas3MouseClicked
      Contador7++;
     
        String numero = String.valueOf(Contador7);
        cantidadp7.setText(numero);
        int a = Integer.parseInt(cantidadp7.getText());
        
        int total = ((a*10)*100)/100;
        preciop7.setText(""+total);
        if (a==0) {
        int precio=10;
        preciop7.setText(""+precio);  
        }
    }//GEN-LAST:event_mas3MouseClicked

    private void mas3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas3KeyPressed

    private void menos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos3MouseClicked
           if(Contador7>0){
        Contador7--;
        
        String numero = String.valueOf(Contador7);
        cantidadp7.setText(numero);
        int a = Integer.parseInt(cantidadp7.getText());
        int total = ((a*10)*100)/100;
        preciop7.setText(""+total);
        if (a==0) {
        int precio=10;
        preciop7.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos3MouseClicked

    private void mas4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas4MouseClicked
          Contador8++;
     
        String numero = String.valueOf(Contador8);
        cantidadp8.setText(numero);
        int a = Integer.parseInt(cantidadp8.getText());
        
        int total = ((a*9)*100)/100;
        preciop8.setText(""+total);
        if (a==0) {
        int precio=9;
        preciop8.setText(""+precio);  
        }
    }//GEN-LAST:event_mas4MouseClicked

    private void mas4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas4KeyPressed

    private void menos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos4MouseClicked
           if(Contador8>0){
        Contador8--;
        
        String numero = String.valueOf(Contador8);
        cantidadp8.setText(numero);
        int a = Integer.parseInt(cantidadp8.getText());
        int total = ((a*9)*100)/100;
        preciop8.setText(""+total);
        if (a==0) {
        int precio=9;
        preciop8.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos4MouseClicked

    private void mas7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas7MouseClicked
        Contador9++;
     
        String numero = String.valueOf(Contador9);
        cantidadp9.setText(numero);
        int a = Integer.parseInt(cantidadp9.getText());
        
        int total = ((a*12)*100)/100;
        preciop9.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop8.setText(""+precio);  
        }
    }//GEN-LAST:event_mas7MouseClicked

    private void mas7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas7KeyPressed

    private void menos7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos7MouseClicked
         if(Contador9>0){
        Contador9--;
        
        String numero = String.valueOf(Contador9);
        cantidadp9.setText(numero);
        int a = Integer.parseInt(cantidadp9.getText());
        int total = ((a*12)*100)/100;
        preciop9.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop9.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos7MouseClicked

    private void mas9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mas9MouseClicked
          Contador10++;
     
        String numero = String.valueOf(Contador10);
        cantidadp10.setText(numero);
        int a = Integer.parseInt(cantidadp10.getText());
        
        int total = ((a*12)*100)/100;
        preciop10.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop10.setText(""+precio);  
        }
    }//GEN-LAST:event_mas9MouseClicked

    private void mas9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mas9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mas9KeyPressed

    private void menos9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menos9MouseClicked
           if(Contador10>0){
        Contador10--;
        
        String numero = String.valueOf(Contador10);
        cantidadp10.setText(numero);
        int a = Integer.parseInt(cantidadp10.getText());
        int total = ((a*12)*100)/100;
        preciop10.setText(""+total);
        if (a==0) {
        int precio=12;
        preciop10.setText(""+precio);   
        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese una mayor cantidad");
        }
    }//GEN-LAST:event_menos9MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
      GuardarCompras();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Menu_confitero a = new Menu_confitero();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dulceria_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dulceria_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dulceria_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dulceria_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Dulceria_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame BebidasyOtros;
    private javax.swing.JInternalFrame Cancha;
    private javax.swing.JPanel Canchita;
    private javax.swing.JPanel Canchita1;
    private javax.swing.JPanel Canchita2;
    private javax.swing.JInternalFrame Pago;
    private javax.swing.JPanel Panel_Producto1;
    private javax.swing.JPanel Panel_Producto10;
    private javax.swing.JPanel Panel_Producto2;
    private javax.swing.JPanel Panel_Producto3;
    private javax.swing.JPanel Panel_Producto4;
    private javax.swing.JPanel Panel_Producto5;
    private javax.swing.JPanel Panel_Producto6;
    private javax.swing.JPanel Panel_Producto7;
    private javax.swing.JPanel Panel_Producto8;
    private javax.swing.JPanel Panel_Producto9;
    private javax.swing.JLabel cantidadp1;
    private javax.swing.JLabel cantidadp10;
    private javax.swing.JLabel cantidadp2;
    private javax.swing.JLabel cantidadp3;
    private javax.swing.JLabel cantidadp4;
    private javax.swing.JLabel cantidadp5;
    private javax.swing.JLabel cantidadp6;
    private javax.swing.JLabel cantidadp7;
    private javax.swing.JLabel cantidadp8;
    private javax.swing.JLabel cantidadp9;
    private javax.swing.JButton comprar;
    private javax.swing.JSeparator dos;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mas;
    private javax.swing.JLabel mas1;
    private javax.swing.JLabel mas2;
    private javax.swing.JLabel mas3;
    private javax.swing.JLabel mas4;
    private javax.swing.JLabel mas5;
    private javax.swing.JLabel mas6;
    private javax.swing.JLabel mas7;
    private javax.swing.JLabel mas8;
    private javax.swing.JLabel mas9;
    private javax.swing.JLabel menos;
    private javax.swing.JLabel menos1;
    private javax.swing.JLabel menos2;
    private javax.swing.JLabel menos3;
    private javax.swing.JLabel menos4;
    private javax.swing.JLabel menos5;
    private javax.swing.JLabel menos6;
    private javax.swing.JLabel menos7;
    private javax.swing.JLabel menos8;
    private javax.swing.JLabel menos9;
    private javax.swing.JLabel nombrep1;
    private javax.swing.JLabel nombrep10;
    private javax.swing.JLabel nombrep2;
    private javax.swing.JLabel nombrep3;
    private javax.swing.JLabel nombrep4;
    private javax.swing.JLabel nombrep5;
    private javax.swing.JLabel nombrep6;
    private javax.swing.JLabel nombrep7;
    private javax.swing.JLabel nombrep8;
    private javax.swing.JLabel nombrep9;
    private javax.swing.JLabel preciop1;
    private javax.swing.JLabel preciop10;
    private javax.swing.JLabel preciop2;
    private javax.swing.JLabel preciop3;
    private javax.swing.JLabel preciop4;
    private javax.swing.JLabel preciop5;
    private javax.swing.JLabel preciop6;
    private javax.swing.JLabel preciop7;
    private javax.swing.JLabel preciop8;
    private javax.swing.JLabel preciop9;
    private javax.swing.JTextField txtcod;
    private javax.swing.JSeparator uno;
    // End of variables declaration//GEN-END:variables
public void GuardarCompras(){
    int pre1 =Integer.parseInt(cantidadp1.getText());
    int pre2 = Integer.parseInt(cantidadp2.getText());
    int pre3 = Integer.parseInt(cantidadp3.getText());
    int pre4 = Integer.parseInt(cantidadp4.getText());
    int pre5 = Integer.parseInt(cantidadp5.getText());
    int pre6 = Integer.parseInt(cantidadp6.getText());
      int pre7 = Integer.parseInt(cantidadp7.getText());
        int pre8 = Integer.parseInt(cantidadp8.getText());
          int pre9 = Integer.parseInt(cantidadp9.getText());
            int pre10 = Integer.parseInt(cantidadp10.getText());
    if (pre1>0){
        b.Guardar(nombrep1, cantidadp1, preciop1,txtcod);
          Contador=0;
        String numero = String.valueOf(Contador);
        cantidadp1.setText(numero);
    } 
     if (pre2>0){
        b.Guardar(nombrep2, cantidadp2, preciop2,txtcod);
          Contador2=0;
        String numero = String.valueOf(Contador2);
        cantidadp2.setText(numero);
    } 
      if (pre3>0){
        b.Guardar(nombrep3, cantidadp3, preciop3,txtcod);
          Contador3=0;
        String numero = String.valueOf(Contador3);
        cantidadp3.setText(numero);
    } 
       if (pre4>0){
        b.Guardar(nombrep4, cantidadp4, preciop4,txtcod);
          Contador4=0;
        String numero = String.valueOf(Contador4);
        cantidadp4.setText(numero);
    } 
        if (pre5>0){
        b.Guardar(nombrep5, cantidadp5, preciop5,txtcod);
          Contador5=0;
        String numero = String.valueOf(Contador5);
        cantidadp5.setText(numero);
    } 
         if (pre6>0){
        b.Guardar(nombrep6, cantidadp6, preciop6,txtcod);
          Contador6=0;
        String numero = String.valueOf(Contador6);
        cantidadp6.setText(numero);
    } 
          if (pre7>0){
        b.Guardar(nombrep7, cantidadp7, preciop7,txtcod);
          Contador7=0;
        String numero = String.valueOf(Contador7);
        cantidadp7.setText(numero);
    } 
           if (pre8>0){
        b.Guardar(nombrep8, cantidadp8, preciop8,txtcod);
          Contador8=0;
        String numero = String.valueOf(Contador8);
        cantidadp8.setText(numero);
    } 
            if (pre9>0){
        b.Guardar(nombrep9, cantidadp9, preciop9,txtcod);
         Contador9=0;
        String numero = String.valueOf(Contador9);
        cantidadp9.setText(numero);
  
    } 
             if (pre10>0){
        b.Guardar(nombrep10, cantidadp10, preciop10,txtcod);
         Contador10=0;
        String numero = String.valueOf(Contador10);
        cantidadp10.setText(numero);
    } 
    if (pre1==0 &&pre2==0 && pre3==0 && pre4==0 && pre5==0 && pre6==0 && pre7==0 && pre8==0 && pre9==0 && pre10==0){
        JOptionPane.showMessageDialog(null, "Ingrese una compra");
    }
    
}
}
