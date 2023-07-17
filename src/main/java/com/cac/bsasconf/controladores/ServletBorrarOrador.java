/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.bsasconf.controladores;

import com.cac.bsasconf.modelo.ModeloMySql;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Moradan
 */
@WebServlet(name = "borrar", urlPatterns = "/borrar")
public class ServletBorrarOrador extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ModeloMySql modelo = new ModeloMySql();
        int id = Integer.parseInt(req.getParameter("id"));
        modelo.removeOrador(id);
        req.getRequestDispatcher("/listarOradores").forward(req, resp);
    }
}
