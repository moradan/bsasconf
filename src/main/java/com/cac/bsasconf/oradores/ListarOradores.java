package com.cac.bsasconf.oradores;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ListarOradores", urlPatterns = "/listarOradores")
public class ListarOradores extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ModeloMySql modelo = new ModeloMySql();
        req.setAttribute("listaOradores", modelo.getOradores());
        req.getRequestDispatcher("./WEB-INF/lista_oradores.jsp").forward(req, resp);
    }
}
