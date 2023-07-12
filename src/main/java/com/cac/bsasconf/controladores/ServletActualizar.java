package com.cac.bsasconf.controladores;

import com.cac.bsasconf.modelo.ModeloMySql;
import com.cac.bsasconf.modelo.Orador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="actualizar", urlPatterns = "/actualizar")
public class ServletActualizar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Leo los datos que se deben actualizar en la base de datos.
        String nombre = req.getParameter("campoNombre");
        String apellido = req.getParameter("campoApellido");
        String charla = req.getParameter("campoCharla");
        int id = Integer.parseInt(req.getParameter("id"));
        
        Orador oradorParaActualizar = new Orador(id, nombre, apellido, charla, "");
        
        // Comunicarse con el modelo para escribir en base de datos.
        // el metodo updateOrador va a comprobar si el orador existe, hace update en caso positivo, y agregarlo en caso negativo.
        ModeloMySql modelo = new ModeloMySql();
        modelo.updateOrador(oradorParaActualizar);
        
        //Mostrar la pagina de confirmacion de actualizacion.
        req.getRequestDispatcher("./WEB-INF/confirmacion_actualizar_orador.jsp").forward(req, resp);
    }
}
