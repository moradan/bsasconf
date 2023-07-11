package com.cac.bsasconf.login;

import com.cac.bsasconf.modelo.UsuarioDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="ServletLogin", urlPatterns={"/login"})
public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destino = req.getParameter("destino");
        String id = req.getParameter("id");
        String accion = req.getParameter("accion");
        req.setAttribute("destino", destino);
        req.setAttribute("id", id);
        req.setAttribute("accion", accion);
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreUsuario = req.getParameter("campoUsuario");
        String password = req.getParameter("campoPassword");
        UsuarioDTO usuario = new UsuarioDTO(nombreUsuario, password);
        
        if(usuario.autenticar()){
            String destino = req.getParameter("destino");
            HttpSession session = req.getSession(); 
            session.setMaxInactiveInterval(60);
            session.setAttribute("usuarioLogueado", usuario);
            
            String id = req.getParameter("id");
            String accion = req.getParameter("accion");
            String queryString = "?id=" + id + "&accion=" + accion;
            resp.sendRedirect(req.getContextPath() + destino + queryString);
            
        } else {
            req.setAttribute("huboError", true);
            doGet(req, resp);
        }
    }
}
