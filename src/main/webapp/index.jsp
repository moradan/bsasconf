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
        <header id="conferencia" class="container-fluid destino-nav position-relative mb-5 p-0">
            <div>
                <img class="img-fluid" src="./img/ba1.jpg" alt="foto de buenos aires">
            </div>
            <div class="superpuesto container-fluid d-flex flex-row align-items-center bg-dark bg-opacity-75 text-white p-0">
                <div class="row justify-content-end g-0">
                    <div class="col-11 col-md-6 col-lg-4 my-3 me-3 me-md-5">
                        <h2 class="text-end">Conf Bs As</h2>
                        <p class="text-end">
                            Bs As llega por primera vez a Argentina. Un evento para compartir con nuestra comunidad el conocimiento y experiencia de los expertos que estÃ¡n creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y los oradores de primer nivel que tenemos para ti.
                        </p>
                        <p class="text-end">¡Te esperamos!</p>
                        <div class="d-flex justify-content-end">
                            <a href="./compra.html" class="btn btn-success">Comprar tickets</a>
                            <a href="#anotarse" class="btn btn-outline-light ms-3">Quiero ser orador</a>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        
        <!-- Breve reseñ±a de los oradores de alto nivel -->
        <article id="oradores" class="container-fluid destino-nav mb-5 pt-2">
            <header class="titulo-seccion">
                <h2 class="mb-3">oradores</h2>
                <p class="volanta">conoce a los</p  >
            </header>
            <section class="row justify-content-center g-0">
                <div class="col-12 col-sm-11 col-md-10">
                    <ul id="lista-oradores" class="container-fluid row gx-4 list-unstyled">
                        <li id="orador-1" class="col-lg-4 mb-5">
                            <div class="card">
                                <img
                                    class="card-img-top rounded mb-3"
                                    src="./img/steve-big.jpg"
                                    alt="foto de Steve Jobs">
                                <div class="card-body">
                                    <div class="mb-1">
                                        <span class="bg-warning text-black badge">JavaScript</span>
                                        <span class="bg-primary badge">React</span>
                                    </div>
                                    <h3 class="cart-title mb-2">Steve Jobs</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et laudantium reiciendis corrupti id dolor eligendi temporibus error ipsa doloremque tenetur porro, ullam eum? Dignissimos unde enim quas! Quis, sunt provident.
                                    Minus nobis eveniet id eligendi totam, repellat nemo sed nostrum cumque nam suscipit omnis alias accusantium hic iure voluptate doloribus. Consequatur molestiae nemo, eveniet sint placeat debitis facilis rem impedit!</p>
                                </div>
                            </div>
                        </li>
                        <li id="orador-2" class="col-lg-4 mb-5">
                            <div class="card">
                                <img
                                    class="card-img-top rounded mb-3"
                                    src="./img/bill.jpg"
                                    alt="foto de Bill Gates">
                                <div class="card-body">
                                    <div class="mb-1">
                                        <span class="bg-warning text-black badge">JavaScript</span>
                                        <span class="bg-primary badge">React</span>
                                    </div>
                                    <h3 class="card-title mb-2">Bill Gates</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et laudantium reiciendis corrupti id dolor eligendi temporibus error ipsa doloremque tenetur porro, ullam eum? Dignissimos unde enim quas! Quis, sunt provident.
                                    Minus nobis eveniet id eligendi totam, repellat nemo sed nostrum cumque nam suscipit omnis alias accusantium hic iure voluptate doloribus. Consequatur molestiae nemo, eveniet sint placeat debitis facilis rem impedit!</p>
                                </div>
                            </div>
                        </li>
                        <li id="orador-3" class="col-lg-4 mb-5">
                            <div class="card">
                                <img
                                    class="card-img-top rounded mb-3"
                                    src="./img/ada.jpeg"
                                    alt="foto de Ada Lovelace">
                                <div class="card-body">
                                    <div class="mb-1">
                                        <span class="bg-secondary badge">Negocios</span>
                                        <span class="bg-danger badge">Startups</span>
                                    </div>
                                    <h3 class="card-title mb-2">Ada Lovelace</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et laudantium reiciendis corrupti id dolor eligendi temporibus error ipsa doloremque tenetur porro, ullam eum? Dignissimos unde enim quas! Quis, sunt provident.
                                    Minus nobis eveniet id eligendi totam, repellat nemo sed nostrum cumque nam suscipit omnis alias accusantium hic iure voluptate doloribus. Consequatur molestiae nemo, eveniet sint placeat debitis facilis rem impedit!</p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </section>
        </article>

        <!-- Información sobre la locación y la fecha de la conferencia -->
        <article id="locacion" class="container-fluid destino-nav row clearfix m-0 p-0 mb-5">
            <img src="./img/honolulu.jpg" alt="foto de honolulu" class="img-fluid p-0 col-12 col-lg-6">
            <section class="bg-dark text-white p-3 col-12 col-lg-6">
                <h2>Bs As - Octubre</h2>
                <p>Buenos Aires es la provincia y la localidad más grande del estado de Argentina, en los Estados Unidos. Honolulu es la más sureña de entre las principales ciudades estadounidenses. Aunque el nombre de Honolulu se refiere al área urbana en la costa sureste de la isla de Oahu, la ciudad y el condado de Honolulu han formado una ciudad-condado consolidada que cubre toda la ciudad (aproximadamente 600 km<sup>2</sup> de superficie).</p>
                <a class="btn btn-outline-light">Conocé más</a>
            </section>
        </article>

        <!-- Formulario para inscribirse como orador -->
        <article id="anotarse" class="container-fluid destino-nav text-center mb-5">
            <div class="mb-2">
                <header class="titulo-seccion">
                    <h2 class="mb-3">orador</h2>
                    <p class="volanta">conviértete en un</p>
                </header>
                <span>Anótate como orador para dar una <em>charla ignite</em>.¡Cuéntanos de qué quieres hablar!</span>
            </div>
            <form class="row g-0" action="agregarOrador">
                <div class="col-12 col-md-10 col-lg-6 mx-auto">
                    <form class="container-fluid">
                        <div class="row">
                            <div class="col-12 col-md-6 mb-2">
                                <input type="text" class="form-control" id="campo-nombre" placeholder="Nombre" required>
                            </div>
                            <div class="col-12 col-md-6 mb-2">
                                <input type="text" class="form-control col-12 col-md-6 mb-2" id="campo-apellido" placeholder="Apellido" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12 mb-2"><textarea class="form-control mb-2" id="campo-charla" cols="30" rows="6" placeholder="¿Sobre qué quieres hablar?" required></textarea></div>
                        </div>
                        <div class="row text-start">
                            <label class="fs-6 mb-3 text-secondary-emphasis">Recuerda incluir un tí­tulo para tu charla.</label>
                        </div>
                        <div class="row text-center">
                            <div class="col-12">
                                <button type="submit" class="btn btn-success w-100">Enviar</a>
                            </div>
                        </div>
                    </form>
                </div>
            </form>
        </article>
    </main>
    
    <!-- Pie con vinculos a otros recursos -->
    <jsp:include page="./WEB-INF/componentes/pie_pagina.jsp"/>

    <!-- Scripts -->
    <script src="./js/clase-senialador.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>
