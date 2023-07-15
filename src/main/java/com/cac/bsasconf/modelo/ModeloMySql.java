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
        final String SQL = "SELECT * FROM `oradores`";
        try (Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();) {
            
            ArrayList<Orador> listaOradores = new ArrayList<>();

            while(rs.next()) {
                listaOradores.add(parseOrador(rs));
            }
            return listaOradores;
        } catch(SQLException ex) {
           throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Orador getOrador(int id) {
        Orador oradorParaDevolver = null;
        final String SQL = "SELECT * FROM `oradores` WHERE `id` = ?";
        
        try (Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(SQL);){
            
            ps.setInt(1, id) ;
            try (ResultSet rs = ps.executeQuery();) {
                if(rs.next()) {
                    oradorParaDevolver = parseOrador(rs);
                } 
                return oradorParaDevolver;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error sql en getorador", ex);
        }
    }

    @Override
    public int addOrador(Orador orador) {
        final String SQL = "INSERT INTO `oradores` VALUES(null, ?, ?, ?, ?)";
        try (
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(SQL);) {
            
            fillPreparedStatement(ps, orador);
            
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public int updateOrador(Orador orador) {
        final String SQL = "UPDATE `oradores` SET `nombre` = ?, `apellido` = ?, `charla` = ? WHERE `id` = ?";
        try (
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(SQL);
            ) {
            
            fillPreparedStatement(ps, orador);
            
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public int removeOrador(int id) {
        final String SQL = "DELETE FROM `oradores` WHERE `id` = ?";
        try (
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(SQL);
            ){
            
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error en removeOrador() en ModeloMySql");
        }
    }
    
    /* rellena un objeto Orador con los campos de un ResultSet. El ResultSet tiene que venir de una tabla cuyas
    columnas sean compatibles y esten en el mismo orden que las propiedades de la clase Orador.
    */
    private Orador parseOrador(ResultSet rs) throws SQLException{
        int id = rs.getInt(1);
        String nombre = rs.getString(2);
        String apellido = rs.getString(3);
        String charla = rs.getString(4);
        String fechaAlta = rs.getString(5);
        
        return new Orador(id, nombre, apellido, charla, fechaAlta);
    }
    
    // rellena el prepared sql statement con los datos del objeto orador segun sea una accion de agregar o actualizar
    private void fillPreparedStatement(PreparedStatement ps, Orador orador) throws SQLException {
        ps.setString(1, orador.getNombre());
        ps.setString(2, orador.getApellido());
        ps.setString(3, orador.getCharla());
     
        
        if(orador.getId() == 0) {
            /* cuando el orador recibido tenga id=0 es un orador para agregar, el cuarto comodin de le exp sql
            sera la fecha de alta
            */
            ps.setString(4, orador.getFechaAlta());
        } else {
            /* cuando el orador tenga un id!=0 se tratara de un orador para actualizar: en ese caso la fecha de alta
            no forma parte del ps, y el cuarto comodin es el id en la clausula WHERE
            */
            ps.setInt(4, orador.getId());
            
        }
    }
}
