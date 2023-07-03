package com.cac.bsasconf.oradores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name="agregarOrador", urlPatterns = "/agregarOrador")
public class AgregarOrador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        String hoy = formateador.format(fecha).toString();
        
        // Comunicarse con el modelo para escribir en base de datos.
        
        req.setAttribute("fechaAlta", hoy);
        req.getRequestDispatcher("./WEB-INF/confirmar_orador.jsp").forward(req, resp);
    }
}
