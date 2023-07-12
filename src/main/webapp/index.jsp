<!DOCTYPE html>
<html lang="es">

<head>
    <jsp:include page="./WEB-INF/componentes/head.jsp"/>
</head>

<body>
    <jsp:include page="./WEB-INF/componentes/barra_navegacion.jsp"/>
    
    <!-- Cuerpo principal de la página -->
    <main>
        <!-- Presentacion y descripcion de la conferencia -->
        <jsp:include page="./WEB-INF/index/articulo_cabecera.jsp"/>
        
        <!-- Breve reseñ±a de los oradores de alto nivel -->
        <jsp:include page="./WEB-INF/index/articulo_oradores.jsp"/>
        
        <!-- Información sobre la locación y la fecha de la conferencia -->
        <jsp:include page="./WEB-INF/index/articulo_locacion.jsp"/>
        
        <!-- Formulario para inscribirse como orador -->
        <jsp:include page="./WEB-INF/index/articulo_anotarse.jsp"/>
    </main>
    
    <!-- Pie con vinculos a otros recursos -->
    <jsp:include page="./WEB-INF/componentes/pie_pagina.jsp"/>

    <!-- Scripts -->
    <script src="./js/clase-senialador.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>
