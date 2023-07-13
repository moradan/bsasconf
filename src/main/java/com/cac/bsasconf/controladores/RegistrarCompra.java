package com.cac.bsasconf.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="registrarCompra", urlPatterns = "/registrarCompra")
public class RegistrarCompra extends HttpServlet {
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cantidadEntradas = Integer.parseInt(String.join("", req.getParameterValues("campoCantidad")));
        int cantidadAcompaniantes = cantidadEntradas - 1;
        String mensajeAcompaniantes = cantidadAcompaniantes == 0 ? "sin " : "con " + cantidadAcompaniantes;
        req.setAttribute("cantidadAcompaniantes", cantidadAcompaniantes);
        req.setAttribute("mensajeAcompaniantes", mensajeAcompaniantes);
        req.getRequestDispatcher("./WEB-INF/confirmar_compra.jsp").forward(req, resp);
    }
}
