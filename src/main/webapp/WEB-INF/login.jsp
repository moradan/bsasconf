<!DOCTYPE html>
<html lang="es">

<head>
    <jsp:include page="./componentes/head.jsp"/>
</head>

<body>
    
    <!-- Barra de t��tulo y navegaci�n -->
    <jsp:include page="./componentes/barra_navegacion.jsp"/>

    <!-- Cuerpo de la pagina de login -->
    <jsp:include page="./login/cuerpo_login.jsp"/>
    
    <!-- Pie con vinculos a otros recursos -->
    <jsp:include page="./componentes/pie_pagina.jsp"/>
    
    <!-- Scripts -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>

</html>