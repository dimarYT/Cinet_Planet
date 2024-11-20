
package Clases;

import java.sql.CallableStatement;
import cinet_planet.Conexion;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Dulceria {
    int id;
    String nombre;
    int cod;
    int cantidad;
    double precio;
    double total;
public Dulceria(){
    
}
    public Dulceria(int id, String nombre, double precio,int cantidad,double total,int cod) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad=cantidad;
        this.total = total;
        this.cod= cod;
    }
     public int getCod(){
     return cod;
 }
 public void setCod(int cod){
     this.cod=cod;
 }
    public double getTotal(){
     return total;
 }
 public void setTotal(double total){
     this.total=total;
 }
 public int getCantidad(){
     return cantidad;
 }
 public void setCantidad(int cantidad){
     this.cantidad=cantidad;
 }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void Guardar(JLabel paranombre,JLabel paracantidad, JLabel paratotal,JTextField paracod){
         setCod(Integer.parseInt(paracod.getText()));
         setNombre(paranombre.getText());
          int ca = Integer.parseInt(paracantidad.getText());
          setCantidad(ca);
      
         double tot = Integer.parseInt(paratotal.getText());
         setTotal( tot);
            
         Conexion a = new Conexion ();
           
         String  consulta = ("insert into dulceria(nombre_dul,cantidad,precio_total,id_conf  ) VALUES(?,?,?,?)");
         try {
            
         
         CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
            
     
            c.setString(1,getNombre());
            c.setInt(2,getCantidad());
            c.setDouble(3,getTotal());
            c.setInt(4,getCod());
        
            
            c.execute();
            JOptionPane.showMessageDialog(null, "Compra Agregado Correctamente");
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null ,  e.toString());
        }
    
          
    
    } 
}
