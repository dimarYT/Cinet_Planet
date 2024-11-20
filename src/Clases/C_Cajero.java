
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class C_Cajero {
    String id;
    String nombre_pelicula;
    Double precio;
    Double total;
String sala;
int cantidad;
        String asiento;
public C_Cajero(){}
    public C_Cajero(String id, String nombre_pelicula, Double precio, Double total, String sala, int cantidad, String asiento) {
        this.id = id;
        this.nombre_pelicula = nombre_pelicula;
        this.precio = precio;
        this.total = total;
        this.sala = sala;
        this.cantidad = cantidad;
        this.asiento = asiento;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
 
    
    public void listar (JComboBox paracombo){
        
        Conexion a = new Conexion ();
     
       
        String  consulta = ("SELECT * from peliculas");
        
        try {
            //preparamos la consulta
            PreparedStatement pst = a.conexion().prepareCall(consulta);
            
            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();
          
            paracombo.addItem("Seleccione una peliculas");
            
            while (result.next()) {
                
                paracombo.addItem(result.getString(2));
             
            }
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    
    public void BuscarPel (JComboBox paracombo, JLabel paraprecio){
        
        Conexion a = new Conexion ();
        
        PreparedStatement pst = null;
       
        String  consulta3 = ("SELECT precio from peliculas WHERE nombre=?");
        
        try {
            
            Object id = paracombo.getSelectedItem().toString();
            
            //JOptionPane.showMessageDialog(paracombo, id);
            
            //preparamos la consulta
             pst = a.conexion().prepareCall(consulta3);
            pst.setString(1, String.valueOf(id));
           
            
            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();
            
            if(result.next()){
                //JOptionPane.showMessageDialog(paracombo, result.getString(1));
               
                paraprecio.setText(result.getString(1));
                
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
     
        
     public void CalcularTotal(JSpinner paraspinner,JLabel paratotal,JLabel paraprecio){
        
         Integer valor = (Integer)paraspinner.getValue();
         setCantidad(valor);
        
         int pre = Integer.parseInt(paraprecio.getText());
        double total1=valor*pre;
        paratotal.setText("S/."+total1);
    }
        public void Guardar(JComboBox paracombo, JSpinner paraspinner,JLabel paraprecio,JLabel paratotal){
    
         String pel = paracombo.getSelectedItem().toString();
         setNombre_pelicula(pel);
         int sp = (int) paraspinner.getValue();
         setCantidad(sp);
         int pre = Integer.parseInt(paraprecio.getText());
         
            
            
         Conexion a = new Conexion ();
           
         String  consulta = ("insert into compra(peliculas,cantidad,precio,total) VALUES(?,?,?,?)");
         try {
            
         
         CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
            
     
            c.setString(1,getNombre_pelicula());
            c.setInt(2,getCantidad());
            c.setDouble(3,getPrecio());
            c.setDouble(4,getTotal());
        
            
            c.execute();
            JOptionPane.showMessageDialog(null, "Compra Agregado Correctamente");
            
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
        modelo.addColumn("Pelicula");
        modelo.addColumn("Precio");
         modelo.addColumn("Total");

        paramTablaC.setModel(modelo);
        
         sql = "SELECT * FROM pelicula";
         
            String[] datos = new String[4];
            Statement st;
            try {
                st= a.conexion().createStatement();
                ResultSet rs=st.executeQuery(sql);
                
                
                while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                 datos[2] = rs.getString(3);
                  datos[3] = rs.getString(4);
         
                 

                modelo.addRow(datos);}
                paramTablaC.setModel(modelo);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede mostrar el regustro" + e.toString());
            }
        
    } public  void Guardar1(JComboBox paracombo,JRadioButton pararadio){
          ResultSet rs;
          PreparedStatement ps;
         String a = paracombo.getSelectedItem().toString();
         setSala(a);
 
         String as = pararadio.getText();
            setAsiento(as);
            
            
         Conexion a1 = new Conexion ();
           
         String  consulta = ("insert into sala(num_sala,num_asiento) VALUES(?,?)");
         try {
            
         
         CallableStatement c = (CallableStatement) a1.conexion().prepareCall(consulta);
            
     
       
            c.setString(1,getSala());
            c.setString(2,getAsiento());
        
            
            c.execute();
            JOptionPane.showMessageDialog(null, "Compra Agregado Correctamente");
            
        } catch (Exception e) {
              System.out.println(e.toString());
        }
    
        
     
        
        }public void BuscarAsientos(JRadioButton paraasiento,JComboBox paracombo){
            setAsiento(paraasiento.getText());
             String b = paracombo.getSelectedItem().toString();
         setSala(b);
            Conexion a = new Conexion();
            String as;
            String sala1;
         try{
                Connection conexion = a.conexion();
             String consulta = "Select num_asiento,num_sala from sala";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs = pst.executeQuery();
                while (rs.next()){
                    as = rs.getString("asientos");
                    sala  = rs.getString("nsala");
                    if (as.equals(asiento) ) {
                        paraasiento.setEnabled(false);
                    }
                  
                }
         }catch (Exception ex) {
                System.out.println("Error"+ex);
            }
        }

}
    
    

