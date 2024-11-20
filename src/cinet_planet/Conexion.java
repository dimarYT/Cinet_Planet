/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinet_planet;

/**
 *
 * @author Juan
 */
import cinet_planet.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Conexion {
    static Connection con = null;
 public static String URL="jdbc:mysql://localhost/cinetplanet";
public static  String USERNAME="root";
public static  String PASWORD="";

       public Connection conexion (){

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection)DriverManager.getConnection(URL,USERNAME,PASWORD);

    }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null, "Error de Conexion "+e.getMessage());
        System.out.println(e);
    }return con;
   
    }
       
       

 
}


