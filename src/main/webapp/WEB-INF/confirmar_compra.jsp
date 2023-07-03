<%-- 
    Document   : confirmacion_compra
    Created on : Jun 28, 2023, 1:01:09 PM
    Author     : Moradan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Compra Realizada</title>
        <link rel="shortcut icon" href="./img/codoacodo.png" type="image/x-icon" />

        <!-- Bootstrap CDN -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
            crossorigin="anonymous"/>

        <!-- Estilo propio -->
        <link rel="stylesheet" href="./css/estilo.css"/>
    </head>
    
    <body>
        <jsp:include page="./componentes/barra_navegacion.jsp"/>
        
        <jsp:include page="./compra/cuerpo_confirmacion_compra.jsp"/>
        
        <jsp:include page="./componentes/pie_pagina.jsp"/>
        
        <!-- javascript de BootStrap -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    </body>
</html>
