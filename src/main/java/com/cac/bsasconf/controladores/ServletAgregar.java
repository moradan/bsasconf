package com.cac.bsasconf.controladores;

import com.cac.bsasconf.modelo.ModeloMySql;
import com.cac.bsasconf.modelo.Orador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name="agregar", urlPatterns = "/agregar")
public class ServletAgregar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Creo y leo los datos que se deben agregar a la base de datos.
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        String hoy = formateador.format(fecha);
        String nombre = req.getParameter("campoNombre");
        String apellido = req.getParameter("campoApellido");
        String charla = req.getParameter("campoCharla");
        
        Orador oradorParaAgregar = new Orador(0, nombre, apellido, charla, hoy);
        
        // Comunicarse con el modelo para escribir en base de datos.
        // el metodo updateOrador va a comprobar si el orador existe, hace update en caso positivo, y agregarlo en caso negativo.
        ModeloMySql modelo = new ModeloMySql();
        modelo.addOrador(oradorParaAgregar);
        
        // el id se pasa para que la pagina de confirmacion decida si el boton ok regresa a index o a lista de oradores.
        // la fecha de hoy no forma parte del formulario, se crea aqui en el servlete de modo que hay que pasarla manualmente
        req.setAttribute("fechaAlta", hoy);
        req.getRequestDispatcher("./WEB-INF/confirmacion_agregar_orador.jsp").forward(req, resp);
    }
}
