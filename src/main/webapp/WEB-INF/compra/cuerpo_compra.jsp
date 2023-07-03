<main id="compra" class="container-fluid destino-nav mt-5 pt-3 pt-md-5">
    <div class="row g-0 justify-content-center">
        <div class="col-12 col-md-10 col-lg-8 col-xl-7">
            <!-- Titulo y los descuentos -->
            <header class="row g-0 justify-content-center">
                <!-- Banner de descuentos -->
                <div class="row g-2 gx-md-3 justify-content-between align-items-betweeen">
                    <div class="col-12 col-md-4">
                        <div class="border border-primary p-3 d-flex flex-column align-items-center">
                            <h2 class="fs-5 fw-bold">Estudiante</h2>
                            <p>Tiene un descuento</p>
                            <p class="fw-bold">80%</p>
                            <footer class="text-muted fs-7">* presentar documentación</footer>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 ">
                        <div class="p-3 d-flex flex-column align-items-center border border-info">
                            <h2 class="fs-5 fw-bold">Trainee</h2>
                            <p>Tiene un descuento</p>
                            <p class="fw-bold">50%</p>
                            <footer class="text-muted fs-7">* presentar documentación</footer>
                        </div>
                    </div>
                    <div class="col-12 col-md-4">
                        <div class="p-3 d-flex flex-column align-items-center border border-warning">
                            <h2 class="fs-5 fw-bold">Junior</h2>
                            <p>Tiene un descuento</p>
                            <p class="fw-bold">15%</p>
                            <footer class="text-muted fs-7">* presentar documentación</footer>
                        </div>
                    </div>
                </div>
                <!-- Titulo de la seccion -->
                <section class="titulo-seccion col-10">
                    <h2 class="mb-3">valor del ticket $200</h2>
                    <p class="volanta">venta</p  >
                </section>
            </header>
            
            <!-- Formulario de presupuesto de compra de tickets-->
            <section  class="container-fluid row justify-content-center g-0 gx-2 mb-5">
                <form action="registrarCompra">
                    <!-- Nombre -->
                    <div class="row g-3 mb-3 justify-content-center">
                        <div class="col-12 col-md-6">
                            <input class="form-control" type="text" name="campoNombre" id="campoNombre" placeholder="Nombre" required>
                        </div>
                        <div class="col-12 col-md-6">
                            <input class="col-12 col-md-6 form-control" type="text" name="campoApellido" id="campoApellido" placeholder="Apellido" required>
                        </div>
                    </div>
                    <!-- Correo -->
                    <div class="row g-3 mb-2">
                        <div class="col-12">
                            <input type="email" class="col-12 form-control" name="campoEmail" id="campoEmail" placeholder="correo@electronico.com" required>
                        </div>
                    </div>
                    <!-- Cantidad y categoria-->
                    <div class="row g-3 mb-3">
                        <div class="col-12 col-md-6">
                            <label for="campoCantidad">Cantidad</label>
                            <input id="campoCantidad" type="number" min="1" value="1" class="col-12 col-md-6 form-control" name="campoCantidad" placeholder="cantidad" required>
                        </div>
                        <div class="col-12 col-md-6">
                            <label for="campoCategoria">Categoria</label>
                            <select id="campoCategoria" class="col-12 col-md-6 form-control" name="campoCategoria" required>
                                <option value="estudiante">Estudiante</option>
                                <option value="trainee">Trainee</option>
                                <option value="junior">Junior</option>
                            </select>
                        </div>
                    </div>
                    <!-- Resumen -->
                    <div class="row justify-content-between bg-info-subtle border border-info-subtle text-primary-dark border border-info rounded g-0 p-3 mb-3">
                        <div class="col-6">
                            Total a pagar:
                        </div>
                        <div id="campoTotal" class="col-6 text-end"></div>
                    </div>
                    <!-- Botones-->
                    <div class="row g-3">
                        <div class="col-12 col-md-6">
                            <button id="botonReset" class="btn btn-success form-control" type="reset">Borrar</button>
                        </div>
                        <div class="col-12 col-md-6">
                            <button id="botonComprar" class="btn btn-success form-control" type="submit">Comprar</button>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</main>