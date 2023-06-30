/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.bsasconf;




import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Moradan
 */
public class Conexion {
    private static final String URL_DB = "jdbc:mysql://root:Rod.Gim23@localhost:3306/bsasconf?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static BasicDataSource fuenteDatos;
    
    public Conexion() {
    }
    
    private static DataSource getFuenteDatos() {
        if (fuenteDatos == null) {
            try {
                fuenteDatos = new BasicDataSource();
                fuenteDatos.setUrl(URL_DB);
                fuenteDatos.setInitialSize(50);
            } catch (Exception ex) {
                throw new RuntimeException("La conexion tiro un error", ex);
            }
        }
        
        return fuenteDatos;
    }
    
    public static Connection getConnection() throws SQLException {
        return getFuenteDatos().getConnection();
    }
}
