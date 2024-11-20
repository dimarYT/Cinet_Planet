/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import cinet_planet.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;import Clases.pelicula;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juan
 */
public class historial_caj {
    
    public void MostrarDatos(JTable paramTablaC) {

        Conexion a = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaC.setRowSorter(OrdenarTabla);
        String sql = "";

        modelo.addColumn("Numero de sala");
        modelo.addColumn("Numero de asiento");
        modelo.addColumn("Pelicula");
        modelo.addColumn("Precio de pelicula");
        modelo.addColumn("Precio Total");
        paramTablaC.setModel(modelo);

        sql = "SELECT s.num_sala, s.num_asiento, p.nombre_pel, p.precio_pel, dp.precio_total FROM detalle_boleta_entradas dbe INNER JOIN cajero c ON (dbe.id_caj = c.id_caj) INNER JOIN detalle_pel dp ON (dbe.id_dp = dp.id_dp) INNER JOIN sala s ON (dbe.id_sala = s.id_sala) INNER JOIN pelicula p ON (dp.id_pel = p.id_pel);";

        //String[] datos = new String[8];
        Object[] datos = new Object[5];
        Statement st;
        try {
            st = a.conexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
           }
            paramTablaC.setModel(modelo);

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "No se puede mostrar el registro: " + e.toString());
            System.out.println("Error mostrar datos: "+e);
        }
    }
}
        
