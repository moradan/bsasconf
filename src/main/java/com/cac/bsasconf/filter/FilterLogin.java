package com.cac.bsasconf.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName="filtroLogin", urlPatterns={"/listarOradores", "/borrar", "/actualizar"})
public class FilterLogin implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) sr;
        HttpSession sesion = httpRequest.getSession();

        if (sesion != null && sesion.getAttribute("usuarioLogueado") != null) {
            fc.doFilter(sr, sr1);
        } else {
            String destino = httpRequest.getServletPath();
            String queryString = "?destino=" + destino;
            sr.getRequestDispatcher("/login" + queryString).forward(sr, sr1);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
