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
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juan
 */
public class historial_conf {
    public void MostrarDatos(JTable paramTablaC) {

        Conexion a = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaC.setRowSorter(OrdenarTabla);
        String sql = "";

        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        modelo.addColumn("Codigo");
        paramTablaC.setModel(modelo);

        sql = "(SELECT  d.nombre_dul,d.cantidad,d.precio_total,c.identificacion_cof FROM dulceria d INNER JOIN confitero c ON (d.id_conf = c.id_conf));";

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
                modelo.addRow(datos);
           }
            paramTablaC.setModel(modelo);

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "No se puede mostrar el registro: " + e.toString());
            System.out.println("Error mostrar datos: "+e);
        }
    }
}
