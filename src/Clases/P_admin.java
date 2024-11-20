
package Clases;

import Vista.Menu_administrador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import cinet_planet.Conexion;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class P_admin extends Persona {
  int resultadoG=0;
   String usuarioG;
  String contraseñaG;

    public P_admin(String usuarioG, String contraseñaG, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.usuarioG = usuarioG;
        this.contraseñaG = contraseñaG;
    }

  
   public P_admin() {
      
    }

   
  public int getResultadoG() {
        return resultadoG;
    }

    public void setResultadoG(int resultadoG) {
        this.resultadoG = resultadoG;
    }
  
    public String getUsuarioG() {
        return usuarioG;
    }

    public void setUsuarioG(String usuarioG) {
        this.usuarioG = usuarioG;
    }

    public String getContraseñaG() {
        return contraseñaG;
    }

    public void setContraseñaG(String contraseñaG) {
        this.contraseñaG = contraseñaG;
    }

   

   public void ValidarGerente (JTextField txtUsuario, JPasswordField txtContraseña) {
    
  
    
        try{
         Conexion a = new Conexion ();
         Connection cc=(Connection) a.conexion();
         String usuario=txtUsuario.getText();
         String password=String.valueOf(txtContraseña.getText());
         String sql =" select * from login where usu_log='"+usuario+"'and contr_log='"+password+"'";
         Statement st=cc.createStatement();
         ResultSet rs=st.executeQuery(sql);
         if(rs.next()){
         resultadoG=1;
         if(resultadoG==1){
             Menu_administrador form =new Menu_administrador();
             form.setVisible(true);
           
            // JOptionPane.showMessageDialog(null, " Bienvenido gerente ");}       
         }}
         
   
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a base de datos"+e.getMessage());     
    }               
    
    }  
}
