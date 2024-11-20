
package Clases;

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
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Compra {

    String id;
    String nombre_pelicula;
    double precio;
    double total;
    int cantidad;
    pelicula p;

    public Compra(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra() {
    }

    public Compra(String id, String nombre_pelicula, double precio, double total) {
        this.id = id;
        this.nombre_pelicula = nombre_pelicula;
        this.precio = precio;
        this.total = total;
    }

    public pelicula getP() {
        return p;
    }

    public void setP(pelicula p) {
        this.p = p;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void listar(JComboBox paracombo) {

        Conexion a = new Conexion();
        pelicula p;

        String consulta = ("SELECT * from pelicula");

        try {
            //preparamos la consulta
            PreparedStatement pst = a.conexion().prepareCall(consulta);

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

            paracombo.addItem("Seleccione una pelicula");

            while (result.next()) {

                paracombo.addItem(result.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void BuscarPel(JComboBox paracombo, JLabel paraprecio, JLabel paraid) {

        Conexion a = new Conexion();

        PreparedStatement pst = null;

        String consulta3 = ("SELECT * from pelicula WHERE nombre_pel=?");

        try {

            Object id = paracombo.getSelectedItem().toString();

            //JOptionPane.showMessageDialog(paracombo, id);
            //preparamos la consulta
            pst = a.conexion().prepareCall(consulta3);
            pst.setString(1, String.valueOf(id));

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

            if (result.next()) {
                //JOptionPane.showMessageDialog(paracombo, result.getString(1));
                paraprecio.setText(result.getString(3));
                paraid.setText(result.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CalcularTotal(JSpinner paraspinner, JLabel paratotal, JLabel paraprecio) {

        Integer valor = (Integer) paraspinner.getValue();
        setCantidad(valor);

        int pre = Integer.parseInt(paraprecio.getText());
        double total1 = valor * pre;
        paratotal.setText(""+total1);
    }

    public void insertar(JLabel paraid, JSpinner paracantidad, JLabel paratotal) {

        pelicula p = new pelicula();
        p.setId(paraid.getText());
        setP(p);
        Integer valor = (Integer)paracantidad.getValue(); setCantidad(valor);
        setTotal(Double.parseDouble(paratotal.getText()));

        Conexion a = new Conexion();

        String consulta = ("insert into detalle_pel(cantidad_dp,precio_total,id_pel) VALUES(?,?,?)");
        try {

            CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);

            c.setInt(1, getCantidad());
            c.setDouble(2, getTotal());
            c.setString(3, getP().getId());

            c.execute();
            JOptionPane.showMessageDialog(null, "detalle producto Agregado Correctamente");

        } catch (SQLException e) {
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
        modelo.addColumn("PELICULA");
        modelo.addColumn("PRECIO");
        modelo.addColumn("Cantidad");
        modelo.addColumn("TOTAL");

        paramTablaC.setModel(modelo);

        sql = "SELECT dp.id_dp,p.nombre_pel,p.precio_pel,dp.cantidad_dp,dp.precio_total FROM detalle_pel dp inner join pelicula p on (dp.id_pel = p.id_pel)";

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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void EliminarPel(JTable paraTabla) {
        int fila = paraTabla.getSelectedRow();
        String valor = paraTabla.getValueAt(fila, 0).toString();

        Conexion a = new Conexion();
        String consulta = "Delete from detalle_pel where id_dp='" + valor + "'";
        try {
            CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);

            c.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pelicula eliminado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
