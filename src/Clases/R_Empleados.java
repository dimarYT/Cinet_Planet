
package Clases;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import cinet_planet.Conexion;
import javax.crypto.spec.PSource;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class R_Empleados {
    String id;

    String nombre;
    String apellido;
    String correo;
    String dni;
    String telefo;
    String fecha;
    String socio;
public R_Empleados(){}
    public R_Empleados(String id, String nombre, String apellido, String correo, String dni, String telefo, String fecha, String socio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dni = dni;
        this.telefo = telefo;
        this.fecha = fecha;
        this.socio = socio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefo() {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }
    

     public void insertar(JTextField paranombre,JTextField paraapellido,JTextField
             paracorreo,JTextField paradni,JTextField paracelular,JDateChooser parafecha,JComboBox parasocio){
         
         setNombre(paranombre.getText());
         setApellido(paraapellido.getText());
         setCorreo(paracorreo.getText());
         setDni(paradni.getText());
         setTelefo(paracelular.getText());
         String fecha =((JTextField) parafecha.getDateEditor().getUiComponent()).getText();
         setFecha(fecha);
         String socio = parasocio.getSelectedItem().toString();
         setSocio(socio);
        
         Conexion a = new Conexion ();
        
            
       String  consulta = ("insert into cliente2(nombre,apellido,correo,dni,celular,fecha,socio) VALUES(?,?,?,?,?,?,?)");
        try {
            
         
         CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
            
     
            c.setString(1,getNombre());
            c.setString(2,getApellido());
            c.setString(3,getCorreo());
            c.setString(4,getDni());
            c.setString(5,getTelefo());
            c.setString(6,getFecha());
            c.setString(7,getSocio());
          
            
            c.execute();
            JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente");
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null ,  e.toString());
        }
    
          
    
    } 
    public void MostrarDatos(JTable paramTablaC){
        
         Conexion a = new Conexion ();
  
DefaultTableModel modelo=new DefaultTableModel();
TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
paramTablaC.setRowSorter(OrdenarTabla);
 
String sql="";

        modelo.addColumn("Id"); 
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
         modelo.addColumn("Correo");
          modelo.addColumn("Dni");
           modelo.addColumn("telefono");
                modelo.addColumn("fecha");
                     modelo.addColumn("socio");
 
     
       
        paramTablaC.setModel(modelo);
        
         sql = "SELECT * FROM cliente2";
         
            String[] datos = new String[8];
            Statement st;
            try {
                st= a.conexion().createStatement();
                ResultSet rs=st.executeQuery(sql);
                
                
                while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                 datos[2] = rs.getString(3);
                  datos[3] = rs.getString(4);
                   datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                     datos[6] = rs.getString(7);
                      datos[7] = rs.getString(8);
                 

                modelo.addRow(datos);}
                paramTablaC.setModel(modelo);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede mostrar el regustro" + e.toString());
            }
        
    } public void EliminarCli( JTable paraTabla ){
           int fila = paraTabla.getSelectedRow();
           String valor = paraTabla.getValueAt(fila, 0).toString();
    
       

            Conexion a = new Conexion();
        String consulta ="Delete from cliente2 where id='"+valor+"'";
            try {
                  CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
                 
                  c.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Usuario eliminado");
          
                    
            } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e);
            }
        
    }public void Editar(JTextField paraid,JTextField paranombre,JTextField
            paraapellido,JTextField paracorreo,JTextField paradni,JTextField
                    paracelular,JDateChooser parafecha,JComboBox parasocio){
           setId(paraid.getText());
         setNombre(paranombre.getText());
         setApellido(paraapellido.getText());
         setCorreo(paracorreo.getText());
         setDni(paradni.getText());
         setTelefo(paracelular.getText());
         setFecha(parafecha.getDateFormatString());
         setSocio(parasocio.getSelectedItem().toString());
          
            
            Conexion a = new Conexion();
            String consulta="UPDATE cliente2 SET nombre=?, apellido=?, correo=?,dni=?,celular=?,fecha=?,socio=?  where id=?";
            try { 
      CallableStatement c= (CallableStatement) a.conexion().prepareCall(consulta);
     
      c.setString(1,getNombre());
      c.setString(2,getApellido());
        c.setString(3,getCorreo());
          c.setString(4,getDni());
            c.setString(5,getTelefo());
              c.setString(6,getFecha());
              c.setString(7,getSocio());
        c.setString(8,getId());
 
      c.execute();
        JOptionPane.showMessageDialog(null, "Ingrediente modificado");
      
            } catch (Exception e) {
                      JOptionPane.showMessageDialog(null, "Error al modificar"+e.toString());
                System.out.println(e);
    }
    
            
}public R_Empleados BuscarCliente(String paraid) {

        Conexion a = new Conexion();
        Connection con;
        PreparedStatement pt;
        ResultSet rs;

        R_Empleados objCliente = null;

        try {
            con = a.conexion();
            pt = con.prepareStatement("select * from cliente2 where id=?");
            pt.setString(1, paraid.toString());
            rs = pt.executeQuery();

            if (rs.next()) {
                objCliente = new R_Empleados();
                objCliente.setId(rs.getString(1));
                objCliente.setNombre(rs.getString(2));
                objCliente.setApellido(rs.getString(3));
                objCliente.setCorreo(rs.getString(4));
                objCliente.setDni(rs.getString(5));
                objCliente.setTelefo(rs.getString(6));
                objCliente.setFecha(rs.getString(7));
                objCliente.setSocio(rs.getString(8));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al BuscarClientes" + e.toString());
        }

        return objCliente;
    }}
