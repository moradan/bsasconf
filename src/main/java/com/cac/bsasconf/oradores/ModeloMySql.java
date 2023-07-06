package com.cac.bsasconf.oradores;

import com.cac.bsasconf.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloMySql implements Modelo {
     
    @Override
    public ArrayList<Orador> getOradores() {
        try {
            ArrayList<Orador> listaOradores = new ArrayList<>();
            Connection coneccion = ConexionOradores.getConnection();
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
    public int addOrador(Orador Orador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
