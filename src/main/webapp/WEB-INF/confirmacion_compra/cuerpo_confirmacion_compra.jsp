<!-- allows use of java standard tags library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!-- Cuerpo principal de la confirmacion de la compra donde se muestran los datos de los tiquets -->
<main class="container-fluid mt-5 mb-5 pt-3 pt-md-5">
    <!-- centrar contenido -->
    <div class="row g-0 justify-content-center">
        <div class="col-12 col-md-10 col-lg-8 col-xl-7">
            <!-- tarjeta que representa el ticket -->
            <section class="card shadow mb-5">
                <div class="card-body p-5">
                    <div class="card-title fs-2 fw-bold text-uppercase text-center">
                        Ticket de entrada para Bs As Conf 2023
                    </div>
                    <div class="card-text fs-6 fw-bold text-center mb-3">
                        <p>
                            Titular: ${param.campoNombre} ${param.campoApellido}                         
                        </p>
                        <p>
                            Acompañantes: ${cantidadAcompaniantes}
                        </p>
                        <p>
                            Tipo: ${param.campoCategoria}
                        </p>
                    </div>
                    <div>
                        <p>
                            Este ticket otorga al Sr. ${param.campoNombre} ${param.campoApellido} el acceso a la conferencia Bs As Conf 2023 ${mensajeAcompaniantes} acompañante${cantidadAcompaniantes != 1 ? "s" : ""}.
                        </p>
                        <p>
                            Este acceso es solo para ${param.campoCategoria}: tanto el titular como cada acompañante deberan presentar acreditación
                            en la entrada al predio.
                        </p>
                        <p>
                            Que disfruten de la conferencia.
                        </p>
                    </div>
                </div>
            </section>
            
            <!-- botones -->
            <section class="row gx-3 justify-content-between">
                <div class="col-6">
                    <button id="botonVolver" class="btn btn-success form-control" type="button">Volver</button>
                </div>
                <div class="col-6">
                    <button id="botonDescargar" class="btn btn-success form-control" type="button">Descargar</button>
                </div>
            </section>
        </div>
    </div>
</main>