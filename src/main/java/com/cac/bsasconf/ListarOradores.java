package com.cac.bsasconf;

import com.cac.bsasconf.oradores.ModeloOradores;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;

@WebServlet(name = "ListarOradores", urlPatterns = {"/listarOradores"})
public class ListarOradores extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ModeloOradores modelo = new ModeloOradores();
        req.setAttribute("listaOradores", modelo.getOradores());
        req.getRequestDispatcher("./WEB-INF/lista_oradores.jsp").forward(req, resp);
    }
}
