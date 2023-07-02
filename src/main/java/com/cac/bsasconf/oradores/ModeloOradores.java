package com.cac.bsasconf.oradores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloOradores {
     
    public ArrayList<Orador> getOradores() throws SQLException {
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
    }
}
