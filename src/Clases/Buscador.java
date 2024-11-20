/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import cinet_planet.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Buscador {

    public pelicula getP() {
        return p;
    }

    public void setP(pelicula p) {
        this.p = p;
    }

    public C_Cajero getC1() {
        return c1;
    }

    public void setC1(C_Cajero c1) {
        this.c1 = c1;
    }

    public P_cajer getC() {
        return c;
    }

    public void setC(P_cajer c) {
        this.c = c;
    }

    public Buscador(pelicula p, C_Cajero c1, P_cajer c) {
        this.p = p;
        this.c1 = c1;
        this.c = c;
    }
    pelicula p;
    C_Cajero c1;
    P_cajer c;
    public Buscador(){}
    
    public void listar(JComboBox paracombo) {

        Conexion a = new Conexion();
        pelicula p;

        String consulta = ("SELECT * from cajero");

        try {
            //preparamos la consulta
            PreparedStatement pst = a.conexion().prepareCall(consulta);

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

          

            while (result.next()) {

                paracombo.addItem(result.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     public void listar1(JComboBox paracombo) {

        Conexion a = new Conexion();
        pelicula p;

        String consulta = ("SELECT * from pelicula");

        try {
            //preparamos la consulta
            PreparedStatement pst = a.conexion().prepareCall(consulta);

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

          

            while (result.next()) {

                paracombo.addItem(result.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     public void listar2(JComboBox paracombo) {

        Conexion a = new Conexion();
        pelicula p;

        String consulta = ("SELECT * from sala");

        try {
            //preparamos la consulta
            PreparedStatement pst = a.conexion().prepareCall(consulta);

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

          

            while (result.next()) {

                paracombo.addItem(result.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    
    
    public void Buscador1(JComboBox paracajero) {

        Conexion a = new Conexion();

        PreparedStatement pst = null;

        String consulta1 = ("SELECT nombre_caj FROM cajero WHERE id_caj=?");

        try {

            Object cajero = paracajero.getSelectedItem().toString();

            //JOptionPane.showMessageDialog(paracombo, id);
            //preparamos la consulta
            pst = a.conexion().prepareCall(consulta1);
            pst.setString(1, String.valueOf(cajero));

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void Buscador2(JComboBox parapelicula) {

        Conexion a = new Conexion();

        PreparedStatement pst = null;

        String consulta3 = ("SELECT p.nombre_pel from detalle_pel dp INNER JOIN pelicula p ON (dp.id_pel = p.id_pel) WHERE dp.id_dp=?");

        try {

            Object pelicula = parapelicula.getSelectedItem().toString();

            //JOptionPane.showMessageDialog(paracombo, id);
            //preparamos la consulta
            pst = a.conexion().prepareCall(consulta3);
            pst.setString(1, String.valueOf(pelicula));

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void Buscador3(JComboBox parasala) {

        Conexion a = new Conexion();

        PreparedStatement pst = null;

        String consulta3 = ("SELECT num_asiento from sala WHERE id_sala =?");

        try {

            Object sala = parasala.getSelectedItem().toString();

            //JOptionPane.showMessageDialog(paracombo, id);
            //preparamos la consulta
            pst = a.conexion().prepareCall(consulta3);
            pst.setString(1, String.valueOf(sala));

            //Ejecutamos la consulta
            ResultSet result = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void insertar(JComboBox paracajero,JComboBox parapelicula,JComboBox parasala) {
    
        Conexion a = new Conexion();
        pelicula a1 = new pelicula();
        P_cajer a2 = new P_cajer();
        C_Cajero a3 = new C_Cajero();
        a1.setNombre(parapelicula.getSelectedItem().toString());
        setP(a1);
        a2.setNombre(paracajero.getSelectedItem().toString());
        setC(a2);
        a3.setAsiento(parasala.getSelectedItem().toString());
        setC1(a3);
        
        String consulta = ("insert into detalle_boleta_entradas(id_caj,id_dp,id_sala ) VALUES(?,?,?)");
        try {

            CallableStatement c = (CallableStatement) a.conexion().prepareCall(consulta);

            c.setString(1, getP().nombre);
            c.setString(2, getC().nombre);
            c.setString(3, getC1().asiento);

            c.execute();
            JOptionPane.showMessageDialog(null, "detalle producto Agregado Correctamente");

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
}

