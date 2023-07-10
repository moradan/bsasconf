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
        String origen = req.getParameter("origen");
        req.setAttribute("origen", origen);
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreUsuario = req.getParameter("campoUsuario");
        String password = req.getParameter("campoPassword");
        UsuarioDTO usuario = new UsuarioDTO(nombreUsuario, password);
        
        if(usuario.autenticar()){
            String destino = req.getParameter("origen");
            HttpSession session = req.getSession(); 
            session.setMaxInactiveInterval(60);
            session.setAttribute("usuarioLogueado", usuario);

            resp.sendRedirect(req.getContextPath() + destino);
        } else {
            req.setAttribute("huboError", true);
            doGet(req, resp);
        }
    }
}
