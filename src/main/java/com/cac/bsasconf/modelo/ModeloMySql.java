package com.cac.bsasconf.modelo;

import com.cac.bsasconf.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloMySql implements Modelo {
     
    @Override
    public ArrayList<Orador> getOradores() {
        try (
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM `oradores`");
            ResultSet rs = ps.executeQuery();
                ) {
            ArrayList<Orador> listaOradores = new ArrayList<>();

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
           throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Orador getOrador(int id) {
        Orador oradorParaDevolver = null;
        String sql = "SELECT * FROM `oradores` WHERE `id` = ?";
        
        try (Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(sql);)
        {
            ps.setInt(1, id) ;
            try (ResultSet rs = ps.executeQuery();) {
                if(rs.next()) {
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String charla = rs.getString(4);
                    String fechaAlta = rs.getString(5);

                    oradorParaDevolver = new Orador(id, nombre, apellido, charla, fechaAlta);
                } 
                return oradorParaDevolver;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error sql en getorador", ex);
        }
    }

    @Override
    public int addOrador(Orador orador) {
        String sql = "INSERT INTO `oradores` VALUES(null, ?, ?, ?, ?)";
        try (
            // Establezco conexion con MySQL    
            Connection conexion = Conexion.getConnection();
            // Genero la expresion MySQL que se usara para hacer el update
            PreparedStatement ps = conexion.prepareStatement(sql);) {
            
            //Completo los datos faltantes
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getCharla());
            ps.setString(4, orador.getFechaAlta());
            
            // ejecuto la insercion del registro y termina el metodo
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error de conexion SQL", ex);
        }
    }

    @Override
    public int updateOrador(Orador orador) {
        try {
            // Establezco conexion con la base de datos
            Connection conexion = Conexion.getConnection();

            // Preparo la sentencia sql
            String sql = "UPDATE `oradores` SET `nombre` = ?, `apellido` = ?, `charla` = ? WHERE `id` = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getCharla());
            ps.setInt(4, orador.getId());

            // Ejecuto el update y termino el metodo
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public int removeOrador(int id) {
        String sql = "DELETE FROM `oradores` WHERE `id` = ?";
        try (
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(sql);
                ){
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error en removeOrador() en ModeloMySql");
        }
    }
}
