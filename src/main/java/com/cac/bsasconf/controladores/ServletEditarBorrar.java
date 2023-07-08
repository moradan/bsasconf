package com.cac.bsasconf.controladores;

import com.cac.bsasconf.modelo.ModeloMySql;
import com.cac.bsasconf.modelo.Orador;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "editarBorrar", urlPatterns = "/editarBorrar")
public class ServletEditarBorrar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bandera = req.getParameter("campoBandera");
        ModeloMySql modelo = new ModeloMySql();
        String id = req.getParameter("campoId");
        
        Orador oradorObjetivo = modelo.getOrador(Integer.parseInt(id));
        
        req.setAttribute("oradorObjetivo", oradorObjetivo);
        req.getRequestDispatcher("./WEB-INF/" + bandera + "_orador.jsp").forward(req, resp);
    }
}
