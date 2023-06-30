/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.bsasconf.oradores;

import com.cac.bsasconf.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Moradan
 */
public class ModeloOradores {

    public ArrayList<Orador> getOradores() throws SQLException {
        ArrayList<Orador> listaOradores = new ArrayList();
        
        Conexion.getConnection();
        
        return listaOradores;
    }
}
