/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import cinet_planet.Conexion;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class pelicula {
    String id;
    String nombre;
    String precio;
    
    public pelicula() {
    }
    public pelicula(String id, String nombre, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public pelicula(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }
    public void insertar( JTextField paranombre, JTextField paraprecio) {
        setNombre(paranombre.getText());
        setPrecio(paraprecio.getText());
        
         Conexion a = new Conexion();
         
         String consulta = ("insert into pelicula(nombre_pel,precio_pel) VALUES(?,?)");
        try {
            CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
            
            c.setString(1, getNombre());
            c.setString(2, getPrecio());
            
            c.execute();
            JOptionPane.showMessageDialog(null, "Pelicula Agregado Correctamente");
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
    public void MostrarDatos(JTable paramTablaC) {

        Conexion a = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaC.setRowSorter(OrdenarTabla);
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("precio");

        paramTablaC.setModel(modelo);

        sql = "SELECT * FROM pelicula";

        //String[] datos = new String[8];
        Object[] datos = new Object[3];
        Statement st;
        try {
            st = a.conexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
           }
            paramTablaC.setModel(modelo);

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "No se puede mostrar el registro: " + e.toString());
            System.out.println("Error mostrar datos: "+e);
        }
    }
    public void EliminarPel(JTable paraTabla) {
        int fila = paraTabla.getSelectedRow();
        String valor = paraTabla.getValueAt(fila, 0).toString();

        Conexion a = new Conexion();
        String consulta = "Delete from pelicula where id_pel='" + valor + "'";
        try {
            CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);

            c.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pelicula eliminado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Editar(JTextField paraid, JTextField paranombre, JTextField paraprecio) {
        setId(paraid.getText());
        setNombre(paranombre.getText());
        setPrecio(paraprecio.getText());
        if (paranombre.equals("") || paraprecio.equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene los datos");
        } else {

            Conexion a = new Conexion();
            String consulta = "UPDATE pelicula SET nombre_pel=?, precio_pel=?  WHERE id_pel=?";
            try {
                CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);

                c.setString(1, getNombre());
                c.setString(2, getPrecio());
                c.setString(3, getId());
                
                c.execute();
                JOptionPane.showMessageDialog(null, "Pelicula modificado");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al modificar" + e.toString());
                System.out.println(e);
            }

        }
    }

    public pelicula BuscarPelicula(String paraid) {

        Conexion a = new Conexion();
        Connection con;
        PreparedStatement pt;
        ResultSet rs;

        pelicula objPelicula = null;

        try {
            con = a.conexion();
            pt = con.prepareStatement("select * from pelicula where id_pel=?");
            pt.setString(1, paraid.toString());
            rs = pt.executeQuery();

            if (rs.next()) {
                objPelicula = new pelicula();
                objPelicula.setId(rs.getString(1));
                objPelicula.setNombre(rs.getString(2));
                objPelicula.setPrecio(rs.getString(3));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al BuscarClientes" + e.toString());
        }

        return objPelicula;
    }


}
