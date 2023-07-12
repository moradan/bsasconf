<article id="anotarse" class="container-fluid destino-nav text-center mb-5">
    <div class="mb-2">
        <header class="titulo-seccion">
            <h2 class="mb-3">orador</h2>
            <p class="volanta">conviértete en un</p>
        </header>
        <span>Anótate como orador para dar una <em>charla ignite</em>.¡Cuéntanos de qué quieres hablar!</span>
    </div>
    <div class="row g-0">
        <div class="col-12 col-md-10 col-lg-6 mx-auto">
            <!-- formulario -->
            <jsp:include page="../componentes/forumulario_orador.jsp">
                <jsp:param name="accion" value="agregar"/>
            </jsp:include>
            <div class="row text-start">
                <p class="fs-6 mb-3 text-secondary-emphasis">Recuerda incluir un tí­tulo para tu charla.</p>
            </div>
            <jsp:include page="../componentes/botones_agregar_orador.jsp"/>
        </div>
    </div>
</article>