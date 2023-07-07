package com.cac.bsasconf.modelo;

import com.cac.bsasconf.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloMySql implements Modelo {
     
    @Override
    public ArrayList<Orador> getOradores() {
        try {
            ArrayList<Orador> listaOradores = new ArrayList<>();
            Connection coneccion = Conexion.getConnection();
            PreparedStatement ps = coneccion.prepareStatement("SELECT * FROM `oradores`");
            ResultSet rs = ps.executeQuery();

            while( rs.next() ) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String charla = rs.getString(4);
                String fechaAlta = rs.getString(5);

                listaOradores.add(new Orador(id, nombre, apellido, charla, fechaAlta));
            }

            return listaOradores;
        } catch(SQLException ex) {
           throw new RuntimeException("Error al leer oradores de MySQL", ex);
        }
    }

    @Override
    public Orador getOrador(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int addOrador(Orador orador) {
        try {
            // establezco conexion con la base de datos
            Connection coneccion = Conexion.getConnection();
            
            // preparo la sql query
            String sql = "INSERT INTO `oradores` VALUES(null, ?, ?, ?, ?)";
            PreparedStatement ps = coneccion.prepareStatement(sql);
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getCharla());
            ps.setString(4, orador.getFechaAlta());
            return ps.executeUpdate();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Error de conexion SQL", ex);
        }
    }

    @Override
    public int updateOrador(Orador Orador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int removeOrador(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
