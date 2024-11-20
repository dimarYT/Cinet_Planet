
package Clases;

import Vista.Menu_confitero;
import com.mysql.jdbc.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import cinet_planet.Conexion;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class P_cofi extends Persona {
        int id;
    int resultadoM=0;
    String usuarioM;
    String contraseñaM;
    Connection con;
    int numerom;
   
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
public  P_cofi() {}

    public P_cofi(int id, String usuarioM, String contraseñaM, Connection con, int numerom, PreparedStatement ps, ResultSet rs) {
        this.id = id;
        this.usuarioM = usuarioM;
        this.contraseñaM = contraseñaM;
        this.con = con;
        this.numerom = numerom;
        this.ps = ps;
        this.rs = rs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResultadoM() {
        return resultadoM;
    }

    public void setResultadoM(int resultadoM) {
        this.resultadoM = resultadoM;
    }

    public String getUsuarioM() {
        return usuarioM;
    }

    public void setUsuarioM(String usuarioM) {
        this.usuarioM = usuarioM;
    }

    public String getContraseñaM() {
        return contraseñaM;
    }

    public void setContraseñaM(String contraseñaM) {
        this.contraseñaM = contraseñaM;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public int getNumerom() {
        return numerom;
    }

    public void setNumerom(int numerom) {
        this.numerom = numerom;
    }

    public Conexion getCn() {
        return cn;
    }

    public void setCn(Conexion cn) {
        this.cn = cn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
    public void AgregarConfitero(JTextField paranombre,JTextField parausuario,JPasswordField paracontraseña,JTextField paracodigo){
        setNombre(paranombre.getText());
        setUsuarioM(parausuario.getText());
        setContraseñaM(paracontraseña.getText());
        setNumerom(Integer.parseInt(paracodigo.getText()));
        Conexion a = new Conexion ();
       
      String  consulta = ("insert into confitero(nombre_conf,usuario_conf,contrasena_conf,identificacion_cof) VALUES(?,?,?,?)");
      
        try {
           
             CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);
            
            c.setString(1,getNombre());
            c.setString(2,getUsuarioM());
            c.setString(3,getContraseñaM());
            c.setInt(4,getNumerom());
            c.executeUpdate();
            JOptionPane.showMessageDialog(null, "Confitero agregado");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al agregar "  +e.toString());
        }}

   public void ValidarConfitero(JTextField txtUsuario, JPasswordField txtContraseña) {
    
  
    try{
         Conexion c = new Conexion ();
         Connection cc=(Connection) c.conexion();
         String usuario=txtUsuario.getText();
         String password=String.valueOf(txtContraseña.getText());
         String sql =" select * from confitero where usuario_conf='"+usuario+"'and contrasena_conf='"+password+"'";
         Statement st=cc.createStatement();
         ResultSet rs=st.executeQuery(sql);
         if(rs.next()){
         resultadoM=1;
         if(resultadoM==1){
            
              Menu_confitero form =new Menu_confitero();
             
             form.setVisible(true);
              JOptionPane.showMessageDialog(null, " Bienvenido confitero");
         }
         }}catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a base de datos"+e.getMessage());     
    }}
    public void MostrarDatosConfitero(JTable paraTablaConfitero){
        
         Conexion a = new Conexion ();
  
DefaultTableModel modelo=new DefaultTableModel();
TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
paraTablaConfitero.setRowSorter(OrdenarTabla);
 
String sql="";

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Codigo");
        paraTablaConfitero.setModel(modelo);
        
         sql = "SELECT * FROM confitero";
         
            String[] datos = new String[5];
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
                modelo.addRow(datos);}
                paraTablaConfitero.setModel(modelo);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede mostrar el registro" + e.toString());
            }}
}
