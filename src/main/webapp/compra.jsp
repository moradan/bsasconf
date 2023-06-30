<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>Codo a Codo</title>
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
    <!-- Barra de t��tulo y navegaci�n -->
    <jsp:include page="./WEB-INF/componentes/barra_navegacion.jsp"/>

    <!-- Cuerpo principal para registrar la compra de tickets-->
    <jsp:include page="./WEB-INF/compra/cuerpo_compra.jsp"/>
    
    <!-- Pie con vinculos a otros recursos -->
    <jsp:include page="./WEB-INF/componentes/pie_pagina.jsp"/>
    
    <script src="./js/compra.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>