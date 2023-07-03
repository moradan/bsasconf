<!DOCTYPE html>
<html lang="es">

<head>
    <jsp:include page="./WEB-INF/componentes/head.jsp"/>
</head>

<body>
    <!-- Barra de tí­tulo y navegación -->
    <jsp:include page="./WEB-INF/componentes/barra_navegacion.jsp"/>

    <!-- Cuerpo principal para registrar la compra de tickets-->
    <jsp:include page="./WEB-INF/compra/cuerpo_compra.jsp"/>
    
    <!-- Pie con vinculos a otros recursos -->
    <jsp:include page="./WEB-INF/componentes/pie_pagina.jsp"/>
    
    <script src="./js/compra.js"></script>
    <script src="./js/clase-senialador.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>