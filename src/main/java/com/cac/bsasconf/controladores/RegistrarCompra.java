package com.cac.bsasconf.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ValidationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

@WebServlet(name="registrarCompra", urlPatterns = "/registrarCompra")
public class RegistrarCompra extends HttpServlet {
    
    final double PRECIO_BASE = 200.0;
    HashMap<String, Double> descuentos = new HashMap();
    HashMap<String, String> parametros = new HashMap();
    int cantidad;
    
    public RegistrarCompra() {
        this.descuentos.put("estudiante", 0.8);
        this.descuentos.put("trainee", 0.5);
        this.descuentos.put("junior", 0.15);
    }
    
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
