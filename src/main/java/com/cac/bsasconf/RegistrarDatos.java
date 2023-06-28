package com.cac.bsasconf;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ValidationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

@WebServlet(name="registrarDatos", urlPatterns = "/registrarDatos")
public class RegistrarDatos extends HttpServlet {
    
    final double PRECIO_BASE = 200.0;
    HashMap<String, Double> descuentos = new HashMap();
    HashMap<String, String> parametros = new HashMap();
    int cantidad;
    
    public RegistrarDatos() {
        this.descuentos.put("estudiante", 0.8);
        this.descuentos.put("trainee", 0.5);
        this.descuentos.put("junior", 0.15);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        PrintWriter salida = resp.getWriter();
        String mensaje = "";
        
        cargarParametros(req);
        */
        
        /* Este bloque if genera los datos que se van a mostrar en la pagina que se le sirva al cliente
        Tambien se debe determinar si se le va a servir nuevamente el formulario para corregir errores
        o si se le va a servir una pagina con la confirmacion de la compra.
        */
        /*
        ArrayList<String> errores = validarDatos();
        if(errores.isEmpty()) {
            double precioTotal = calcularPrecio();
            mensaje = "Precio total: " + String.format("%,.2f", precioTotal);
        } else {
            for (String error : errores) {
                mensaje += error + "\n";
            }
        }
        */
  
        // Esta linea debe ser reemplazada por el forward al jsp que construya la pagina correcta
        //salida.println(mensaje);
        int cantidadEntradas = Integer.parseInt(String.join("", req.getParameterValues("campoCantidad")));
        int cantidadAcompaniantes = cantidadEntradas - 1;
        String mensajeAcompaniantes = cantidadAcompaniantes == 0 ? "sin " : "con " + cantidadAcompaniantes;
        req.setAttribute("cantidadAcompaniantes", cantidadAcompaniantes);
        req.setAttribute("mensajeAcompaniantes", mensajeAcompaniantes);
        req.getRequestDispatcher("./WEB-INF/confirmacion_compra.jsp").forward(req, resp);
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
