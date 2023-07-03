package com.cac.bsasconf;

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
    
    private double calcularPrecio() throws ValidationException {
        String categoria = parametros.get("campoCategoria");
        double descuento = descuentos.get(categoria);
        double precio = 0;
        
        if (cantidad > 0) {
            precio = PRECIO_BASE * cantidad * (1 - descuento);
        } else {
            throw new ValidationException("Se ingreso un valor no mayor que cero. Cantidad debe ser mayor que cero.");
        }
        
        return precio;
    }

    private void cargarParametros(HttpServletRequest req) {
        Enumeration<String> nombresParametros  = req.getParameterNames();

        /*
        TODO parametros tiene que ser una clase abstracta que define un metodo para validar.
        Tienen que derivarse clases con implementaciones especificas del metodo validar.
        Debe existir una forma de indicar en html que tipo de campo es para determinar que clase
        derivada de parametro se debe instanciar.
        */
        while (nombresParametros.hasMoreElements()) {            
            String nombre = nombresParametros.nextElement();
            String valor = String.join("", req.getParameterValues(nombre));
            this.parametros.put(nombre, valor);
        }
    }

    private ArrayList<String> validarDatos() {
        ArrayList<String> errores = new ArrayList();
        
        try {
            cantidad = Integer.parseInt(parametros.get("campoCantidad"));
        } catch (NumberFormatException error) {
            errores.add("La cantidad de entradas no es un numero entero.");
        }
        
        /* TODO diseniar una clase abstracta que defina un metodo para validar cada campo y un metodo para
        generar los mensajes de error y este bloque se reduzca a un bucle que llame a esos dos metodos para
        cada campo del formulario.
        */
        if (parametros.get("campoNombre").equals("")) {errores.add("No ingreso un nombre.");}
        if (parametros.get("campoApellido").equals("")) {errores.add("No ingreso apellido.");}
        if (parametros.get("campoEmail").equals("")) {errores.add("No ingreso email.");}
        if (parametros.get("campoCantidad").equals("")) {errores.add("No ingreso cantidad");}
        if (parametros.get("campoCategoria").equals("")) {errores.add("No ingreso una categoria");}
        
        return errores;
    }
}
